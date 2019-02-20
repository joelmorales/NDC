package org.iata.oo.builder;

import javax.xml.datatype.*;
import org.iata.oo.schema.ServiceDeliveryRQ.*;
import org.iata.oo.schema.ServiceDeliveryRQ.IATAServiceDeliveryRQ.*;

/**
 * This class provides a simple way to create ServiceDeliveryRQ objects.
 */
public class ServiceDeliveryRQBuilder implements Buildable<IATAServiceDeliveryRQ>{

	private IATAServiceDeliveryRQ request;

	/**
	 * Creates a new instance of ServiceDeliveryRQBuilder.
	 */
	public ServiceDeliveryRQBuilder() { //{@link #clear)
		doInitialize();
	}

	/**
	 * Re-initializes builder to empty state.
	 */
	protected void doInitialize() {
		request = Initializer.getObject(IATAServiceDeliveryRQ.class);
	}

	/**
	 * Creates a new instance of {@link OrderCoreType} using supplied data and adds it to the IATAServiceDeliveryRQ instance.
	 * @param orderId orderId of the order
	 * @return current builder instance
	 */
	public ServiceDeliveryRQBuilder addOrder(String orderId) {
		OrderCoreType order = new OrderCoreType();
		order.setOrderID(orderId);
		request.getOrder().add(order);
		return this;
	}

	/**
	 * Creates a new instance of {@link ServiceDetailType} using supplied data and adds it to the IATAServiceDeliveryRQ instance.
	 * @param serviceTypeValue Code of the service type
	 * @return current builder instance
	 */
	public ServiceDeliveryRQBuilder addService(String serviceTypeValue) {
		ServiceDetailType service = new ServiceDetailType();
		ServiceEncodingType serviceType = new ServiceEncodingType();
		ServiceEncodingType.Code codeValue = new ServiceEncodingType.Code();
		codeValue.setValue(serviceTypeValue);
		serviceType.setCode(codeValue);
		service.setServiceType(serviceType);
		request.getService().add(service);
		return this;
	}

	/**
	 * Creates a new instance of {@link Segment} using supplied data and adds it to the IATAServiceDeliveryRQ instance.
	 * @param depAirport departure airport
	 * @param depDate departure date
	 * @param airlineId marketing carrier airline id
	 * @param airlineName marketing carrier airline name
	 * @param flightNumber marketing carrier flight number
	 * @return current builder instance
	 */
	public ServiceDeliveryRQBuilder addSegment(String depAirport, XMLGregorianCalendar depDate, String airlineId, String airlineName, String flightNumber) {
		Segment segment = new Segment();

		Departure dep = new Departure();
		FlightDepartureType.AirportCode airport = new FlightDepartureType.AirportCode();
		airport.setValue(depAirport);
		dep.setAirportCode(airport);
		dep.setDate(depDate);
		segment.setDeparture(dep);

		MarketingCarrierFlightType carrier = new MarketingCarrierFlightType();
		AirlineIDType airline = new AirlineIDType();
		airline.setValue(airlineId);
		carrier.setAirlineID(airline);
		carrier.setName(airlineName);
		FlightNumber flight = new FlightNumber();
		flight.setValue(flightNumber);
		carrier.setFlightNumber(flight);
		segment.setMarketingCarrier(carrier);

		request.getSegment().add(segment);
		return this;
	}

	/**
	 * Builds IATAServiceDeliveryRQ instance and returns it.
	 * @return constructed IATAServiceDeliveryRQ instance
	 */
    @Override
	public IATAServiceDeliveryRQ build() {
		addRequestAttributes();
		return request;
	}


	/**
	 * Adds request attributes to the IATAServiceDeliveryRQ instance
	 */
	private void addRequestAttributes() {
		request.setVersion(VERSION);
	}

}
