//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.25 at 04:04:58 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Affinity Query Country Flight Arrival (Destination) information.
 * 
 * <p>Java class for AffinityCountryArriveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityCountryArriveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/EDIST/2017.1}CountryQueryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityCountryArriveType", propOrder = {
    "arrival"
})
public class AffinityCountryArriveType {

    @XmlElement(name = "Arrival", required = true)
    protected CountryQueryType arrival;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link CountryQueryType }
     *     
     */
    public CountryQueryType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryQueryType }
     *     
     */
    public void setArrival(CountryQueryType value) {
        this.arrival = value;
    }

}
