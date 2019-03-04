//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:53:10 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Shopping Offer Association(s) definition.
 * 
 * <p>Java class for OfferAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferAssociationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Shopper" type="{http://www.iata.org/IATA/EDIST/2017.1}ShopperInfoAssocType" minOccurs="0"/>
 *         &lt;element name="Flight" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightInfoAssocType" minOccurs="0"/>
 *         &lt;element name="PriceClass" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceClassReference"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BagDetails" type="{http://www.iata.org/IATA/EDIST/2017.1}BagDetailAssocType" minOccurs="0"/>
 *         &lt;element name="OfferDetails" type="{http://www.iata.org/IATA/EDIST/2017.1}OfferDetailInfoAssocType" minOccurs="0"/>
 *         &lt;element name="Services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Service" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BundleReference" minOccurs="0"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceReferences"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Media" type="{http://www.iata.org/IATA/EDIST/2017.1}MediaAssocType" minOccurs="0"/>
 *         &lt;element name="Other" type="{http://www.iata.org/IATA/EDIST/2017.1}OtherOfferAssocType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferAssociationsType", propOrder = {
    "shopper",
    "flight",
    "priceClass",
    "bagDetails",
    "offerDetails",
    "services",
    "media",
    "other"
})
@XmlSeeAlso({
    OfferAssociations.class
})
public class OfferAssociationsType {

    @XmlElement(name = "Shopper")
    protected ShopperInfoAssocType shopper;
    @XmlElement(name = "Flight")
    protected FlightInfoAssocType flight;
    @XmlElement(name = "PriceClass")
    protected OfferAssociationsType.PriceClass priceClass;
    @XmlElement(name = "BagDetails")
    protected BagDetailAssocType bagDetails;
    @XmlElement(name = "OfferDetails")
    protected OfferDetailInfoAssocType offerDetails;
    @XmlElement(name = "Services")
    protected OfferAssociationsType.Services services;
    @XmlElement(name = "Media")
    protected MediaAssocType media;
    @XmlElement(name = "Other")
    protected OtherOfferAssocType other;

    /**
     * Gets the value of the shopper property.
     * 
     * @return
     *     possible object is
     *     {@link ShopperInfoAssocType }
     *     
     */
    public ShopperInfoAssocType getShopper() {
        return shopper;
    }

    /**
     * Sets the value of the shopper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShopperInfoAssocType }
     *     
     */
    public void setShopper(ShopperInfoAssocType value) {
        this.shopper = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoAssocType }
     *     
     */
    public FlightInfoAssocType getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoAssocType }
     *     
     */
    public void setFlight(FlightInfoAssocType value) {
        this.flight = value;
    }

    /**
     * Gets the value of the priceClass property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAssociationsType.PriceClass }
     *     
     */
    public OfferAssociationsType.PriceClass getPriceClass() {
        return priceClass;
    }

    /**
     * Sets the value of the priceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAssociationsType.PriceClass }
     *     
     */
    public void setPriceClass(OfferAssociationsType.PriceClass value) {
        this.priceClass = value;
    }

    /**
     * Gets the value of the bagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BagDetailAssocType }
     *     
     */
    public BagDetailAssocType getBagDetails() {
        return bagDetails;
    }

    /**
     * Sets the value of the bagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDetailAssocType }
     *     
     */
    public void setBagDetails(BagDetailAssocType value) {
        this.bagDetails = value;
    }

    /**
     * Gets the value of the offerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public OfferDetailInfoAssocType getOfferDetails() {
        return offerDetails;
    }

    /**
     * Sets the value of the offerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public void setOfferDetails(OfferDetailInfoAssocType value) {
        this.offerDetails = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAssociationsType.Services }
     *     
     */
    public OfferAssociationsType.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAssociationsType.Services }
     *     
     */
    public void setServices(OfferAssociationsType.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAssocType }
     *     
     */
    public MediaAssocType getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAssocType }
     *     
     */
    public void setMedia(MediaAssocType value) {
        this.media = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public OtherOfferAssocType getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public void setOther(OtherOfferAssocType value) {
        this.other = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceClassReference"/>
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
        "priceClassReference"
    })
    public static class PriceClass {

        @XmlElement(name = "PriceClassReference", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object priceClassReference;

        /**
         * Gets the value of the priceClassReference property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPriceClassReference() {
            return priceClassReference;
        }

        /**
         * Sets the value of the priceClassReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPriceClassReference(Object value) {
            this.priceClassReference = value;
        }

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
     *         &lt;element name="Service" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BundleReference" minOccurs="0"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceReferences"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
    @XmlType(name = "", propOrder = {
        "service"
    })
    public static class Services {

        @XmlElement(name = "Service", required = true)
        protected List<OfferAssociationsType.Services.Service> service;

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferAssociationsType.Services.Service }
         * 
         * 
         */
        public List<OfferAssociationsType.Services.Service> getService() {
            if (service == null) {
                service = new ArrayList<OfferAssociationsType.Services.Service>();
            }
            return this.service;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BundleReference" minOccurs="0"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceReferences"/>
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
            "bundleReference",
            "serviceReferences"
        })
        public static class Service {

            @XmlElement(name = "BundleReference")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object bundleReference;
            @XmlList
            @XmlElement(name = "ServiceReferences", required = true)
            @XmlIDREF
            protected List<Object> serviceReferences;

            /**
             * Gets the value of the bundleReference property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getBundleReference() {
                return bundleReference;
            }

            /**
             * Sets the value of the bundleReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setBundleReference(Object value) {
                this.bundleReference = value;
            }

            /**
             * Gets the value of the serviceReferences property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceReferences property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getServiceReferences() {
                if (serviceReferences == null) {
                    serviceReferences = new ArrayList<Object>();
                }
                return this.serviceReferences;
            }

        }

    }

}
