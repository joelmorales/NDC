
package org.iata.oo.schema.ServiceDeliveryRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * FLIGHT STOP LOCATION definition.
 * 
 * <p>Java class for StopLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StopLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StopLocation" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportCode"/&gt;
 *                   &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
 *                   &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="ArrivalTime" type="{http://www.iata.org/IATA/EDIST/2017.1}TimeSimpleType"/&gt;
 *                   &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="DepartureTime" type="{http://www.iata.org/IATA/EDIST/2017.1}TimeSimpleType"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Equipment" minOccurs="0"/&gt;
 *                   &lt;element name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StopLocationType", propOrder = {
    "stopLocation"
})
public class StopLocationType {

    @XmlElement(name = "StopLocation", required = true)
    protected List<StopLocationType.StopLocation> stopLocation;
    @XmlAttribute(name = "ChangeOfGaugeInd")
    protected Boolean changeOfGaugeInd;

    /**
     * Gets the value of the stopLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stopLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStopLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StopLocationType.StopLocation }
     * 
     * 
     */
    public List<StopLocationType.StopLocation> getStopLocation() {
        if (stopLocation == null) {
            stopLocation = new ArrayList<StopLocationType.StopLocation>();
        }
        return this.stopLocation;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirportCode"/&gt;
     *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
     *         &lt;element name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="ArrivalTime" type="{http://www.iata.org/IATA/EDIST/2017.1}TimeSimpleType"/&gt;
     *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="DepartureTime" type="{http://www.iata.org/IATA/EDIST/2017.1}TimeSimpleType"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Equipment" minOccurs="0"/&gt;
     *         &lt;element name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
        "airportCode",
        "name",
        "arrivalDate",
        "arrivalTime",
        "departureDate",
        "departureTime",
        "equipment",
        "groundTime"
    })
    public static class StopLocation {

        @XmlElement(name = "AirportCode", required = true)
        protected AirportCode airportCode;
        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "ArrivalDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar arrivalDate;
        @XmlElement(name = "ArrivalTime", required = true)
        protected String arrivalTime;
        @XmlElement(name = "DepartureDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar departureDate;
        @XmlElement(name = "DepartureTime", required = true)
        protected String departureTime;
        @XmlElement(name = "Equipment")
        protected AircraftSummaryType equipment;
        @XmlElement(name = "GroundTime")
        protected Duration groundTime;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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
         * Gets the value of the arrivalDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getArrivalDate() {
            return arrivalDate;
        }

        /**
         * Sets the value of the arrivalDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setArrivalDate(XMLGregorianCalendar value) {
            this.arrivalDate = value;
        }

        /**
         * Gets the value of the arrivalTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getArrivalTime() {
            return arrivalTime;
        }

        /**
         * Sets the value of the arrivalTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setArrivalTime(String value) {
            this.arrivalTime = value;
        }

        /**
         * Gets the value of the departureDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureDate() {
            return departureDate;
        }

        /**
         * Sets the value of the departureDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureDate(XMLGregorianCalendar value) {
            this.departureDate = value;
        }

        /**
         * Gets the value of the departureTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartureTime() {
            return departureTime;
        }

        /**
         * Sets the value of the departureTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartureTime(String value) {
            this.departureTime = value;
        }

        /**
         * Gets the value of the equipment property.
         * 
         * @return
         *     possible object is
         *     {@link AircraftSummaryType }
         *     
         */
        public AircraftSummaryType getEquipment() {
            return equipment;
        }

        /**
         * Sets the value of the equipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link AircraftSummaryType }
         *     
         */
        public void setEquipment(AircraftSummaryType value) {
            this.equipment = value;
        }

        /**
         * Gets the value of the groundTime property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getGroundTime() {
            return groundTime;
        }

        /**
         * Sets the value of the groundTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setGroundTime(Duration value) {
            this.groundTime = value;
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

    }

}
