
package org.iata.oo.schema.ServiceDeliveryRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * AWARD/ REDEMPTION PRICE BASIS UNIT definition.
 * 
 * <p>Java class for AwardPriceUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardPriceUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Redemption" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardRedemptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardPriceUnitType", propOrder = {
    "redemption"
})
public class AwardPriceUnitType {

    @XmlElement(name = "Redemption", required = true)
    protected AwardRedemptionType redemption;

    /**
     * Gets the value of the redemption property.
     * 
     * @return
     *     possible object is
     *     {@link AwardRedemptionType }
     *     
     */
    public AwardRedemptionType getRedemption() {
        return redemption;
    }

    /**
     * Sets the value of the redemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardRedemptionType }
     *     
     */
    public void setRedemption(AwardRedemptionType value) {
        this.redemption = value;
    }

}
