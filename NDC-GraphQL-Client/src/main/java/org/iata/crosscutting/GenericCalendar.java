package org.iata.crosscutting;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class GenericCalendar {

	public static XMLGregorianCalendar getXMLGregorianCalendarDate(int year, int month, int date) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(year, (month - 1), date);
		XMLGregorianCalendar departureDate = null;
		try {
			departureDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		// return departureDate != null ? Optional.of(departureDate): Optional.empty();
		return departureDate;
	}
	
}
