package org.iata.crosscutting;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.iata.crosscutting.exception.BussinessLogicException;
import org.iata.crosscutting.exception.EndPointException;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XMLObjectTool {

	public static String jaxbObjectToXML(AirShoppingRQ customer) {
		String xmlString = "";
		try {
			JAXBContext context = JAXBContext.newInstance(AirShoppingRQ.class);
			Marshaller m = context.createMarshaller();

			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

			StringWriter sw = new StringWriter();
			m.marshal(customer, sw);
			xmlString = sw.toString();

		} catch (JAXBException e) {
			throw new BussinessLogicException(e.getMessage());
		}

		return xmlString;
	}
	
	public static void printXMLEntity(HttpEntity entity)
			throws IllegalStateException, IOException, ParserConfigurationException, SAXException {
	
		System.out.println("Received Response to request:");
		String responseEntity = EntityUtils.toString(entity);
		System.out.println(responseEntity.toString());
		
		// Use SAX to parse the document
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		InputSource isource = new InputSource(new StringReader(responseEntity));

		Document doc = builder.parse(isource);

		System.out.println("Selecting 1st offer");
		dumpChildren(doc.getElementsByTagName("Offer").item(0));
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
