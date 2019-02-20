
package org.iata.oo.schema.ServiceDeliveryRS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BagDimensionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BagDimensionListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Length"/&gt;
 *     &lt;enumeration value="Height"/&gt;
 *     &lt;enumeration value="Width"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
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
