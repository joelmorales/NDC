package org.iata.crosscutting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.iata.oo.builder.AirShopping.AirShoppingRSBuilder;
import org.iata.oo.schema.AirShoppingRS.ALaCarteOfferItemType;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS.DataLists.FlightList.Flight;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS.OffersGroup.AirlineOffers;
import org.iata.oo.schema.AirShoppingRS.ListOfFlightSegmentType;
import org.iata.oo.schema.AirShoppingRS.ServiceDefinitionType;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.google.common.collect.ImmutableMap;

public class ReadResponse {

	public void getFileResponse() throws IOException {
		try {
			InputStreamReader is = new InputStreamReader(ReadResponse.class.getResourceAsStream("/AirShoppingRS.xml"));
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(is);
			String read = br.readLine();

			while (read != null) {
				sb.append(read);
				read = br.readLine();
			}

			// DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			// DocumentBuilder builder = factory.newDocumentBuilder();
			// factory.setNamespaceAware(true);
			// InputSource isource = new InputSource(new StringReader(sb.toString()));

			// Document doc = builder.parse(isource);

			prepareAirShoppingData(sb.toString());

			// dumpChildren(doc.getElementsByTagName("FlightSegment").item(0));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static Map<String, String> airShopping;

	private void prepareAirShoppingData(String xmlFile) throws IOException, JAXBException {
		AirShoppingRS airShoppingRS = AirShoppingRSBuilder.getAirShoppingRS(xmlFile);
		// fillFlightSegmentListDataFetcher(airShoppingRS);
		//fillAlaCarteOffersDataFetcher(airShoppingRS);

	}

	public void fillAlaCarteOffersDataFetcher(AirShoppingRS airSRS) {

		String totalAmount;
		String unitPrice;
		String name;
		String desc;
		String serviceRef;
		String key;
		ServiceDefinitionType serviceDefinitionRef;
		List<Map<String, String>> aLaCarteoffers = new ArrayList<Map<String, String>>();
		List<String> checkList = new ArrayList<>();

		for (AirlineOffers offers : airSRS.getOffersGroup().getAirlineOffers()) {

			for (ALaCarteOfferItemType alaCarte : offers.getALaCarteOffer().getALaCarteOfferItem()) {

				totalAmount = alaCarte.getUnitPriceDetail().getTotalAmount().getSimpleCurrencyPrice().getValue()
						.toString();
				unitPrice = alaCarte.getUnitPriceDetail().getTotalAmount().getSimpleCurrencyPrice().getCode();
				serviceDefinitionRef = (ServiceDefinitionType) alaCarte.getService().getServiceDefinitionRef();
				name = serviceDefinitionRef.getName().getValue();
				desc = serviceDefinitionRef.getDescriptions().getDescription().get(0).getText().getValue();
				serviceRef = serviceDefinitionRef.getServiceDefinitionID().toString();
				System.out.println("serviceDefinition Ref:" + serviceRef + " , Unit:" + unitPrice + " ,Amount:"
						+ totalAmount + " , Name" + name + " , Desc:" + desc);

				for (Object refs : alaCarte.getEligibility().getSegmentRefs().getValue()) {

					ListOfFlightSegmentType type = (ListOfFlightSegmentType) refs;
					key = serviceRef + type.getSegmentKey();

					if (!checkList.contains(key)) {
						System.out.println(" Segments ref:" + type.getSegmentKey());
						checkList.add(key);

						aLaCarteoffers.add(ImmutableMap.of("segmentKey", getValue(refs.toString()), "unitPrice",
								unitPrice, "totalAmount", getValue(totalAmount), "serviceName", getValue(name),
								"description", getValue(desc)));
					}
				}

			}

		}
	}

	public void fillDeparturesListDataFetcher(AirShoppingRS airSRS) {
		for (ListOfFlightSegmentType flight : airSRS.getDataLists().getFlightSegmentList().getFlightSegment()) {
			// flight.getDeparture().getAirportCode()
			// flight.getDeparture().getDate()
			// flight.getDeparture().getTime()
			// flight.getDeparture().getAirportCode()
			System.out.println("Value:" + flight.getSegmentKey());
		}
	}

	public void fillFlightSegmentListDataFetcher(AirShoppingRS airSRS) {
		Map<String, String> map = new HashMap<String, String>();

		// airSRS.getDataLists().getFlightSegmentList().getFlightSegment()

		for (ListOfFlightSegmentType flight : airSRS.getDataLists().getFlightSegmentList().getFlightSegment()) {
			System.out.println("Value:" + flight.getSegmentKey());
		}

	}

	private Map<String, String> fillAirShoppingDataFetcher(AirShoppingRS airSRS) {
		airShopping = new HashMap<String, String>();
		airShopping.put("referenceVersion", getValue(airSRS.getDocument().getReferenceVersion()));
		airShopping.put("shoppingResponseId", getValue(airSRS.getShoppingResponseID().getResponseID().getValue()));

		return Collections.unmodifiableMap(airShopping);
	}

	private void fillFlightSegmentList() {

	}

	private String getValue(String value) {
		return Optional.ofNullable(value).orElse("");
	}

	private static void dumpChildren(Node node) {
		NodeList nl = node.getChildNodes();

		for (int i = 0; i < nl.getLength(); i++) {
			Node n = nl.item(i);

			if (!"#text".equals(n.getNodeName())) {
				StringBuffer sb = new StringBuffer();
				sb.append("Node ").append(n.getNodeName());

				NodeList nl2 = n.getChildNodes();
				int index = 0;
				while (index < nl2.getLength() && !"#text".equals(nl2.item(index).getNodeName()))
					index++;

				if (index < nl2.getLength())
					sb.append(", value = ").append(nl2.item(index).getNodeValue());
				else
					sb.append(", this node has no value");

				NamedNodeMap nnm = n.getAttributes();

				if (nnm != null && nnm.getLength() > 0) {
					sb.append("\nAttributes:\n");

					for (int j = 0; j < nnm.getLength(); j++)
						sb.append(nnm.item(j).toString()).append("\n");
				} else
					sb.append("\nThis node has no attributes\n");

				System.out.println(sb.toString());

				if (n.hasChildNodes())
					dumpChildren(n);
			}
		}
	}

}
