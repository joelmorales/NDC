package org.iata.oo.builder;

import java.io.IOException;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS;
import org.xml.sax.InputSource;

public class AirShoppingRSBuilder {

	public static AirShoppingRS getAirShoppingRS(HttpEntity entity) throws IOException, JAXBException {
		String xmlResponse = EntityUtils.toString(entity).replaceAll("2017.2", "2017.1");
		JAXBContext jaxbContext =JAXBContext.newInstance(AirShoppingRS.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			InputSource isource = new InputSource(new StringReader(xmlResponse));
		
		AirShoppingRS responseAirShoppingRS = (AirShoppingRS) jaxbUnmarshaller.unmarshal(isource);
		System.out.println(responseAirShoppingRS.toString());
		return responseAirShoppingRS;
	}
	
	
}
