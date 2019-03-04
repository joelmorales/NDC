//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 02:09:42 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ContactListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Billing"/>
 *     &lt;enumeration value="Business"/>
 *     &lt;enumeration value="Home"/>
 *     &lt;enumeration value="ServiceLocation"/>
 *     &lt;enumeration value="StayLocation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContactListType")
@XmlEnum
public enum ContactListType {

    @XmlEnumValue("Billing")
    BILLING("Billing"),
    @XmlEnumValue("Business")
    BUSINESS("Business"),
    @XmlEnumValue("Home")
    HOME("Home"),
    @XmlEnumValue("ServiceLocation")
    SERVICE_LOCATION("ServiceLocation"),
    @XmlEnumValue("StayLocation")
    STAY_LOCATION("StayLocation");
    private final String value;

    ContactListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContactListType fromValue(String v) {
        for (ContactListType c: ContactListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
