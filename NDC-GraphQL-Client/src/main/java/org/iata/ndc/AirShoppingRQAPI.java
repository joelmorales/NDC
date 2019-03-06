package org.iata.ndc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.iata.crosscutting.GenericCalendar;
import org.iata.crosscutting.ReadResponse;
import org.iata.crosscutting.XMLObjectTool;
import org.iata.oo.builder.AirShopping.AirShoppingRQBuilder;
import org.iata.oo.builder.AirShopping.AirShoppingRSBuilder;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ;
import org.iata.oo.schema.AirShoppingRS.AirShoppingRS;

public class AirShoppingRQAPI {

	
	
	public static AirShoppingRS getResponse(String departureCode, String date, String arrivalCode ) {
		AirShoppingRS airShoppingRS= new AirShoppingRS();
		
		try(CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent("TestClient").build()) {
			LocalDate localdate = LocalDate.parse(date);
			XMLGregorianCalendar departureDate = GenericCalendar.getXMLGregorianCalendarDate(localdate);
				AirShoppingRQ airShoppingRQ = AirShoppingRQBuilder.buildAirShoppingRQ_OneWay(departureDate, departureCode, arrivalCode);

			String xmlObject = XMLObjectTool.jaxbObjectToXML(airShoppingRQ);
					//.replaceAll("2017.1", "2017.2");
			System.out.println(xmlObject);

			HttpPost request = prepareRequest(xmlObject);
			HttpResponse response = httpClient.execute(request);
			airShoppingRS=AirShoppingRSBuilder.getAirShoppingRS(response.getEntity());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return airShoppingRS;
	}
	
	public static AirShoppingRS getStubResponse(String departureCode, String date, String arrivalCode) {

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
			throw new RuntimeException("Problems: " + ex.toString());
		}
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
	
	private static AirShoppingRS prepareAirShoppingData(String xmlFile) throws IOException, JAXBException {
		AirShoppingRS airShoppingRS = AirShoppingRSBuilder.getAirShoppingRS(xmlFile);
		return airShoppingRS;
	}

}
