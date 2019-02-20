
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * AIRCRAFT CORE representation.
 * 
 * <p>Java class for AircraftCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AircraftCode"/&gt;
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
@XmlType(name = "AircraftCoreType", propOrder = {
    "aircraftCode"
})
@XmlSeeAlso({
    AircraftSummaryType.class
})
public class AircraftCoreType {

    @XmlElement(name = "AircraftCode", required = true)
    protected AircraftCode aircraftCode;
    @XmlAttribute(name = "ChangeOfGaugeInd")
    protected Boolean changeOfGaugeInd;

    /**
     * Equipment Code. Example: 737
     * 
     * Encoding Scheme: IATA/ A4A Equipment Code
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

}
