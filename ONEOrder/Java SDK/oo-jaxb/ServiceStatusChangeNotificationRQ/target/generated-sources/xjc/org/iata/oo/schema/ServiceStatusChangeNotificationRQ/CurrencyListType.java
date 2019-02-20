
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Actual"/&gt;
 *     &lt;enumeration value="Conversion"/&gt;
 *     &lt;enumeration value="Display"/&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurrencyListType")
@XmlEnum
public enum CurrencyListType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Conversion")
    CONVERSION("Conversion"),
    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    CurrencyListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyListType fromValue(String v) {
        for (CurrencyListType c: CurrencyListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
