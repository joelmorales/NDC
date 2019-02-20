
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketDesigAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TicketDesigAppListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *     &lt;enumeration value="Ticketed"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TicketDesigAppListType")
@XmlEnum
public enum TicketDesigAppListType {

    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    TicketDesigAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TicketDesigAppListType fromValue(String v) {
        for (TicketDesigAppListType c: TicketDesigAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
