//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:52:55 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagDimensionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BagDimensionListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Length"/>
 *     &lt;enumeration value="Height"/>
 *     &lt;enumeration value="Width"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BagDimensionListType")
@XmlEnum
public enum BagDimensionListType {

    @XmlEnumValue("Length")
    LENGTH("Length"),
    @XmlEnumValue("Height")
    HEIGHT("Height"),
    @XmlEnumValue("Width")
    WIDTH("Width");
    private final String value;

    BagDimensionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BagDimensionListType fromValue(String v) {
        for (BagDimensionListType c: BagDimensionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
