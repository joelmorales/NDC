//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 02:09:34 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * OPTIONAL SERVICE DETAIL definition.
 * 
 * <p>Java class for ServiceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDetailType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ServiceCoreType">
 *       &lt;sequence>
 *         &lt;element name="Detail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceCombinations" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceCoupon" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceFulfillment" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceItemQuantityRules" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDetailType", propOrder = {
    "detail"
})
public class ServiceDetailType
    extends ServiceCoreType
{

    @XmlElement(name = "Detail")
    protected ServiceDetailType.Detail detail;

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDetailType.Detail }
     *     
     */
    public ServiceDetailType.Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDetailType.Detail }
     *     
     */
    public void setDetail(ServiceDetailType.Detail value) {
        this.detail = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceCombinations" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceCoupon" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceFulfillment" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceItemQuantityRules" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceCombinations",
        "serviceCoupon",
        "serviceFulfillment",
        "serviceItemQuantityRules"
    })
    public static class Detail {

        @XmlElement(name = "ServiceCombinations")
        protected ServiceCombinations serviceCombinations;
        @XmlElement(name = "ServiceCoupon")
        protected ServiceCouponType serviceCoupon;
        @XmlElement(name = "ServiceFulfillment")
        protected ServiceFulfillmentType serviceFulfillment;
        @XmlElement(name = "ServiceItemQuantityRules")
        protected ServiceItemQuantityType serviceItemQuantityRules;

        /**
         * Gets the value of the serviceCombinations property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCombinations }
         *     
         */
        public ServiceCombinations getServiceCombinations() {
            return serviceCombinations;
        }

        /**
         * Sets the value of the serviceCombinations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCombinations }
         *     
         */
        public void setServiceCombinations(ServiceCombinations value) {
            this.serviceCombinations = value;
        }

        /**
         * Gets the value of the serviceCoupon property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCouponType }
         *     
         */
        public ServiceCouponType getServiceCoupon() {
            return serviceCoupon;
        }

        /**
         * Sets the value of the serviceCoupon property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCouponType }
         *     
         */
        public void setServiceCoupon(ServiceCouponType value) {
            this.serviceCoupon = value;
        }

        /**
         * Gets the value of the serviceFulfillment property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFulfillmentType }
         *     
         */
        public ServiceFulfillmentType getServiceFulfillment() {
            return serviceFulfillment;
        }

        /**
         * Sets the value of the serviceFulfillment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFulfillmentType }
         *     
         */
        public void setServiceFulfillment(ServiceFulfillmentType value) {
            this.serviceFulfillment = value;
        }

        /**
         * Gets the value of the serviceItemQuantityRules property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceItemQuantityType }
         *     
         */
        public ServiceItemQuantityType getServiceItemQuantityRules() {
            return serviceItemQuantityRules;
        }

        /**
         * Sets the value of the serviceItemQuantityRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceItemQuantityType }
         *     
         */
        public void setServiceItemQuantityRules(ServiceItemQuantityType value) {
            this.serviceItemQuantityRules = value;
        }

    }

}
