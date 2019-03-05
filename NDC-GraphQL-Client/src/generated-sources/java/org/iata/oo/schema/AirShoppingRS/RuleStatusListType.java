//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 04:34:49 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RuleStatusListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RuleStatusListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ActionRequired"/>
 *     &lt;enumeration value="RuleExecuted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RuleStatusListType")
@XmlEnum
public enum RuleStatusListType {

    @XmlEnumValue("ActionRequired")
    ACTION_REQUIRED("ActionRequired"),
    @XmlEnumValue("RuleExecuted")
    RULE_EXECUTED("RuleExecuted");
    private final String value;

    RuleStatusListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RuleStatusListType fromValue(String v) {
        for (RuleStatusListType c: RuleStatusListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
