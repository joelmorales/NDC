
package org.iata.oo.schema.ServiceDeliveryRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * OPTIONAL SERVICE FULFILLMENT representation, including Date/ Time Period, Location, Fulfillment Company.
 * 
 * <p>Java class for ServiceFulfillmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFulfillmentType"&gt;
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
 *         &lt;element name="Provider" type="{http://www.iata.org/IATA/EDIST/2017.1}FulfillmentPartnerType" minOccurs="0"/&gt;
 *         &lt;element name="Location" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportFulfillmentLocation"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OtherFulfillmentLocation"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "ServiceFulfillmentType", propOrder = {
    "offerValidDates",
    "provider",
    "location"
})
public class ServiceFulfillmentType {

    @XmlElement(name = "OfferValidDates")
    protected ServiceFulfillmentType.OfferValidDates offerValidDates;
    @XmlElement(name = "Provider")
    protected FulfillmentPartnerType provider;
    @XmlElement(name = "Location")
    protected ServiceFulfillmentType.Location location;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the offerValidDates property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFulfillmentType.OfferValidDates }
     *     
     */
    public ServiceFulfillmentType.OfferValidDates getOfferValidDates() {
        return offerValidDates;
    }

    /**
     * Sets the value of the offerValidDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFulfillmentType.OfferValidDates }
     *     
     */
    public void setOfferValidDates(ServiceFulfillmentType.OfferValidDates value) {
        this.offerValidDates = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentPartnerType }
     *     
     */
    public FulfillmentPartnerType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentPartnerType }
     *     
     */
    public void setProvider(FulfillmentPartnerType value) {
        this.provider = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFulfillmentType.Location }
     *     
     */
    public ServiceFulfillmentType.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFulfillmentType.Location }
     *     
     */
    public void setLocation(ServiceFulfillmentType.Location value) {
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportFulfillmentLocation"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OtherFulfillmentLocation"/&gt;
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
        "airportFulfillmentLocation",
        "otherFulfillmentLocation"
    })
    public static class Location {

        @XmlElement(name = "AirportFulfillmentLocation", required = true)
        protected SrvcLocationAirportType airportFulfillmentLocation;
        @XmlElement(name = "OtherFulfillmentLocation", required = true)
        protected SrvcLocationAddressType otherFulfillmentLocation;

        /**
         * Gets the value of the airportFulfillmentLocation property.
         * 
         * @return
         *     possible object is
         *     {@link SrvcLocationAirportType }
         *     
         */
        public SrvcLocationAirportType getAirportFulfillmentLocation() {
            return airportFulfillmentLocation;
        }

        /**
         * Sets the value of the airportFulfillmentLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SrvcLocationAirportType }
         *     
         */
        public void setAirportFulfillmentLocation(SrvcLocationAirportType value) {
            this.airportFulfillmentLocation = value;
        }

        /**
         * Gets the value of the otherFulfillmentLocation property.
         * 
         * @return
         *     possible object is
         *     {@link SrvcLocationAddressType }
         *     
         */
        public SrvcLocationAddressType getOtherFulfillmentLocation() {
            return otherFulfillmentLocation;
        }

        /**
         * Sets the value of the otherFulfillmentLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SrvcLocationAddressType }
         *     
         */
        public void setOtherFulfillmentLocation(SrvcLocationAddressType value) {
            this.otherFulfillmentLocation = value;
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
        protected ServiceFulfillmentType.OfferValidDates.Start start;
        @XmlElement(name = "End")
        protected ServiceFulfillmentType.OfferValidDates.End end;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFulfillmentType.OfferValidDates.Start }
         *     
         */
        public ServiceFulfillmentType.OfferValidDates.Start getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFulfillmentType.OfferValidDates.Start }
         *     
         */
        public void setStart(ServiceFulfillmentType.OfferValidDates.Start value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFulfillmentType.OfferValidDates.End }
         *     
         */
        public ServiceFulfillmentType.OfferValidDates.End getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFulfillmentType.OfferValidDates.End }
         *     
         */
        public void setEnd(ServiceFulfillmentType.OfferValidDates.End value) {
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
