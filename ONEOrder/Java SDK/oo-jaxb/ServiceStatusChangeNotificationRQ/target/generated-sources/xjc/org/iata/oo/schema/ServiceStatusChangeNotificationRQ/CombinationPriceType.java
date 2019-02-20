
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * COMBINATION PRICE BASIS UNIT: Partial currency and award.
 * 
 * <p>Java class for CombinationPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinationPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Partial"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Currency"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyAmount"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Redemption" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardRedemptionType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
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
@XmlType(name = "CombinationPriceType", propOrder = {
    "partial"
})
public class CombinationPriceType {

    @XmlElement(name = "Partial", required = true)
    protected CombinationPriceType.Partial partial;

    /**
     * Gets the value of the partial property.
     * 
     * @return
     *     possible object is
     *     {@link CombinationPriceType.Partial }
     *     
     */
    public CombinationPriceType.Partial getPartial() {
        return partial;
    }

    /**
     * Sets the value of the partial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationPriceType.Partial }
     *     
     */
    public void setPartial(CombinationPriceType.Partial value) {
        this.partial = value;
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
     *         &lt;element name="Currency"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyAmount"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Redemption" type="{http://www.iata.org/IATA/EDIST/2017.1}AwardRedemptionType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
        protected CombinationPriceType.Partial.Currency currency;
        @XmlElement(name = "Redemption", required = true)
        protected AwardRedemptionType redemption;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceType.Partial.Currency }
         *     
         */
        public CombinationPriceType.Partial.Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceType.Partial.Currency }
         *     
         */
        public void setCurrency(CombinationPriceType.Partial.Currency value) {
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
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
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
         *       &lt;choice&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyAmount"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
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
