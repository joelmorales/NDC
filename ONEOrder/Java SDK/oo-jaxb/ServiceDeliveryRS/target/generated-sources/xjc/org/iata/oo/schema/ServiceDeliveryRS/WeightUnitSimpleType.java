
package org.iata.oo.schema.ServiceDeliveryRS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeightUnitSimpleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeightUnitSimpleType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Kilogram"/&gt;
 *     &lt;enumeration value="Pound"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeightUnitSimpleType")
@XmlEnum
public enum WeightUnitSimpleType {

    @XmlEnumValue("Kilogram")
    KILOGRAM("Kilogram"),
    @XmlEnumValue("Pound")
    POUND("Pound");
    private final String value;

    WeightUnitSimpleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeightUnitSimpleType fromValue(String v) {
        for (WeightUnitSimpleType c: WeightUnitSimpleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
