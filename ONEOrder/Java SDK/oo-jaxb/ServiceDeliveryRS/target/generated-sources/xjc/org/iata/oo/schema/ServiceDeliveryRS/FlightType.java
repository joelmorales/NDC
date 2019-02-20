
package org.iata.oo.schema.ServiceDeliveryRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * A data type for a Flight.
 * 
 * <p>Java class for FlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DepartureCode"/&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ArrivalCode"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="JourneyTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="SegmentList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Segment" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Departure"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Arrival"/&gt;
 *                             &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierFlightType"/&gt;
 *                             &lt;element name="OperatingCarrier" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierFlightType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Equipment" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AircraftCode" minOccurs="0"/&gt;
 *                                       &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
 *                                       &lt;element name="EquipmentCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Details" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightDetailType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightType", propOrder = {
    "departureCode",
    "arrivalCode",
    "journeyTime",
    "segmentList"
})
public class FlightType {

    @XmlElement(name = "DepartureCode", required = true)
    protected DepartureCode departureCode;
    @XmlElement(name = "ArrivalCode", required = true)
    protected ArrivalCode arrivalCode;
    @XmlElement(name = "JourneyTime")
    protected Duration journeyTime;
    @XmlElementWrapper(name = "SegmentList", required = true)
    @XmlElement(name = "Segment", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<FlightType.Segment> segmentList;

    /**
     * Departure Airport Location code. Example: TPA
     * 
     * Encoding Scheme: IATA/ A4A (three character) Airport or City Code
     * 
     * @return
     *     possible object is
     *     {@link DepartureCode }
     *     
     */
    public DepartureCode getDepartureCode() {
        return departureCode;
    }

    /**
     * Sets the value of the departureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureCode }
     *     
     */
    public void setDepartureCode(DepartureCode value) {
        this.departureCode = value;
    }

    /**
     * Airport or a city code. Use a three letter  location identifier assigned according to the IATA Resolution 763.  Refer to IATA Airline Coding Directory . Example: TPA
     * 
     * @return
     *     possible object is
     *     {@link ArrivalCode }
     *     
     */
    public ArrivalCode getArrivalCode() {
        return arrivalCode;
    }

    /**
     * Sets the value of the arrivalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalCode }
     *     
     */
    public void setArrivalCode(ArrivalCode value) {
        this.arrivalCode = value;
    }

    /**
     * Gets the value of the journeyTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getJourneyTime() {
        return journeyTime;
    }

    /**
     * Sets the value of the journeyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setJourneyTime(Duration value) {
        this.journeyTime = value;
    }

    public List<FlightType.Segment> getSegmentList() {
        if (segmentList == null) {
            segmentList = new ArrayList<FlightType.Segment>();
        }
        return segmentList;
    }

    public void setSegmentList(List<FlightType.Segment> segmentList) {
        this.segmentList = segmentList;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Departure"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Arrival"/&gt;
     *         &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}MarketingCarrierFlightType"/&gt;
     *         &lt;element name="OperatingCarrier" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierFlightType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Equipment" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AircraftCode" minOccurs="0"/&gt;
     *                   &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
     *                   &lt;element name="EquipmentCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Details" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightDetailType" minOccurs="0"/&gt;
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
        "departure",
        "arrival",
        "marketingCarrier",
        "operatingCarrier",
        "equipment",
        "details"
    })
    public static class Segment {

        @XmlElement(name = "Departure", required = true)
        protected Departure departure;
        @XmlElement(name = "Arrival", required = true)
        protected FlightArrivalType arrival;
        @XmlElement(name = "MarketingCarrier", required = true)
        protected MarketingCarrierFlightType marketingCarrier;
        @XmlElement(name = "OperatingCarrier")
        protected FlightType.Segment.OperatingCarrier operatingCarrier;
        @XmlElement(name = "Equipment")
        protected FlightType.Segment.Equipment equipment;
        @XmlElement(name = "Details")
        protected FlightDetailType details;

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
         *     {@link FlightType.Segment.OperatingCarrier }
         *     
         */
        public FlightType.Segment.OperatingCarrier getOperatingCarrier() {
            return operatingCarrier;
        }

        /**
         * Sets the value of the operatingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightType.Segment.OperatingCarrier }
         *     
         */
        public void setOperatingCarrier(FlightType.Segment.OperatingCarrier value) {
            this.operatingCarrier = value;
        }

        /**
         * Gets the value of the equipment property.
         * 
         * @return
         *     possible object is
         *     {@link FlightType.Segment.Equipment }
         *     
         */
        public FlightType.Segment.Equipment getEquipment() {
            return equipment;
        }

        /**
         * Sets the value of the equipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightType.Segment.Equipment }
         *     
         */
        public void setEquipment(FlightType.Segment.Equipment value) {
            this.equipment = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AircraftCode" minOccurs="0"/&gt;
         *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="EquipmentCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/&gt;
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
            "aircraftCode",
            "name",
            "equipmentCode"
        })
        public static class Equipment {

            @XmlElement(name = "AircraftCode")
            protected AircraftCode aircraftCode;
            @XmlElement(name = "Name")
            protected String name;
            @XmlElement(name = "EquipmentCode")
            protected String equipmentCode;

            /**
             * Equipment Code. Example: 737
             * 							
             * 							Encoding Scheme: IATA/ A4A Equipment Code
             * 
             * @return
             *     possible object is
             *     {@link AircraftCode }
             *     
             */
            public AircraftCode getAircraftCode() {
                return aircraftCode;
            }

            /**
             * Sets the value of the aircraftCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link AircraftCode }
             *     
             */
            public void setAircraftCode(AircraftCode value) {
                this.aircraftCode = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}OperatingCarrierFlightType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OperatingCarrier
            extends OperatingCarrierFlightType
        {


        }

    }

}
