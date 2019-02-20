
package org.iata.oo.schema.ServiceDeliveryRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SegmentList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
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
    "segmentList"
})
public class FlightType {

    @XmlElement(name = "DepartureCode", required = true)
    protected DepartureCode departureCode;
    @XmlElement(name = "ArrivalCode", required = true)
    protected ArrivalCode arrivalCode;
    @XmlElement(name = "SegmentList", required = true)
    protected FlightType.SegmentList segmentList;

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
     * Gets the value of the segmentList property.
     * 
     * @return
     *     possible object is
     *     {@link FlightType.SegmentList }
     *     
     */
    public FlightType.SegmentList getSegmentList() {
        return segmentList;
    }

    /**
     * Sets the value of the segmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightType.SegmentList }
     *     
     */
    public void setSegmentList(FlightType.SegmentList value) {
        this.segmentList = value;
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
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SegmentList {


    }

}
