package org.iata.ndc;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.iata.crosscutting.GenericCalendar;
import org.iata.crosscutting.XMLObjectTool;
import org.iata.oo.builder.AirShoppingRQBuilder;
import org.iata.oo.schema.AirShoppingRQ.AirShoppingRQ;

public class Client_Test_AirShopping_OneWay {

	public static void main(String args[]) throws IOException {
		CloseableHttpClient httpClient = HttpClientBuilder.create().setUserAgent("TestClient").build();

		try {
			XMLGregorianCalendar departureDate = GenericCalendar.getXMLGregorianCalendarDate(2019, 3, 23);
			String departureCode = "LHR";
			String arrivalCode = "DXB";
			AirShoppingRQ airShoppingRQ = AirShoppingRQBuilder.buildAirShoppingRQ_OneWay(departureDate, departureCode, arrivalCode);

			String xmlObject = XMLObjectTool.jaxbObjectToXML(airShoppingRQ).replaceAll("2017.1", "2017.2");
			System.out.println(xmlObject);

			HttpPost request = prepareRequest(xmlObject);
			HttpResponse response = httpClient.execute(request);

			XMLObjectTool.printXMLEntity(response.getEntity());
			//AirShoppingRS airShoppingRS=getAirShoppingRS(response.getEntity());
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			httpClient.close();
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

}
