package org.iata.oo;

import javax.xml.datatype.XMLGregorianCalendar;

public class TripDestination  {

	private String departureCode;
	private XMLGregorianCalendar departureDate;
	private String arrivalCode;
	
	public String getDepartureCode() {
		return departureCode;
	}
	public void setDepartureCode(String departureCode) {
		this.departureCode = departureCode;
	}
	public XMLGregorianCalendar getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(XMLGregorianCalendar departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalCode() {
		return arrivalCode;
	}
	public void setArrivalCode(String arrivalCode) {
		this.arrivalCode = arrivalCode;
	}
	
	
	
}
