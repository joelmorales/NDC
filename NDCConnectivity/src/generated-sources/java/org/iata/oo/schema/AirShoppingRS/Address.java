//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 04:04:58 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AddressCore"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AddressDetail"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressCore",
    "addressDetail"
})
@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(name = "AddressCore")
    protected AddressCoreType addressCore;
    @XmlElement(name = "AddressDetail")
    protected AddressDetailType addressDetail;

    /**
     * Gets the value of the addressCore property.
     * 
     * @return
     *     possible object is
     *     {@link AddressCoreType }
     *     
     */
    public AddressCoreType getAddressCore() {
        return addressCore;
    }

    /**
     * Sets the value of the addressCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCoreType }
     *     
     */
    public void setAddressCore(AddressCoreType value) {
        this.addressCore = value;
    }

    /**
     * Gets the value of the addressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailType }
     *     
     */
    public AddressDetailType getAddressDetail() {
        return addressDetail;
    }

    /**
     * Sets the value of the addressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailType }
     *     
     */
    public void setAddressDetail(AddressDetailType value) {
        this.addressDetail = value;
    }

}
