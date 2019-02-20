
package org.iata.oo.schema.ServiceDeliveryRS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RedempUnitListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RedempUnitListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Miles"/&gt;
 *     &lt;enumeration value="Points"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RedempUnitListType")
@XmlEnum
public enum RedempUnitListType {

    @XmlEnumValue("Miles")
    MILES("Miles"),
    @XmlEnumValue("Points")
    POINTS("Points"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    RedempUnitListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RedempUnitListType fromValue(String v) {
        for (RedempUnitListType c: RedempUnitListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
