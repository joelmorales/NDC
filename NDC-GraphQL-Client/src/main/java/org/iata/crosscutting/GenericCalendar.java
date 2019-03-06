package org.iata.crosscutting;

import java.time.LocalDate;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class GenericCalendar {

	public static XMLGregorianCalendar getXMLGregorianCalendarDate(LocalDate date) {	
		GregorianCalendar cal = new GregorianCalendar();
		cal.set(date.getYear(), date.getMonthValue()-1, date.getDayOfMonth());
		XMLGregorianCalendar departureDate = null;
		try {
			departureDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return departureDate;
	}
	
}
