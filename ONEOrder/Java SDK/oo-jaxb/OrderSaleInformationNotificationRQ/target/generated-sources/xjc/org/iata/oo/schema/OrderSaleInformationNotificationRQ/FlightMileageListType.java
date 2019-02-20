
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightMileageListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FlightMileageListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Arrival"/&gt;
 *     &lt;enumeration value="Departure"/&gt;
 *     &lt;enumeration value="Destination"/&gt;
 *     &lt;enumeration value="Origin"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlightMileageListType")
@XmlEnum
public enum FlightMileageListType {

    @XmlEnumValue("Arrival")
    ARRIVAL("Arrival"),
    @XmlEnumValue("Departure")
    DEPARTURE("Departure"),
    @XmlEnumValue("Destination")
    DESTINATION("Destination"),
    @XmlEnumValue("Origin")
    ORIGIN("Origin"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FlightMileageListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightMileageListType fromValue(String v) {
        for (FlightMileageListType c: FlightMileageListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
