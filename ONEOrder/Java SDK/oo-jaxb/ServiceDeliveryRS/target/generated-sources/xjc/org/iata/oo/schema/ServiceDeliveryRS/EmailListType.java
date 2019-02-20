
package org.iata.oo.schema.ServiceDeliveryRS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmailListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Account"/&gt;
 *     &lt;enumeration value="Business"/&gt;
 *     &lt;enumeration value="Personal"/&gt;
 *     &lt;enumeration value="SMS"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EmailListType")
@XmlEnum
public enum EmailListType {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Personal")
    PERSONAL("Personal"),
    SMS("SMS"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    EmailListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailListType fromValue(String v) {
        for (EmailListType c: EmailListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
