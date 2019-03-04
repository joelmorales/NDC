//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:52:55 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight that the offer applies to.
 * 
 * <p>Java class for FlightInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightSegmentReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OriginDestinationReferences" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightReferences" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoAssocType", propOrder = {
    "allSegmentInd",
    "flightSegmentReference",
    "allOriginDestinationInd",
    "originDestinationReferences",
    "allFlightInd",
    "flightReferences"
})
@XmlSeeAlso({
    ApplicableFlight.class
})
public class FlightInfoAssocType {

    @XmlElement(name = "AllSegmentInd")
    protected Boolean allSegmentInd;
    @XmlElement(name = "FlightSegmentReference")
    protected List<FlightSegmentReference> flightSegmentReference;
    @XmlElement(name = "AllOriginDestinationInd")
    protected Boolean allOriginDestinationInd;
    @XmlList
    @XmlElement(name = "OriginDestinationReferences")
    @XmlIDREF
    protected List<Object> originDestinationReferences;
    @XmlElement(name = "AllFlightInd")
    protected Boolean allFlightInd;
    @XmlElement(name = "FlightReferences")
    protected FlightReferences flightReferences;

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
     * Association to to single Flight  segment instance(s). Example: segment1 Gets the value of the flightSegmentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentReference }
     * 
     * 
     */
    public List<FlightSegmentReference> getFlightSegmentReference() {
        if (flightSegmentReference == null) {
            flightSegmentReference = new ArrayList<FlightSegmentReference>();
        }
        return this.flightSegmentReference;
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
     * Gets the value of the originDestinationReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOriginDestinationReferences() {
        if (originDestinationReferences == null) {
            originDestinationReferences = new ArrayList<Object>();
        }
        return this.originDestinationReferences;
    }

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
     * Gets the value of the flightReferences property.
     * 
     * @return
     *     possible object is
     *     {@link FlightReferences }
     *     
     */
    public FlightReferences getFlightReferences() {
        return flightReferences;
    }

    /**
     * Sets the value of the flightReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightReferences }
     *     
     */
    public void setFlightReferences(FlightReferences value) {
        this.flightReferences = value;
    }

}
