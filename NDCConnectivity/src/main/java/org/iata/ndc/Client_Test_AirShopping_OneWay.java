package org.iata.ndc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.util.GregorianCalendar;
import java.util.Optional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.iata.oo.builder.AirShoppingRQBuilder;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class Client_Test_AirShopping_OneWay {

	public static void main(String args[]) throws IOException {
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent("TestClient").build();

		try {
			XMLGregorianCalendar departureDate = getXMLGregorianCalendarDate(2019, 3, 26);
			String departureCode = "LHR";
			String arrivalCode = "DXB";
			AirShoppingRQ airShoppingRQ = getAirShoppingRQ_OneWay(departureDate, departureCode, arrivalCode);

			String xmlObject = jaxbObjectToXML(airShoppingRQ).replaceAll("2017.1", "2017.2");
			System.out.println(xmlObject);

			HttpPost request = prepareRequest(xmlObject);
			HttpResponse response = httpClient.execute(request);

			readTheResponse(response);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			httpClient.close();
		}
	}

	private void getAirShoppingRS(HttpResponse response) throws IOException, JAXBException {
		String xmlResponse = EntityUtils.toString(response.getEntity()).replaceAll("2017.2", "2017.1");
		JAXBContext jaxbContext =JAXBContext.newInstance(AirShoppingRQ.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			InputSource isource = new InputSource(new StringReader(xmlResponse));
		
		AirShoppingRQ responseAirShoppingRQ = (AirShoppingRQ) jaxbUnmarshaller.unmarshal(isource);
		System.out.println(responseAirShoppingRQ.toString());
	}
	
	private static AirShoppingRQ getAirShoppingRQ_OneWay(XMLGregorianCalendar departureDate, String departureCode,
			String arrivalCode) {
		
		AirShoppingRQ airShoppingRQ = new AirShoppingRQBuilder()
				.addDocument()
				.addParty()
				.changeHeader()
				.addCoreQueryOneWay(departureCode, departureDate, arrivalCode)
				.addDataList()
				.addPreference().build();
		
		return airShoppingRQ;
	}

	private static HttpPost prepareRequest(String xmlObject) throws UnsupportedEncodingException {
		String api_key = "ne9zq57kbpvaut4z9xxm3aqc";
		String apiEndPoint = "http://iata.api.mashery.com/Zeus/NDC";

		HttpPost request = new HttpPost(apiEndPoint);

		request.addHeader("content-type", "application/xml;charset=utf-8");
		request.addHeader("Authorization-Key", api_key);

		StringEntity params = new StringEntity(xmlObject);
		request.setEntity(params);
		return request;
	}

	private static void readTheResponse(HttpResponse response)
			throws IllegalStateException, IOException, ParserConfigurationException, SAXException {
	
		System.out.println("Received Response to request:");
		String responseEntity = EntityUtils.toString(response.getEntity());
		System.out.println(responseEntity.toString());
		
		// Use SAX to parse the document
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputSource isource = new InputSource(new StringReader(responseEntity));

		Document doc = builder.parse(isource);

		System.out.println("Selecting 1st offer");
		dumpChildren(doc.getElementsByTagName("Offer").item(0));
	}

	private static XMLGregorianCalendar getXMLGregorianCalendarDate(int year, int month, int date) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(year, (month - 1), date);
		XMLGregorianCalendar departureDate = null;
		try {
			departureDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// return departureDate != null ? Optional.of(departureDate): Optional.empty();
		return departureDate;
	}

	private static String jaxbObjectToXML(AirShoppingRQ customer) {
		String xmlString = "";
		try {
			JAXBContext context = JAXBContext.newInstance(AirShoppingRQ.class);
			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

			StringWriter sw = new StringWriter();
			m.marshal(customer, sw);
			xmlString = sw.toString();

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		return xmlString;
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