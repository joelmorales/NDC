
package org.iata.oo.schema.ServiceDeliveryRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Form of identification.  Typically used to identify that the passenger is who he says he is.
 * 
 * This is the type of FOID as defined in AIRIMP (FF Number, Credit Card Number, etc.).
 * 
 * <p>Java class for FOID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FOID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditCardVendorCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CreditCardVendorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="FOID_Number" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType"/&gt;
 *         &lt;element name="FOID_Type" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOID", propOrder = {
    "creditCardVendorCode",
    "foidNumber",
    "foidType"
})
public class FOID {

    @XmlElement(name = "CreditCardVendorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String creditCardVendorCode;
    @XmlElement(name = "FOID_Number", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String foidNumber;
    @XmlElement(name = "FOID_Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String foidType;

    /**
     * Gets the value of the creditCardVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardVendorCode() {
        return creditCardVendorCode;
    }

    /**
     * Sets the value of the creditCardVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardVendorCode(String value) {
        this.creditCardVendorCode = value;
    }

    /**
     * Gets the value of the foidNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDNumber() {
        return foidNumber;
    }

    /**
     * Sets the value of the foidNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOIDNumber(String value) {
        this.foidNumber = value;
    }

    /**
     * Gets the value of the foidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDType() {
        return foidType;
    }

    /**
     * Sets the value of the foidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOIDType(String value) {
        this.foidType = value;
    }

}
