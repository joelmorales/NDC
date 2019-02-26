package org.iata.oo.builder;

import javax.xml.datatype.XMLGregorianCalendar;

import org.iata.oo.TripDestination;

public class DestinationBuilder implements Buildable<TripDestination> {

	private TripDestination request;
	
	public DestinationBuilder() {
		doInitialize();
	}
	protected void doInitialize() {
		request = Initializer.getObject(TripDestination.class);
	}
	
	public DestinationBuilder addDepartureCode(String code) {
		request.setDepartureCode(code);
		return this;
	}
	
	public DestinationBuilder addArrivalCode(String code) {
		request.setArrivalCode(code);
		return this;
	}
	
	public DestinationBuilder addDepartureDate(XMLGregorianCalendar departureDate) {
		request.setDepartureDate(departureDate);
		return this;
	}
	
	@Override
	public TripDestination build() {
		return request;
	}

}
