
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeUnitSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AgeUnitSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Days"/&gt;
 *     &lt;enumeration value="Months"/&gt;
 *     &lt;enumeration value="Years"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AgeUnitSimpleType")
@XmlEnum
public enum AgeUnitSimpleType {

    @XmlEnumValue("Days")
    DAYS("Days"),
    @XmlEnumValue("Months")
    MONTHS("Months"),
    @XmlEnumValue("Years")
    YEARS("Years"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    AgeUnitSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AgeUnitSimpleType fromValue(String v) {
        for (AgeUnitSimpleType c: AgeUnitSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
