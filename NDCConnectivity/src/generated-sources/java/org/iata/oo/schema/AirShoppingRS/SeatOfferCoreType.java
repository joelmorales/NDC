//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:53:10 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Core Seat Offer definition.
 * 
 * <p>Java class for SeatOfferCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatOfferCoreType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SeatDetailType">
 *       &lt;sequence>
 *         &lt;element name="OfferPrice">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatOfferCoreType", propOrder = {
    "offerPrice"
})
@XmlSeeAlso({
    AltSeatOfferType.class
})
public class SeatOfferCoreType
    extends SeatDetailType
{

    @XmlElement(name = "OfferPrice", required = true)
    protected SeatOfferCoreType.OfferPrice offerPrice;

    /**
     * Gets the value of the offerPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SeatOfferCoreType.OfferPrice }
     *     
     */
    public SeatOfferCoreType.OfferPrice getOfferPrice() {
        return offerPrice;
    }

    /**
     * Sets the value of the offerPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatOfferCoreType.OfferPrice }
     *     
     */
    public void setOfferPrice(SeatOfferCoreType.OfferPrice value) {
        this.offerPrice = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "awardPricing",
        "combinationPricing",
        "detailCurrencyPrice",
        "encodedCurrencyPrice",
        "simpleCurrencyPrice"
    })
    public static class OfferPrice {

        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "DetailCurrencyPrice")
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice")
        protected EncodedPriceType encodedCurrencyPrice;
        @XmlElement(name = "SimpleCurrencyPrice")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;

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

        /**
         * Gets the value of the detailCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public DetailCurrencyPriceType getDetailCurrencyPrice() {
            return detailCurrencyPrice;
        }

        /**
         * Sets the value of the detailCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
            this.detailCurrencyPrice = value;
        }

        /**
         * Gets the value of the encodedCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link EncodedPriceType }
         *     
         */
        public EncodedPriceType getEncodedCurrencyPrice() {
            return encodedCurrencyPrice;
        }

        /**
         * Sets the value of the encodedCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link EncodedPriceType }
         *     
         */
        public void setEncodedCurrencyPrice(EncodedPriceType value) {
            this.encodedCurrencyPrice = value;
        }

        /**
         * Gets the value of the simpleCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
            return simpleCurrencyPrice;
        }

        /**
         * Sets the value of the simpleCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
            this.simpleCurrencyPrice = value;
        }

    }

}
