//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 02:09:42 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomerAuthStatusListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerAuthStatusListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerAuthStatusListType")
@XmlEnum
public enum CustomerAuthStatusListType {


    /**
     * 
     *             A- An authentication attempt occurred but could not be completed
     *           
     * 
     */
    A,

    /**
     * N- Customer not authenticated
     * 
     */
    N,

    /**
     * U- Unable to perform authentication
     * 
     */
    U,

    /**
     * Y- Customer authenticated
     * 
     */
    Y;

    public String value() {
        return name();
    }

    public static CustomerAuthStatusListType fromValue(String v) {
        return valueOf(v);
    }

}
