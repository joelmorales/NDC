//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.27 at 11:03:24 AM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SrvceCouponListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SrvceCouponListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E-Ticket"/>
 *     &lt;enumeration value="Flight"/>
 *     &lt;enumeration value="No_EMD"/>
 *     &lt;enumeration value="Standalone"/>
 *     &lt;enumeration value="Ticket"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SrvceCouponListType")
@XmlEnum
public enum SrvceCouponListType {

    @XmlEnumValue("E-Ticket")
    E_TICKET("E-Ticket"),
    @XmlEnumValue("Flight")
    FLIGHT("Flight"),
    @XmlEnumValue("No_EMD")
    NO_EMD("No_EMD"),
    @XmlEnumValue("Standalone")
    STANDALONE("Standalone"),
    @XmlEnumValue("Ticket")
    TICKET("Ticket"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SrvceCouponListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SrvceCouponListType fromValue(String v) {
        for (SrvceCouponListType c: SrvceCouponListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
