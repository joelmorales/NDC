//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 04:04:58 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An identifier is a character string used to uniquely identify one instance of an object within an identification scheme that is managed by an agency.
 * 
 * <p>Java class for IdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentifierValue" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IdentifierSchemeAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IdentifierSchemeIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="IdentifierSchemeVersionIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierType", propOrder = {
    "identifierValue"
})
public class IdentifierType {

    @XmlElement(name = "IdentifierValue", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identifierValue;
    @XmlAttribute(name = "IdentifierSchemeAgencyIdentifier")
    protected String identifierSchemeAgencyIdentifier;
    @XmlAttribute(name = "IdentifierSchemeIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identifierSchemeIdentifier;
    @XmlAttribute(name = "IdentifierSchemeVersionIdentifier")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identifierSchemeVersionIdentifier;

    /**
     * Gets the value of the identifierValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierValue() {
        return identifierValue;
    }

    /**
     * Sets the value of the identifierValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierValue(String value) {
        this.identifierValue = value;
    }

    /**
     * Gets the value of the identifierSchemeAgencyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierSchemeAgencyIdentifier() {
        return identifierSchemeAgencyIdentifier;
    }

    /**
     * Sets the value of the identifierSchemeAgencyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierSchemeAgencyIdentifier(String value) {
        this.identifierSchemeAgencyIdentifier = value;
    }

    /**
     * Gets the value of the identifierSchemeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierSchemeIdentifier() {
        return identifierSchemeIdentifier;
    }

    /**
     * Sets the value of the identifierSchemeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierSchemeIdentifier(String value) {
        this.identifierSchemeIdentifier = value;
    }

    /**
     * Gets the value of the identifierSchemeVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifierSchemeVersionIdentifier() {
        return identifierSchemeVersionIdentifier;
    }

    /**
     * Sets the value of the identifierSchemeVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifierSchemeVersionIdentifier(String value) {
        this.identifierSchemeVersionIdentifier = value;
    }

}