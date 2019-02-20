package org.iata.oo;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * This class provides a simple way to convert dates from String format to XMLGregorianCalendar format.
 */
public class DateConverter {
    //Date format: YYYY-MM-DD
    public static XMLGregorianCalendar retrieveDate(String date) {
        try {
            DatatypeFactory.newInstance();
            XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar();

            String[] parts = date.split("-");
            calendar.setYear(Integer.valueOf(parts[0]));
            calendar.setMonth(Integer.valueOf(parts[1]));
            calendar.setDay(Integer.valueOf(parts[2]));

            return calendar;
        } catch (Exception e) {
            System.err.println("Error invalid Date: " + date);
            e.printStackTrace();
            return null;
        }
    }
}
