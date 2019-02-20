
package org.iata.oo.schema.ServiceDeliveryRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceUnitListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DistanceUnitListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Feet"/&gt;
 *     &lt;enumeration value="Kilometers"/&gt;
 *     &lt;enumeration value="Meters"/&gt;
 *     &lt;enumeration value="Miles"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DistanceUnitListType")
@XmlEnum
public enum DistanceUnitListType {

    @XmlEnumValue("Feet")
    FEET("Feet"),

    /**
     * K = KILOMETERS
     * 
     */
    @XmlEnumValue("Kilometers")
    KILOMETERS("Kilometers"),
    @XmlEnumValue("Meters")
    METERS("Meters"),

    /**
     * M = MILES
     * 
     */
    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    DistanceUnitListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DistanceUnitListType fromValue(String v) {
        for (DistanceUnitListType c: DistanceUnitListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
