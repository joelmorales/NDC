//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 04:34:49 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * COMBINATION PRICE BASIS UNIT: Partial currency and award.
 * 
 * <p>Java class for CombinationPriceSimpleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinationPriceSimpleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Partial">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Currency">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}EncodedCurrencyAmount"/>
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPrice"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Redemption" type="{http://www.iata.org/IATA/EDIST/2017.2}AwardRedemptionType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CombinationPriceSimpleType", propOrder = {
    "partial"
})
public class CombinationPriceSimpleType {

    @XmlElement(name = "Partial", required = true)
    protected CombinationPriceSimpleType.Partial partial;

    /**
     * Gets the value of the partial property.
     * 
     * @return
     *     possible object is
     *     {@link CombinationPriceSimpleType.Partial }
     *     
     */
    public CombinationPriceSimpleType.Partial getPartial() {
        return partial;
    }

    /**
     * Sets the value of the partial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationPriceSimpleType.Partial }
     *     
     */
    public void setPartial(CombinationPriceSimpleType.Partial value) {
        this.partial = value;
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
     *       &lt;sequence>
     *         &lt;element name="Currency">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}EncodedCurrencyAmount"/>
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPrice"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Redemption" type="{http://www.iata.org/IATA/EDIST/2017.2}AwardRedemptionType"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currency",
        "redemption"
    })
    public static class Partial {

        @XmlElement(name = "Currency", required = true)
        protected CombinationPriceSimpleType.Partial.Currency currency;
        @XmlElement(name = "Redemption", required = true)
        protected AwardRedemptionType redemption;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceSimpleType.Partial.Currency }
         *     
         */
        public CombinationPriceSimpleType.Partial.Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceSimpleType.Partial.Currency }
         *     
         */
        public void setCurrency(CombinationPriceSimpleType.Partial.Currency value) {
            this.currency = value;
        }

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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}EncodedCurrencyAmount"/>
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}SimpleCurrencyPrice"/>
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
            "encodedCurrencyAmount",
            "simpleCurrencyPrice"
        })
        public static class Currency {

            @XmlElement(name = "EncodedCurrencyAmount")
            protected CurrencyAmountEncodedType encodedCurrencyAmount;
            @XmlElement(name = "SimpleCurrencyPrice")
            protected SimpleCurrencyPriceType simpleCurrencyPrice;

            /**
             * Monetary value amount and currency code.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountEncodedType }
             *     
             */
            public CurrencyAmountEncodedType getEncodedCurrencyAmount() {
                return encodedCurrencyAmount;
            }

            /**
             * Sets the value of the encodedCurrencyAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountEncodedType }
             *     
             */
            public void setEncodedCurrencyAmount(CurrencyAmountEncodedType value) {
                this.encodedCurrencyAmount = value;
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

}
