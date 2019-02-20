
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PenaltyListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cancellation"/&gt;
 *     &lt;enumeration value="Change"/&gt;
 *     &lt;enumeration value="NoShow"/&gt;
 *     &lt;enumeration value="Upgrade"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PenaltyListType")
@XmlEnum
public enum PenaltyListType {

    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PenaltyListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyListType fromValue(String v) {
        for (PenaltyListType c: PenaltyListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
