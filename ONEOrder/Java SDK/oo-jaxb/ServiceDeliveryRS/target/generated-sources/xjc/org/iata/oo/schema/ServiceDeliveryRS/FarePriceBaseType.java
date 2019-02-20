
package org.iata.oo.schema.ServiceDeliveryRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * FARE BASE PRICE definition.
 * 
 * <p>Java class for FarePriceBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarePriceBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareFiledIn" minOccurs="0"/&gt;
 *         &lt;element name="Surcharges" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardPriceUnitType" minOccurs="0"/&gt;
 *           &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPriceType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePriceBaseType", propOrder = {
    "baseAmount",
    "fareFiledIn",
    "surcharges",
    "awardPricing",
    "combinationPricing"
})
@XmlSeeAlso({
    FarePriceDetailType.class
})
public class FarePriceBaseType {

    @XmlElement(name = "BaseAmount", required = true)
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "FareFiledIn")
    protected FareFilingType fareFiledIn;
    @XmlElementWrapper(name = "Surcharges")
    @XmlElement(name = "Surcharge", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<FeeSurchargeType> surcharges;
    @XmlElement(name = "AwardPricing")
    protected AwardPriceUnitType awardPricing;
    @XmlElement(name = "CombinationPricing")
    protected CombinationPriceType combinationPricing;

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setBaseAmount(CurrencyAmountOptType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the fareFiledIn property.
     * 
     * @return
     *     possible object is
     *     {@link FareFilingType }
     *     
     */
    public FareFilingType getFareFiledIn() {
        return fareFiledIn;
    }

    /**
     * Sets the value of the fareFiledIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareFilingType }
     *     
     */
    public void setFareFiledIn(FareFilingType value) {
        this.fareFiledIn = value;
    }

    /**
     * Gets the value of the awardPricing property.
     * 
     * @return
     *     possible object is
     *     {@link AwardPriceUnitType }
     *     
     */
    public AwardPriceUnitType getAwardPricing() {
        return awardPricing;
    }

    /**
     * Sets the value of the awardPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardPriceUnitType }
     *     
     */
    public void setAwardPricing(AwardPriceUnitType value) {
        this.awardPricing = value;
    }

    /**
     * Gets the value of the combinationPricing property.
     * 
     * @return
     *     possible object is
     *     {@link CombinationPriceType }
     *     
     */
    public CombinationPriceType getCombinationPricing() {
        return combinationPricing;
    }

    /**
     * Sets the value of the combinationPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationPriceType }
     *     
     */
    public void setCombinationPricing(CombinationPriceType value) {
        this.combinationPricing = value;
    }

    public List<FeeSurchargeType> getSurcharges() {
        if (surcharges == null) {
            surcharges = new ArrayList<FeeSurchargeType>();
        }
        return surcharges;
    }

    public void setSurcharges(List<FeeSurchargeType> surcharges) {
        this.surcharges = surcharges;
    }

}
