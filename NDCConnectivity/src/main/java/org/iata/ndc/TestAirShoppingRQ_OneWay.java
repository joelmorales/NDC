package org.iata.ndc;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.iata.oo.OoClient;
import org.iata.oo.builder.AirShoppingRQBuilder;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ;

public class TestAirShoppingRQ_OneWay {

	public static void main(String args[])  {
		String api_key = "ne9zq57kbpvaut4z9xxm3aqc";
		String server_url = "http://iata.api.mashery.com/Zeus/NDC";
		String server_getUrl = "http://iata.api.mashery.com/Zeus/OSIN";

		OoClient client = new OoClient(server_url, server_getUrl, api_key);

		GregorianCalendar cal = new GregorianCalendar();
		cal.set(2019, 3, 26);
		XMLGregorianCalendar departureDate=null;
		try {
			departureDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		AirShoppingRQ request = new AirShoppingRQBuilder()
				.addDocument()
				.addParty()
				.addCoreQueryOneWay("LHR", departureDate, "DXB")
				.addDataList()
				.addPreference()
				.build();
				
				//.addOneWay("LHR", departureDate, "DXB").build();

		
		
		AirShoppingRQ response = null;
		try {
			response = client.airShopping(request);
		} catch (Exception e) {
			throw new RuntimeException("A major failure has occurred!", e);
		}

	}

}
