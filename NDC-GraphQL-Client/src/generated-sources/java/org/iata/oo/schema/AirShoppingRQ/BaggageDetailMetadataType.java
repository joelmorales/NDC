//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 04:29:40 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * BAGGAGE DETAIL Metadata definition.
 * 
 * <p>Java class for BaggageDetailMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDetailMetadataType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetadataObjectBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}Attributes" minOccurs="0"/>
 *         &lt;element name="FareTariff" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FareRule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FareCat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDetailMetadataType", propOrder = {
    "attributes",
    "fareTariff",
    "fareRule",
    "fareCat"
})
public class BaggageDetailMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "Attributes")
    protected AttributesType attributes;
    @XmlElement(name = "FareTariff")
    protected BaggageDetailMetadataType.FareTariff fareTariff;
    @XmlElement(name = "FareRule")
    protected String fareRule;
    @XmlElement(name = "FareCat")
    protected String fareCat;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesType }
     *     
     */
    public AttributesType getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType }
     *     
     */
    public void setAttributes(AttributesType value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the fareTariff property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailMetadataType.FareTariff }
     *     
     */
    public BaggageDetailMetadataType.FareTariff getFareTariff() {
        return fareTariff;
    }

    /**
     * Sets the value of the fareTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailMetadataType.FareTariff }
     *     
     */
    public void setFareTariff(BaggageDetailMetadataType.FareTariff value) {
        this.fareTariff = value;
    }

    /**
     * Gets the value of the fareRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareRule() {
        return fareRule;
    }

    /**
     * Sets the value of the fareRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareRule(String value) {
        this.fareRule = value;
    }

    /**
     * Gets the value of the fareCat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCat() {
        return fareCat;
    }

    /**
     * Sets the value of the fareCat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCat(String value) {
        this.fareCat = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="FareType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class FareTariff {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "FareType")
        protected String fareType;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the fareType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareType() {
            return fareType;
        }

        /**
         * Sets the value of the fareType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareType(String value) {
            this.fareType = value;
        }

    }

}
