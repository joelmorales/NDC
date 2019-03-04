package org.iata.crosscutting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.bind.JAXBException;

import org.iata.oo.builder.AirShoppingRSBuilder;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS;

public class AirShoppingRQAPI {

	public static AirShoppingRS getStubResponse() {

		try {
			InputStreamReader is = new InputStreamReader(ReadResponse.class.getResourceAsStream("/AirShoppingRS.xml"));
			StringBuilder sb = new StringBuilder();
			BufferedReader br = new BufferedReader(is);
			String read = br.readLine();

			while (read != null) {
				sb.append(read);
				read = br.readLine();
			}

			return prepareAirShoppingData(sb.toString());

		} catch (Exception ex) {
			throw new RuntimeException("Probles: " + ex.toString());
		}
	}

	private static AirShoppingRS prepareAirShoppingData(String xmlFile) throws IOException, JAXBException {
		AirShoppingRS airShoppingRS = AirShoppingRSBuilder.getAirShoppingRS(xmlFile);
		return airShoppingRS;
	}

}
