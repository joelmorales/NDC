
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * Order Item association(s).
 * 
 * <p>Java class for OrderItemAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Passengers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReferences"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Group" type="{http://www.iata.org/IATA/EDIST/2017.1}GroupType" minOccurs="0"/&gt;
 *         &lt;element name="Flight" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;choice maxOccurs="2"&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestinationReferences"/&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReferences"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrderItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OrderItemID" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OfferItems" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferItemID" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Services" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceID" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OtherAssociations" type="{http://www.iata.org/IATA/EDIST/2017.1}OtherOrderAssocType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="AllPassengersInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="WholeItineraryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemAssociationType", propOrder = {
    "passengers",
    "group",
    "flight",
    "orderItems",
    "offerItems",
    "services",
    "otherAssociations"
})
public class OrderItemAssociationType {

    @XmlElementWrapper(name = "Passengers")
    @XmlElement(name = "PassengerReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<Object> passengers;
    @XmlElement(name = "Group")
    protected GroupType group;
    @XmlElement(name = "Flight")
    protected OrderItemAssociationType.Flight flight;
    @XmlElementWrapper(name = "OrderItems")
    @XmlElement(name = "OrderItemID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<ItemIDType> orderItems;
    @XmlElementWrapper(name = "OfferItems")
    @XmlElement(name = "OfferItemID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<ItemIDType> offerItems;
    @XmlElementWrapper(name = "Services")
    @XmlElement(name = "ServiceID", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<ServiceIDType> services;
    @XmlElementWrapper(name = "OtherAssociations")
    @XmlElement(name = "OtherAssociation", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<OtherAssociation> otherAssociations;
    @XmlAttribute(name = "AllPassengersInd")
    protected Boolean allPassengersInd;
    @XmlAttribute(name = "WholeItineraryInd")
    protected Boolean wholeItineraryInd;

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link GroupType }
     *     
     */
    public GroupType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupType }
     *     
     */
    public void setGroup(GroupType value) {
        this.group = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemAssociationType.Flight }
     *     
     */
    public OrderItemAssociationType.Flight getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemAssociationType.Flight }
     *     
     */
    public void setFlight(OrderItemAssociationType.Flight value) {
        this.flight = value;
    }

    /**
     * Gets the value of the allPassengersInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllPassengersInd() {
        return allPassengersInd;
    }

    /**
     * Sets the value of the allPassengersInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllPassengersInd(Boolean value) {
        this.allPassengersInd = value;
    }

    /**
     * Gets the value of the wholeItineraryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWholeItineraryInd() {
        return wholeItineraryInd;
    }

    /**
     * Sets the value of the wholeItineraryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWholeItineraryInd(Boolean value) {
        this.wholeItineraryInd = value;
    }

    public List<Object> getPassengers() {
        if (passengers == null) {
            passengers = new ArrayList<Object>();
        }
        return passengers;
    }

    public void setPassengers(List<Object> passengers) {
        this.passengers = passengers;
    }

    public List<ItemIDType> getOrderItems() {
        if (orderItems == null) {
            orderItems = new ArrayList<ItemIDType>();
        }
        return orderItems;
    }

    public void setOrderItems(List<ItemIDType> orderItems) {
        this.orderItems = orderItems;
    }

    public List<ItemIDType> getOfferItems() {
        if (offerItems == null) {
            offerItems = new ArrayList<ItemIDType>();
        }
        return offerItems;
    }

    public void setOfferItems(List<ItemIDType> offerItems) {
        this.offerItems = offerItems;
    }

    public List<ServiceIDType> getServices() {
        if (services == null) {
            services = new ArrayList<ServiceIDType>();
        }
        return services;
    }

    public void setServices(List<ServiceIDType> services) {
        this.services = services;
    }

    public List<OtherAssociation> getOtherAssociations() {
        if (otherAssociations == null) {
            otherAssociations = new ArrayList<OtherAssociation>();
        }
        return otherAssociations;
    }

    public void setOtherAssociations(List<OtherAssociation> otherAssociations) {
        this.otherAssociations = otherAssociations;
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
     *         &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;choice maxOccurs="2"&gt;
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestinationReferences"/&gt;
     *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReferences"/&gt;
     *         &lt;/choice&gt;
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
        "allFlightInd",
        "allOriginDestinationInd",
        "allSegmentInd",
        "originDestinationReferencesOrSegmentReferences"
    })
    public static class Flight {

        @XmlElement(name = "AllFlightInd")
        protected Boolean allFlightInd;
        @XmlElement(name = "AllOriginDestinationInd")
        protected Boolean allOriginDestinationInd;
        @XmlElement(name = "AllSegmentInd")
        protected Boolean allSegmentInd;
        @XmlElementRefs({
            @XmlElementRef(name = "OriginDestinationReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "SegmentReferences", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = SegmentReferences.class, required = false)
        })
        protected List<Object> originDestinationReferencesOrSegmentReferences;

        /**
         * Gets the value of the allFlightInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllFlightInd() {
            return allFlightInd;
        }

        /**
         * Sets the value of the allFlightInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllFlightInd(Boolean value) {
            this.allFlightInd = value;
        }

        /**
         * Gets the value of the allOriginDestinationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllOriginDestinationInd() {
            return allOriginDestinationInd;
        }

        /**
         * Sets the value of the allOriginDestinationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllOriginDestinationInd(Boolean value) {
            this.allOriginDestinationInd = value;
        }

        /**
         * Gets the value of the allSegmentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllSegmentInd() {
            return allSegmentInd;
        }

        /**
         * Sets the value of the allSegmentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllSegmentInd(Boolean value) {
            this.allSegmentInd = value;
        }

        /**
         * Gets the value of the originDestinationReferencesOrSegmentReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationReferencesOrSegmentReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationReferencesOrSegmentReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link List }{@code <}{@link Object }{@code >}{@code >}
         * {@link SegmentReferences }
         * 
         * 
         */
        public List<Object> getOriginDestinationReferencesOrSegmentReferences() {
            if (originDestinationReferencesOrSegmentReferences == null) {
                originDestinationReferencesOrSegmentReferences = new ArrayList<Object>();
            }
            return this.originDestinationReferencesOrSegmentReferences;
        }

    }

}
