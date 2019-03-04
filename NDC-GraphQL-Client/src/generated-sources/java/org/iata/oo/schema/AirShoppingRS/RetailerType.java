//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 02:09:42 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for MERCHANDISE RETAILER Supplier Role, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from SupplierCoreRepType.
 * 
 * <p>Java class for RetailerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetailerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SupplierCoreRepType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RetailerID"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Contacts" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetailerType", propOrder = {
    "retailerID",
    "contacts"
})
@XmlSeeAlso({
    RetailerMsgPartyCoreType.class
})
public class RetailerType
    extends SupplierCoreRepType
{

    @XmlElement(name = "RetailerID", required = true)
    protected RetailerIDType retailerID;
    @XmlElement(name = "Contacts")
    protected Contacts contacts;

    /**
     * Gets the value of the retailerID property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerIDType }
     *     
     */
    public RetailerIDType getRetailerID() {
        return retailerID;
    }

    /**
     * Sets the value of the retailerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerIDType }
     *     
     */
    public void setRetailerID(RetailerIDType value) {
        this.retailerID = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link Contacts }
     *     
     */
    public Contacts getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacts }
     *     
     */
    public void setContacts(Contacts value) {
        this.contacts = value;
    }

}
