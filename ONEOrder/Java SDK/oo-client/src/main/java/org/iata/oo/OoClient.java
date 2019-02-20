package org.iata.oo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringWriter;
import javax.xml.bind.*;
import org.apache.http.Consts;
import org.apache.http.HttpResponse;
import org.apache.http.client.fluent.Request;
import org.apache.http.entity.ContentType;
import org.iata.oo.schema.OrderSaleInformationNotificationRQ.IATAOrderSaleInformationNotificationRQ;
import org.iata.oo.schema.ServiceDeliveryRQ.*;
import org.iata.oo.schema.ServiceDeliveryRS.*;
import org.iata.oo.schema.ServiceStatusChangeNotificationRQ.IATAServiceStatusChangeNotificationRQ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * JAXB-based implementation of IATA's One Order standard.
 *
 * This implementation can handle a subset of all One Order calls.
 */
public class OoClient {
	private static final Logger LOG = LoggerFactory.getLogger(OoClient.class);
	/** NDC Client version */
	private static final String VERSION = "0.1.0";
	/** User agent passed to server */
	private static final String USER_AGENT = "NDC Java Wrapper / " + VERSION;
	/** JaxbContext for NDC schema*/
	private static final JAXBContext context = null;
	/** Server URL */
	private final String url;
	/** Server Get URL */
	private final String getUrl;
	/** Authorization key */
	private final String key;
	/** ContentType for the request */
	private final ContentType contentType;

	/**
	 * Creates client for querying a specific OO service endpoint
	 * @param serviceUrl url for OO REST XML service (post)
	 * @param serviceGetUrl url for OO REST XML service (get)
	 * @param authorizationKey authorizationKey for service
	 */
	public OoClient(String serviceUrl, String serviceGetUrl, String authorizationKey) {
		this.url = serviceUrl;
		this.getUrl = serviceGetUrl;
		this.key = authorizationKey;
		this.contentType = ContentType.create(ContentType.APPLICATION_XML.getMimeType(), Consts.UTF_8);
	}

	/**
	 * Sends ServiceDelivery request to server, receives and processes the response.
	 *
	 * Request Object is marshalled into
	 *
	 * @param serviceDeliveryRQ request Object
	 * @return IATAServiceDeliveryRS instance containing the response from server
	 * @throws IOException if error is encountered while processing server response
	 * @throws ClientException if marshalling the request or unmarshalling server response to Java Object fails
	 */
	public IATAServiceDeliveryRS serviceDelivery(IATAServiceDeliveryRQ serviceDeliveryRQ) throws IOException, ClientException {
		return marshalAndSend(serviceDeliveryRQ, "ServiceDelivery");
	}

	/**
	 * Sends ServiceStatusChangeNotification request to server, receives and processes the response.
	 *
	 * Request Object is marshalled into
	 *
	 * @param serviceStatusChangeNotifRQ request Object
	 * @return String instance containing the response from server
	 * @throws IOException if error is encountered while processing server response
	 * @throws ClientException if marshalling the request or unmarshalling server response to Java Object fails
	 */
	public String serviceStatusChangeNotif(IATAServiceStatusChangeNotificationRQ serviceStatusChangeNotifRQ) throws IOException, ClientException {
		return marshalAndSend(serviceStatusChangeNotifRQ);
	}

	/**
	 * Sends a get request for a IATAOrderSaleInformationNotificationRQ to server, receives and processes the response.
	 *
	 * Request Object is marshalled into
	 *
	 * @param urlToken url token to append to the get request
	 * @param method request method name
	 * @return IATAOrderSaleInformationNotificationRQ instance containing the response from server
	 * @throws IOException if error is encountered while processing server response
	 * @throws ClientException if marshalling the request or unmarshalling server response to Java Object fails
	 */
	public IATAOrderSaleInformationNotificationRQ orderSaleInfNotif(String urlToken, String method) throws IOException, ClientException {
		return sendGetRequest(urlToken, method);
	}

	/**
	 * Internal method which is used by all request methods
	 *
	 * @param request request Object
	 * @param method request method name
	 * @return Object instance containing the response from server
	 * @throws IOException if error is encountered while processing server response
	 * @throws ClientException if marshalling the request or unmarshalling server response to Java Object fails
	 */
	private <S, T> S marshalAndSend(T request, String method) throws IOException, ClientException {
		return sendPostRequest(marshallRequest(request), method);
	}

	/**
	 * Internal method which is used by all request methods
	 *
	 * @param request request Object
	 * @return String instance containing the response from server
	 * @throws IOException if error is encountered while processing server response
	 * @throws ClientException if marshalling the request or unmarshalling server response to Java Object fails
	 */
	private <T> String marshalAndSend(T request) throws IOException, ClientException {
		return sendPostRequest(marshallRequest(request));
	}

	/**
	 * Marshals request object into String
	 *
	 * @param request request object
	 * @return marshalled request
	 * @throws ClientException if marshalling the request to XML fails
	 */
	private <T> String marshallRequest(T request) throws ClientException {
		try {
			Marshaller marshaller = getJaxbContext(request.getClass().getSimpleName()).createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			StringWriter writer = new StringWriter();
			marshaller.marshal(request, writer);
			return writer.toString();
		} catch (JAXBException e) {
			throw new ClientException(e);
		}
	}

	/**
	 * Sends request and returns marshalled response Object.
	 *
	 * @param request String containing XML request
	 * @param method request method name
	 * @return Response object returned by sender
	 * @throws IOException if error is encountered while processing server response
	 * @throws ClientException if unmarshalling server response to Java Object fails
	 */
	private <T> T sendPostRequest(String request, String method) throws IOException, ClientException {
		LOG.debug("{} request:\n{}", method, request);
		return Request
				.Post(url)
				.addHeader("Content-type", ContentType.APPLICATION_XML.getMimeType())
				.bodyString(request, contentType)
				.execute()
				.handleResponse(new UnmarshallingResponseHandler<T>(method, true));
	}

	/**
	 * Sends request and returns string response Object.
	 *
	 * @param request String containing XML request
	 * @return String object returned by sender
	 * @throws IOException if error is encountered while processing server response
	 * @throws ClientException if unmarshalling server response to Java Object fails
	 */
	private String sendPostRequest(String request) throws IOException, ClientException {
		HttpResponse response =  Request.Post(url)
				.addHeader("Content-type", ContentType.APPLICATION_XML.getMimeType())
				.bodyString(request, contentType)
				.execute().returnResponse();

		//System.out.println("Response Code : " + response.getStatusLine().getStatusCode());
		BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
		StringBuffer result = new StringBuffer();

		String line = "";
		while ((line = rd.readLine()) != null) result.append(line);

		return result.toString();
	}

	/**
	 * Sends request and returns marshalled response Object.
	 *
	 * @param urlToken String containing the token to be appended in the url of the get request
	 * @param method request method name
	 * @return Response object returned by sender
	 * @throws IOException if error is encountered while processing server response
	 * @throws ClientException if unmarshalling server response to Java Object fails
	 */
	private <T> T sendGetRequest(String urlToken, String method) throws IOException, ClientException {
		return Request
				.Get(getUrl+"/"+urlToken)
				.addHeader("Content-type", ContentType.APPLICATION_XML.getMimeType())
				.execute()
				.handleResponse(new UnmarshallingResponseHandler<T>(method, false));
	}

	/**
	 * Returns JAXBContext for IATA One Order Schema.
	 * Creates the context if it does not exist.
	 *
	 * @return JAXBContext instance representing NDC schema
	 * @throws ClientException if context creation failed.
	 */
	public static JAXBContext getJaxbContext(String messageName) throws ClientException {
		if (context != null) return context;
		try {
			if(messageName.startsWith("IATA"))
				return JAXBContext.newInstance("org.iata.oo.schema."+messageName.substring(4));
			else
				return JAXBContext.newInstance("org.iata.oo.schema."+messageName);
		} catch (JAXBException e) {
			LOG.error("Failure creating JAXB context", e);
			throw new ClientException(e);
		}
	}
}
