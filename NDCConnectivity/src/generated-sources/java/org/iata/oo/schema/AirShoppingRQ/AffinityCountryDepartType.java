//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:52:55 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Affinity Query Country Flight Departure (Origin) information.
 * 
 * <p>Java class for AffinityCountryDepartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityCountryDepartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Departure" type="{http://www.iata.org/IATA/EDIST/2017.1}CountryQueryType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityCountryDepartType", propOrder = {
    "departure"
})
public class AffinityCountryDepartType {

    @XmlElement(name = "Departure", required = true)
    protected CountryQueryType departure;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link CountryQueryType }
     *     
     */
    public CountryQueryType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryQueryType }
     *     
     */
    public void setDeparture(CountryQueryType value) {
        this.departure = value;
    }

}
