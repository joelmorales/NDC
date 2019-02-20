
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for OPERATING CARRIER Supplier Role with Optional Flight Number.
 * 
 * <p>Java class for OperatingCarrierFlightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperatingCarrierFlightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlineID"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FlightNumber"/&gt;
 *         &lt;element name="ResBookDesigCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingCarrierFlightType", propOrder = {
    "airlineID",
    "name",
    "flightNumber",
    "resBookDesigCode"
})
public class OperatingCarrierFlightType {

    @XmlElement(name = "AirlineID", required = true)
    protected AirlineIDType airlineID;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FlightNumber", required = true)
    protected FlightNumber flightNumber;
    @XmlElement(name = "ResBookDesigCode", required = true)
    protected String resBookDesigCode;

    /**
     * A two-character alpha-numeric code assigned according to the IATA Resolution 762 or a three-letter airline designator assigned by ICAO.  Refer to IATA Airline Coding Directory.
     * 
     * @return
     *     possible object is
     *     {@link AirlineIDType }
     *     
     */
    public AirlineIDType getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineIDType }
     *     
     */
    public void setAirlineID(AirlineIDType value) {
        this.airlineID = value;
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
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link FlightNumber }
     *     
     */
    public FlightNumber getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightNumber }
     *     
     */
    public void setFlightNumber(FlightNumber value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the resBookDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesigCode() {
        return resBookDesigCode;
    }

    /**
     * Sets the value of the resBookDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesigCode(String value) {
        this.resBookDesigCode = value;
    }

}
