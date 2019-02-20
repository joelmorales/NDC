
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * PARTNER ROLE: FULFILLMENT PARTNER, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from PartnerCoreRepType.
 * 
 * <p>Java class for FulfillmentPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FulfillmentPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PartnerCoreRepType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Fulfillments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fulfillment" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OfferValidDates" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Start" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="End" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Location" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportCode"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FulfillmentPartnerType", propOrder = {
    "fulfillments"
})
public class FulfillmentPartnerType
    extends PartnerCoreRepType
{

    @XmlElementWrapper(name = "Fulfillments")
    @XmlElement(name = "Fulfillment", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<FulfillmentPartnerType.Fulfillment> fulfillments;

    public List<FulfillmentPartnerType.Fulfillment> getFulfillments() {
        if (fulfillments == null) {
            fulfillments = new ArrayList<FulfillmentPartnerType.Fulfillment>();
        }
        return fulfillments;
    }

    public void setFulfillments(List<FulfillmentPartnerType.Fulfillment> fulfillments) {
        this.fulfillments = fulfillments;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OfferValidDates" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Start" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="End" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Location" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportCode"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offerValidDates",
        "location"
    })
    public static class Fulfillment {

        @XmlElement(name = "OfferValidDates")
        protected FulfillmentPartnerType.Fulfillment.OfferValidDates offerValidDates;
        @XmlElement(name = "Location")
        protected FulfillmentPartnerType.Fulfillment.Location location;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the offerValidDates property.
         * 
         * @return
         *     possible object is
         *     {@link FulfillmentPartnerType.Fulfillment.OfferValidDates }
         *     
         */
        public FulfillmentPartnerType.Fulfillment.OfferValidDates getOfferValidDates() {
            return offerValidDates;
        }

        /**
         * Sets the value of the offerValidDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link FulfillmentPartnerType.Fulfillment.OfferValidDates }
         *     
         */
        public void setOfferValidDates(FulfillmentPartnerType.Fulfillment.OfferValidDates value) {
            this.offerValidDates = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link FulfillmentPartnerType.Fulfillment.Location }
         *     
         */
        public FulfillmentPartnerType.Fulfillment.Location getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link FulfillmentPartnerType.Fulfillment.Location }
         *     
         */
        public void setLocation(FulfillmentPartnerType.Fulfillment.Location value) {
            this.location = value;
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
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportCode"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airportCode",
            "structuredAddress"
        })
        public static class Location {

            @XmlElement(name = "AirportCode")
            protected AirportCode airportCode;
            @XmlElement(name = "StructuredAddress")
            protected StructuredAddrType structuredAddress;

            /**
             * Gets the value of the airportCode property.
             * 
             * @return
             *     possible object is
             *     {@link AirportCode }
             *     
             */
            public AirportCode getAirportCode() {
                return airportCode;
            }

            /**
             * Sets the value of the airportCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirportCode }
             *     
             */
            public void setAirportCode(AirportCode value) {
                this.airportCode = value;
            }

            /**
             * Gets the value of the structuredAddress property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredAddrType }
             *     
             */
            public StructuredAddrType getStructuredAddress() {
                return structuredAddress;
            }

            /**
             * Sets the value of the structuredAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredAddrType }
             *     
             */
            public void setStructuredAddress(StructuredAddrType value) {
                this.structuredAddress = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Start" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="End" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
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
        @XmlType(name = "", propOrder = {
            "start",
            "end"
        })
        public static class OfferValidDates {

            @XmlElement(name = "Start")
            protected FulfillmentPartnerType.Fulfillment.OfferValidDates.Start start;
            @XmlElement(name = "End")
            protected FulfillmentPartnerType.Fulfillment.OfferValidDates.End end;

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link FulfillmentPartnerType.Fulfillment.OfferValidDates.Start }
             *     
             */
            public FulfillmentPartnerType.Fulfillment.OfferValidDates.Start getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link FulfillmentPartnerType.Fulfillment.OfferValidDates.Start }
             *     
             */
            public void setStart(FulfillmentPartnerType.Fulfillment.OfferValidDates.Start value) {
                this.start = value;
            }

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link FulfillmentPartnerType.Fulfillment.OfferValidDates.End }
             *     
             */
            public FulfillmentPartnerType.Fulfillment.OfferValidDates.End getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link FulfillmentPartnerType.Fulfillment.OfferValidDates.End }
             *     
             */
            public void setEnd(FulfillmentPartnerType.Fulfillment.OfferValidDates.End value) {
                this.end = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class End
                extends CoreDateGrpType
            {


            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Start
                extends CoreDateGrpType
            {


            }

        }

    }

}
