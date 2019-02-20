
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 * &lt;complexType name="FlightCOS_CoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;Flight_COS_SimpleType"&gt;
 *                 &lt;attribute name="SeatsLeft" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MarketingName" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
 *                 &lt;attribute name="CabinDesignator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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

    @XmlElement(name = "Code")
    protected FlightCOSCoreType.Code code;
    @XmlElement(name = "MarketingName")
    protected FlightCOSCoreType.MarketingName marketingName;

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;Flight_COS_SimpleType"&gt;
     *       &lt;attribute name="SeatsLeft" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
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
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
     *       &lt;attribute name="CabinDesignator" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
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
