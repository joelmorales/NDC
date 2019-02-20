
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenderCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GenderCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Female"/&gt;
 *     &lt;enumeration value="Male"/&gt;
 *     &lt;enumeration value="Unspecified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "GenderCodeContentType")
@XmlEnum
public enum GenderCodeContentType {

    @XmlEnumValue("Female")
    FEMALE("Female"),
    @XmlEnumValue("Male")
    MALE("Male"),
    @XmlEnumValue("Unspecified")
    UNSPECIFIED("Unspecified");
    private final String value;

    GenderCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GenderCodeContentType fromValue(String v) {
        for (GenderCodeContentType c: GenderCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
