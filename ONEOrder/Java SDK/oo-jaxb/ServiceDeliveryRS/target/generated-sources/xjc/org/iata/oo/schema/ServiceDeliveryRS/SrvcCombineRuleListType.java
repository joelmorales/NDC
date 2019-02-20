
package org.iata.oo.schema.ServiceDeliveryRS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SrvcCombineRuleListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SrvcCombineRuleListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NotPermitted"/&gt;
 *     &lt;enumeration value="Permitted"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SrvcCombineRuleListType")
@XmlEnum
public enum SrvcCombineRuleListType {

    @XmlEnumValue("NotPermitted")
    NOT_PERMITTED("NotPermitted"),
    @XmlEnumValue("Permitted")
    PERMITTED("Permitted"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    SrvcCombineRuleListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SrvcCombineRuleListType fromValue(String v) {
        for (SrvcCombineRuleListType c: SrvcCombineRuleListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
