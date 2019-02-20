
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerTypeListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartnerTypeListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AirPassProgramHolder"/&gt;
 *     &lt;enumeration value="Merchandise"/&gt;
 *     &lt;enumeration value="ServiceFulfillment"/&gt;
 *     &lt;enumeration value="ServiceProvider"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PartnerTypeListType")
@XmlEnum
public enum PartnerTypeListType {

    @XmlEnumValue("AirPassProgramHolder")
    AIR_PASS_PROGRAM_HOLDER("AirPassProgramHolder"),
    @XmlEnumValue("Merchandise")
    MERCHANDISE("Merchandise"),
    @XmlEnumValue("ServiceFulfillment")
    SERVICE_FULFILLMENT("ServiceFulfillment"),
    @XmlEnumValue("ServiceProvider")
    SERVICE_PROVIDER("ServiceProvider"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PartnerTypeListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartnerTypeListType fromValue(String v) {
        for (PartnerTypeListType c: PartnerTypeListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
