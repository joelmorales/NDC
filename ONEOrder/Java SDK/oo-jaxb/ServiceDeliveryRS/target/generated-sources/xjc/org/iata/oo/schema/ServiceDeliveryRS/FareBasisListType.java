
package org.iata.oo.schema.ServiceDeliveryRS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareBasisListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareBasisListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *     &lt;enumeration value="Ticketed"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareBasisListType")
@XmlEnum
public enum FareBasisListType {

    @XmlEnumValue("Requested")
    REQUESTED("Requested"),
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FareBasisListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareBasisListType fromValue(String v) {
        for (FareBasisListType c: FareBasisListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
