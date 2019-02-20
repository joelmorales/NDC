package org.iata.oo;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import javax.xml.bind.*;
import org.iata.oo.schema.OrderSaleInformationNotificationRQ.IATAOrderSaleInformationNotificationRQ;
import org.iata.oo.schema.ServiceDeliveryRQ.IATAServiceDeliveryRQ;
import org.iata.oo.schema.ServiceDeliveryRS.IATAServiceDeliveryRS;
import org.iata.oo.schema.ServiceStatusChangeNotificationRQ.IATAServiceStatusChangeNotificationRQ;
import org.iata.oo.schema.ServiceStatusChangeNotificationRQ.OrderItem;
import org.iata.oo.schema.ServiceStatusChangeNotificationRQ.ServiceDetailType;
import org.iata.oo.builder.ServiceDeliveryRQBuilder;
import org.iata.oo.builder.ServiceStatusChangeNotifRQBuilder;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OoClientIT {
	private static final Logger LOG = LoggerFactory.getLogger(OoClientIT.class);
	private final String server = System.getProperty("server.url");
	private final String getServer = System.getProperty("getserver.url");

	private final String apiKey = System.getProperty("api.key");
	private final OoClient client = new OoClient(server, getServer, apiKey);

	@Test
	public void a_serverIsSet() {
		if (server == null) {
			String msg = "System property server.uri is not set.";
			LOG.error(msg);
			fail(msg);
		}
		if (getServer == null) {
			String msg = "System property getServer.uri is not set.";
			LOG.error(msg);
			fail(msg);
		}
	}

	@Test
	public void b_existingServiceDeliveryRQ() throws JAXBException {
		InputStream is = this.getClass().getResourceAsStream("/Zeus/ServiceDeliveryRQ_order.xml");
		JAXBContext context = JAXBContext.newInstance("org.iata.oo.schema.ServiceDeliveryRQ");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		IATAServiceDeliveryRQ serviceDeliveryRQ =  (IATAServiceDeliveryRQ) unmarshaller.unmarshal(is);

		IATAServiceDeliveryRS response = null;
		try {
			response = client.serviceDelivery(serviceDeliveryRQ);
		} catch (IOException e) {
			LOG.error("Unexpected exception encountered during service call", e);
			fail(e.toString());
		}

		assertNull(response.getError());
		assertNotNull(response.getOrder());
		Printer.printData(response);
	}

	@Test
	public void c_existingServiceDeliveryRQ() throws JAXBException {
		InputStream is = this.getClass().getResourceAsStream("/Zeus/ServiceDeliveryRQ_segment.xml");
		JAXBContext context = JAXBContext.newInstance("org.iata.oo.schema.ServiceDeliveryRQ");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		IATAServiceDeliveryRQ serviceDeliveryRQ =  (IATAServiceDeliveryRQ) unmarshaller.unmarshal(is);

		IATAServiceDeliveryRS response = null;
		try {
			response = client.serviceDelivery(serviceDeliveryRQ);
		} catch (IOException e) {
			LOG.error("Unexpected exception encountered during service call", e);
			fail(e.toString());
		}

		assertNull(response.getError());
		assertNotNull(response.getOrder());
		Printer.printData(response);
	}

	@Test
	public void d_builtServiceDeliveryRQ() {
		IATAServiceDeliveryRQ request = new ServiceDeliveryRQBuilder()
				.addService("BAG")
				.addOrder("A12346SG8")
				.build();

		IATAServiceDeliveryRS response = null;
		try {
			response = client.serviceDelivery(request);
		} catch (IOException e) {
			LOG.error("Unexpected exception encountered during service call", e);
			fail(e.toString());
		}

		assertNull(response.getError());
		Printer.printData(response);
	}

	@Test
	public void e_builtServiceDeliveryRQ() {
		Calendar cal = Calendar.getInstance();
		cal.clear();
		cal.set(2017, 07, 26);
		Date date = cal.getTime();

		IATAServiceDeliveryRQ request = new ServiceDeliveryRQBuilder()
				.addService("MEL")
				.addSegment("LHR", DateConverter.retrieveDate("2017-08-27"), "Z9", "Zeus Airlines", "150")
				.build();

		IATAServiceDeliveryRS response = null;
		try {
			response = client.serviceDelivery(request);
		} catch (IOException e) {
			LOG.error("Unexpected exception encountered during service call", e);
			fail(e.toString());
		}

		assertNull(response.getError());
		Printer.printData(response);
	}

	@Test
	public void c_existingServiceStatusChangeNotifRQ() throws JAXBException {
		InputStream is = this.getClass().getResourceAsStream("/Zeus/ServiceStatusChangeNotifRQ.xml");
		JAXBContext context = JAXBContext.newInstance("org.iata.oo.schema.ServiceStatusChangeNotificationRQ");
		Unmarshaller unmarshaller = context.createUnmarshaller();
		IATAServiceStatusChangeNotificationRQ serviceStatusChangeNotifRQ =  (IATAServiceStatusChangeNotificationRQ) unmarshaller.unmarshal(is);

		String response = null;
		try {
			response = client.serviceStatusChangeNotif(serviceStatusChangeNotifRQ);
		} catch (IOException e) {
			LOG.error("Unexpected exception encountered during service call", e);
			fail(e.toString());
		}

		assertTrue(response.contains("<StatusCode>Err</StatusCode>") || response.contains("<StatusCode>OK</StatusCode>"));
		Printer.printData(response);
	}

	@Test
	public void d_builtServiceStatusChangeNotifRQ() {
		List<OrderItem> orderItems = new ArrayList<>();
		List<ServiceDetailType> services = new ArrayList<>();

		ServiceStatusChangeNotifRQBuilder requestBuilder = new ServiceStatusChangeNotifRQBuilder();
		ServiceDetailType service = requestBuilder.addService("SV1023_AL2_1_SH2", "Z9", "Service Delivery DELIVERED");

		services.add(service);
		OrderItem orderItem = requestBuilder.addOrderItem("ORDERITEM1", "Z9", services);
		orderItems.add(orderItem);

		IATAServiceStatusChangeNotificationRQ request = requestBuilder
				.addOrder("D127V5", "Z9", orderItems)
				.build();

		String response = null;
		try {
			response = client.serviceStatusChangeNotif(request);
		} catch (IOException e) {
			LOG.error("Unexpected exception encountered during service call", e);
			fail(e.toString());
		}

		assertTrue(response.contains("<StatusCode>Err</StatusCode>") || response.contains("<StatusCode>OK</StatusCode>"));
		Printer.printData(response);
	}

	@Test
	public void c_getOrderSaleInfNotifRQ() throws JAXBException {
		IATAOrderSaleInformationNotificationRQ response = null;
		try {
			response = client.orderSaleInfNotif("376ecfa0f8cf4e1b9c8176e7b1578fad", "OrderSaleInformationNotification");
		} catch (IOException e) {
			LOG.error("Unexpected exception encountered during service call", e);
			fail(e.toString());
		}

		assertNotNull(response.getOrder().get(0).getOrderID());
		Printer.printData(response);
	}
}
