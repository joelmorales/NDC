package org.iata.oo.builder;

import org.iata.oo.DateConverter;
import org.iata.oo.schema.ServiceDeliveryRQ.IATAServiceDeliveryRQ;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ServiceDeliveryRQBuilderTest {
	private ServiceDeliveryRQBuilder testedClass;

	@Before
	public void setUp() {
		testedClass = new ServiceDeliveryRQBuilder();
	}

	@Test
	public void documentNode() {
		IATAServiceDeliveryRQ request = testedClass.build();
		assertEquals("IATA2017.1", request.getVersion());
	}

	@Test
	public void setOrder() {
		IATAServiceDeliveryRQ request = testedClass.addOrder("AD12345").build();
		assertEquals("AD12345", request.getOrder().get(0).getOrderID());
	}

	@Test
	public void setSegment() {
		IATAServiceDeliveryRQ request = testedClass.addSegment("CDG", DateConverter.retrieveDate("2017-09-06"), "Z9", "Zeus Airlines", "050").build();
		assertEquals("CDG", request.getSegment().get(0).getDeparture().getAirportCode().getValue());
		assertEquals("2017-09-06", request.getSegment().get(0).getDeparture().getDate().toString());
		assertEquals("Z9", request.getSegment().get(0).getMarketingCarrier().getAirlineID().getValue());
		assertEquals("Zeus Airlines", request.getSegment().get(0).getMarketingCarrier().getName());
		assertEquals("050", request.getSegment().get(0).getMarketingCarrier().getFlightNumber().getValue());
	}
}
