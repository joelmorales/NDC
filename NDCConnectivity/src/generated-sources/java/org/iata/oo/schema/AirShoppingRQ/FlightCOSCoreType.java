//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.22 at 03:57:37 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * A data type for Class of Service Core.
 * 
 * Class of service code.
 * Example: B
 * 
 * <p>Java class for FlightCOS_CoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightCOS_CoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>Flight_COS_SimpleType">
 *                 &lt;attribute name="SeatsLeft" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarketingName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
 *                 &lt;attribute name="CabinDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCOS_CoreType", propOrder = {
    "code",
    "marketingName"
})
public class FlightCOSCoreType {

    @XmlElement(name = "Code", required = true)
    protected FlightCOSCoreType.Code code;
    @XmlElement(name = "MarketingName")
    protected FlightCOSCoreType.MarketingName marketingName;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCOSCoreType.Code }
     *     
     */
    public FlightCOSCoreType.Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCOSCoreType.Code }
     *     
     */
    public void setCode(FlightCOSCoreType.Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the marketingName property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCOSCoreType.MarketingName }
     *     
     */
    public FlightCOSCoreType.MarketingName getMarketingName() {
        return marketingName;
    }

    /**
     * Sets the value of the marketingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCOSCoreType.MarketingName }
     *     
     */
    public void setMarketingName(FlightCOSCoreType.MarketingName value) {
        this.marketingName = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>Flight_COS_SimpleType">
     *       &lt;attribute name="SeatsLeft" type="{http://www.w3.org/2001/XMLSchema}int" />
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
    public static class Code {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "SeatsLeft")
        protected Integer seatsLeft;

        /**
         * A data type for Flight Class of Service encoding constraint.
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
         * Gets the value of the seatsLeft property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSeatsLeft() {
            return seatsLeft;
        }

        /**
         * Sets the value of the seatsLeft property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSeatsLeft(Integer value) {
            this.seatsLeft = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1>ProperNameSimpleType">
     *       &lt;attribute name="CabinDesignator" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class MarketingName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "CabinDesignator")
        protected String cabinDesignator;

        /**
         * A data type for Proper Name size constraint.
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
         * Gets the value of the cabinDesignator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCabinDesignator() {
            return cabinDesignator;
        }

        /**
         * Sets the value of the cabinDesignator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCabinDesignator(String value) {
            this.cabinDesignator = value;
        }

    }

}
