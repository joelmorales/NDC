
package org.iata.oo.schema.ServiceDeliveryRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * OPTIONAL SERVICE CORE definition.
 * 
 * <p>Java class for ServiceCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="Segment"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="SegmentKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                     &lt;element name="Status"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType"/&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                             &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Departure"/&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Arrival"/&gt;
 *                     &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierFlightType"/&gt;
 *                     &lt;element name="OperatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierFlightType" minOccurs="0"/&gt;
 *                     &lt;element name="EquipmentCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/&gt;
 *                     &lt;element name="Details" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightDetailType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ServiceSelection"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                     &lt;element name="ServiceDefinition" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDefinitionType"/&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceQuantityRules" minOccurs="0"/&gt;
 *         &lt;element name="OfferValidDates"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Start"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="End"&gt;
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
 *         &lt;element name="Provider" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="PassengerRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PartnerID"/&gt;
 *         &lt;element name="ServiceSettlementValue"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType"/&gt;
 *                   &lt;element name="SettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TimeLimits" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatItem" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}BaggageItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCoreType", propOrder = {
    "segment",
    "serviceSelection",
    "serviceQuantityRules",
    "offerValidDates",
    "provider",
    "passengerRef",
    "partnerID",
    "serviceSettlementValue",
    "timeLimits",
    "seatItem",
    "baggageItem"
})
@XmlSeeAlso({
    ServiceDetailType.class
})
public class ServiceCoreType {

    @XmlElement(name = "Segment")
    protected ServiceCoreType.Segment segment;
    @XmlElement(name = "ServiceSelection")
    protected ServiceCoreType.ServiceSelection serviceSelection;
    @XmlElement(name = "ServiceQuantityRules")
    protected ServiceQuantityType serviceQuantityRules;
    @XmlElement(name = "OfferValidDates", required = true)
    protected ServiceCoreType.OfferValidDates offerValidDates;
    @XmlElement(name = "Provider")
    protected Object provider;
    @XmlElement(name = "PassengerRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object passengerRef;
    @XmlElement(name = "PartnerID", required = true)
    protected PartnerCompanyIDType partnerID;
    @XmlElement(name = "ServiceSettlementValue", required = true)
    protected ServiceCoreType.ServiceSettlementValue serviceSettlementValue;
    @XmlElementWrapper(name = "TimeLimits")
    @XmlElement(name = "TimeLimit", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<TimeLimit> timeLimits;
    @XmlElement(name = "SeatItem")
    protected SeatItem seatItem;
    @XmlElement(name = "BaggageItem")
    protected BaggageItemType baggageItem;
    @XmlAttribute(name = "ServiceID")
    protected String serviceID;
    @XmlAttribute(name = "Owner")
    protected String owner;

    /**
     * Gets the value of the segment property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCoreType.Segment }
     *     
     */
    public ServiceCoreType.Segment getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCoreType.Segment }
     *     
     */
    public void setSegment(ServiceCoreType.Segment value) {
        this.segment = value;
    }

    /**
     * Gets the value of the serviceSelection property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCoreType.ServiceSelection }
     *     
     */
    public ServiceCoreType.ServiceSelection getServiceSelection() {
        return serviceSelection;
    }

    /**
     * Sets the value of the serviceSelection property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCoreType.ServiceSelection }
     *     
     */
    public void setServiceSelection(ServiceCoreType.ServiceSelection value) {
        this.serviceSelection = value;
    }

    /**
     * Gets the value of the serviceQuantityRules property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQuantityType }
     *     
     */
    public ServiceQuantityType getServiceQuantityRules() {
        return serviceQuantityRules;
    }

    /**
     * Sets the value of the serviceQuantityRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQuantityType }
     *     
     */
    public void setServiceQuantityRules(ServiceQuantityType value) {
        this.serviceQuantityRules = value;
    }

    /**
     * Gets the value of the offerValidDates property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCoreType.OfferValidDates }
     *     
     */
    public ServiceCoreType.OfferValidDates getOfferValidDates() {
        return offerValidDates;
    }

    /**
     * Sets the value of the offerValidDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCoreType.OfferValidDates }
     *     
     */
    public void setOfferValidDates(ServiceCoreType.OfferValidDates value) {
        this.offerValidDates = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setProvider(Object value) {
        this.provider = value;
    }

    /**
     * Gets the value of the passengerRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPassengerRef() {
        return passengerRef;
    }

    /**
     * Sets the value of the passengerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPassengerRef(Object value) {
        this.passengerRef = value;
    }

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerCompanyIDType }
     *     
     */
    public PartnerCompanyIDType getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerCompanyIDType }
     *     
     */
    public void setPartnerID(PartnerCompanyIDType value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the serviceSettlementValue property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCoreType.ServiceSettlementValue }
     *     
     */
    public ServiceCoreType.ServiceSettlementValue getServiceSettlementValue() {
        return serviceSettlementValue;
    }

    /**
     * Sets the value of the serviceSettlementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCoreType.ServiceSettlementValue }
     *     
     */
    public void setServiceSettlementValue(ServiceCoreType.ServiceSettlementValue value) {
        this.serviceSettlementValue = value;
    }

    /**
     * Gets the value of the seatItem property.
     * 
     * @return
     *     possible object is
     *     {@link SeatItem }
     *     
     */
    public SeatItem getSeatItem() {
        return seatItem;
    }

    /**
     * Sets the value of the seatItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatItem }
     *     
     */
    public void setSeatItem(SeatItem value) {
        this.seatItem = value;
    }

    /**
     * Gets the value of the baggageItem property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageItemType }
     *     
     */
    public BaggageItemType getBaggageItem() {
        return baggageItem;
    }

    /**
     * Sets the value of the baggageItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageItemType }
     *     
     */
    public void setBaggageItem(BaggageItemType value) {
        this.baggageItem = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    public List<TimeLimit> getTimeLimits() {
        if (timeLimits == null) {
            timeLimits = new ArrayList<TimeLimit>();
        }
        return timeLimits;
    }

    public void setTimeLimits(List<TimeLimit> timeLimits) {
        this.timeLimits = timeLimits;
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
     *         &lt;element name="Start"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CoreDateGrpType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="End"&gt;
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

        @XmlElement(name = "Start", required = true)
        protected ServiceCoreType.OfferValidDates.Start start;
        @XmlElement(name = "End", required = true)
        protected ServiceCoreType.OfferValidDates.End end;

        /**
         * Gets the value of the start property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCoreType.OfferValidDates.Start }
         *     
         */
        public ServiceCoreType.OfferValidDates.Start getStart() {
            return start;
        }

        /**
         * Sets the value of the start property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCoreType.OfferValidDates.Start }
         *     
         */
        public void setStart(ServiceCoreType.OfferValidDates.Start value) {
            this.start = value;
        }

        /**
         * Gets the value of the end property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCoreType.OfferValidDates.End }
         *     
         */
        public ServiceCoreType.OfferValidDates.End getEnd() {
            return end;
        }

        /**
         * Sets the value of the end property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCoreType.OfferValidDates.End }
         *     
         */
        public void setEnd(ServiceCoreType.OfferValidDates.End value) {
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
     *         &lt;element name="SegmentKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Status"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Departure"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Arrival"/&gt;
     *         &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierFlightType"/&gt;
     *         &lt;element name="OperatingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierFlightType" minOccurs="0"/&gt;
     *         &lt;element name="EquipmentCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/&gt;
     *         &lt;element name="Details" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightDetailType"/&gt;
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
        "segmentKey",
        "status",
        "departure",
        "arrival",
        "marketingCarrier",
        "operatingCarrier",
        "equipmentCode",
        "details"
    })
    public static class Segment {

        @XmlElement(name = "SegmentKey", required = true)
        protected String segmentKey;
        @XmlElement(name = "Status", required = true)
        protected ServiceCoreType.Segment.Status status;
        @XmlElement(name = "Departure", required = true)
        protected Departure departure;
        @XmlElement(name = "Arrival", required = true)
        protected FlightArrivalType arrival;
        @XmlElement(name = "MarketingCarrier", required = true)
        protected MarketingCarrierFlightType marketingCarrier;
        @XmlElement(name = "OperatingCarrier")
        protected OperatingCarrierFlightType operatingCarrier;
        @XmlElement(name = "EquipmentCode")
        protected String equipmentCode;
        @XmlElement(name = "Details", required = true)
        protected FlightDetailType details;

        /**
         * Gets the value of the segmentKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegmentKey() {
            return segmentKey;
        }

        /**
         * Sets the value of the segmentKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegmentKey(String value) {
            this.segmentKey = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCoreType.Segment.Status }
         *     
         */
        public ServiceCoreType.Segment.Status getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCoreType.Segment.Status }
         *     
         */
        public void setStatus(ServiceCoreType.Segment.Status value) {
            this.status = value;
        }

        /**
         * Gets the value of the departure property.
         * 
         * @return
         *     possible object is
         *     {@link Departure }
         *     
         */
        public Departure getDeparture() {
            return departure;
        }

        /**
         * Sets the value of the departure property.
         * 
         * @param value
         *     allowed object is
         *     {@link Departure }
         *     
         */
        public void setDeparture(Departure value) {
            this.departure = value;
        }

        /**
         * Gets the value of the arrival property.
         * 
         * @return
         *     possible object is
         *     {@link FlightArrivalType }
         *     
         */
        public FlightArrivalType getArrival() {
            return arrival;
        }

        /**
         * Sets the value of the arrival property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightArrivalType }
         *     
         */
        public void setArrival(FlightArrivalType value) {
            this.arrival = value;
        }

        /**
         * Gets the value of the marketingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link MarketingCarrierFlightType }
         *     
         */
        public MarketingCarrierFlightType getMarketingCarrier() {
            return marketingCarrier;
        }

        /**
         * Sets the value of the marketingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link MarketingCarrierFlightType }
         *     
         */
        public void setMarketingCarrier(MarketingCarrierFlightType value) {
            this.marketingCarrier = value;
        }

        /**
         * Gets the value of the operatingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link OperatingCarrierFlightType }
         *     
         */
        public OperatingCarrierFlightType getOperatingCarrier() {
            return operatingCarrier;
        }

        /**
         * Sets the value of the operatingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingCarrierFlightType }
         *     
         */
        public void setOperatingCarrier(OperatingCarrierFlightType value) {
            this.operatingCarrier = value;
        }

        /**
         * Gets the value of the equipmentCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipmentCode() {
            return equipmentCode;
        }

        /**
         * Sets the value of the equipmentCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipmentCode(String value) {
            this.equipmentCode = value;
        }

        /**
         * Gets the value of the details property.
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailType }
         *     
         */
        public FlightDetailType getDetails() {
            return details;
        }

        /**
         * Sets the value of the details property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailType }
         *     
         */
        public void setDetails(FlightDetailType value) {
            this.details = value;
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
         *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "statusCode"
        })
        public static class Status {

            @XmlElement(name = "StatusCode", required = true)
            protected CodesetType statusCode;
            @XmlAttribute(name = "ChangeOfGaugeInd")
            protected Boolean changeOfGaugeInd;
            @XmlAttribute(name = "ScheduleChangeInd")
            protected Boolean scheduleChangeInd;

            /**
             * Gets the value of the statusCode property.
             * 
             * @return
             *     possible object is
             *     {@link CodesetType }
             *     
             */
            public CodesetType getStatusCode() {
                return statusCode;
            }

            /**
             * Sets the value of the statusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodesetType }
             *     
             */
            public void setStatusCode(CodesetType value) {
                this.statusCode = value;
            }

            /**
             * Gets the value of the changeOfGaugeInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isChangeOfGaugeInd() {
                return changeOfGaugeInd;
            }

            /**
             * Sets the value of the changeOfGaugeInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setChangeOfGaugeInd(Boolean value) {
                this.changeOfGaugeInd = value;
            }

            /**
             * Gets the value of the scheduleChangeInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isScheduleChangeInd() {
                return scheduleChangeInd;
            }

            /**
             * Sets the value of the scheduleChangeInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setScheduleChangeInd(Boolean value) {
                this.scheduleChangeInd = value;
            }

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
     *         &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="ServiceDefinition" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDefinitionType"/&gt;
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
        "segmentID",
        "serviceDefinition"
    })
    public static class ServiceSelection {

        @XmlElement(name = "SegmentID")
        protected String segmentID;
        @XmlElement(name = "ServiceDefinition", required = true)
        protected ServiceDefinitionType serviceDefinition;

        /**
         * Gets the value of the segmentID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegmentID() {
            return segmentID;
        }

        /**
         * Sets the value of the segmentID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegmentID(String value) {
            this.segmentID = value;
        }

        /**
         * Gets the value of the serviceDefinition property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceDefinitionType }
         *     
         */
        public ServiceDefinitionType getServiceDefinition() {
            return serviceDefinition;
        }

        /**
         * Sets the value of the serviceDefinition property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceDefinitionType }
         *     
         */
        public void setServiceDefinition(ServiceDefinitionType value) {
            this.serviceDefinition = value;
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
     *         &lt;element name="Method" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType"/&gt;
     *         &lt;element name="SettlementValue" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/&gt;
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
        "method",
        "settlementValue"
    })
    public static class ServiceSettlementValue {

        @XmlElement(name = "Method", required = true)
        protected CodesetType method;
        @XmlElement(name = "SettlementValue")
        protected CurrencyAmountOptType settlementValue;

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setMethod(CodesetType value) {
            this.method = value;
        }

        /**
         * Gets the value of the settlementValue property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getSettlementValue() {
            return settlementValue;
        }

        /**
         * Sets the value of the settlementValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setSettlementValue(CurrencyAmountOptType value) {
            this.settlementValue = value;
        }

    }

}
