//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 02:09:34 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Non Geographic Specification information
 * 
 * <p>Java class for NonGeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonGeographicSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelAgencyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AggregatorID" minOccurs="0"/>
 *         &lt;element name="PointOfSaleCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>PointOfSaleCodeType">
 *                 &lt;attribute name="PointOfSaleType" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;length value="1"/>
 *                       &lt;enumeration value="T"/>
 *                       &lt;enumeration value="I"/>
 *                       &lt;enumeration value="H"/>
 *                       &lt;enumeration value="U"/>
 *                       &lt;enumeration value="X"/>
 *                       &lt;enumeration value="V"/>
 *                       &lt;enumeration value="L"/>
 *                       &lt;enumeration value="A"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonGeographicSpecificationType", propOrder = {
    "travelAgencyInd",
    "aggregatorID",
    "pointOfSaleCode"
})
public class NonGeographicSpecificationType {

    @XmlElement(name = "TravelAgencyInd")
    protected Boolean travelAgencyInd;
    @XmlElement(name = "AggregatorID")
    protected AggregatorIDType aggregatorID;
    @XmlElement(name = "PointOfSaleCode")
    protected List<NonGeographicSpecificationType.PointOfSaleCode> pointOfSaleCode;

    /**
     * Gets the value of the travelAgencyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTravelAgencyInd() {
        return travelAgencyInd;
    }

    /**
     * Sets the value of the travelAgencyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTravelAgencyInd(Boolean value) {
        this.travelAgencyInd = value;
    }

    /**
     * Gets the value of the aggregatorID property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatorIDType }
     *     
     */
    public AggregatorIDType getAggregatorID() {
        return aggregatorID;
    }

    /**
     * Sets the value of the aggregatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorIDType }
     *     
     */
    public void setAggregatorID(AggregatorIDType value) {
        this.aggregatorID = value;
    }

    /**
     * Gets the value of the pointOfSaleCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfSaleCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfSaleCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonGeographicSpecificationType.PointOfSaleCode }
     * 
     * 
     */
    public List<NonGeographicSpecificationType.PointOfSaleCode> getPointOfSaleCode() {
        if (pointOfSaleCode == null) {
            pointOfSaleCode = new ArrayList<NonGeographicSpecificationType.PointOfSaleCode>();
        }
        return this.pointOfSaleCode;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>PointOfSaleCodeType">
     *       &lt;attribute name="PointOfSaleType" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;length value="1"/>
     *             &lt;enumeration value="T"/>
     *             &lt;enumeration value="I"/>
     *             &lt;enumeration value="H"/>
     *             &lt;enumeration value="U"/>
     *             &lt;enumeration value="X"/>
     *             &lt;enumeration value="V"/>
     *             &lt;enumeration value="L"/>
     *             &lt;enumeration value="A"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class PointOfSaleCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "PointOfSaleType", required = true)
        protected String pointOfSaleType;

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
         * Gets the value of the pointOfSaleType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPointOfSaleType() {
            return pointOfSaleType;
        }

        /**
         * Sets the value of the pointOfSaleType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPointOfSaleType(String value) {
            this.pointOfSaleType = value;
        }

    }

}
