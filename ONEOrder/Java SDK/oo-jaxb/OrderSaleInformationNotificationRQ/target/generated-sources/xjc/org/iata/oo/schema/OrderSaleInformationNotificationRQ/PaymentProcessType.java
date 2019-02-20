
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * PAYMENT PROCESSING  Information definition.
 * 
 * <p>Java class for PaymentProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderItemRefs" type="{http://www.w3.org/2001/XMLSchema}IDREFS" minOccurs="0"/&gt;
 *         &lt;element name="Status"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PaymentStatusType"&gt;
 *                 &lt;attribute name="FailedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PartialPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="VerificationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="PriceVarianceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amount"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Method"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}VoucherMethod" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RedemptionMethod" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardMethod" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DirectBillMethod" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CashMethod" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Check" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Variance"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations"/&gt;
 *                   &lt;element name="Rule" type="{http://www.iata.org/IATA/EDIST/2017.1}PriceVarianceRuleType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Promotions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Promotion" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PromotionType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
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
@XmlType(name = "PaymentProcessType", propOrder = {
    "orderItemRefs",
    "status",
    "amount",
    "method",
    "variance",
    "promotions"
})
public class PaymentProcessType {

    @XmlList
    @XmlElement(name = "OrderItemRefs")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> orderItemRefs;
    @XmlElement(name = "Status", required = true)
    protected PaymentProcessType.Status status;
    @XmlElement(name = "Amount", required = true)
    protected PaymentProcessType.Amount amount;
    @XmlElement(name = "Method", required = true)
    protected PaymentProcessType.Method method;
    @XmlElement(name = "Variance", required = true)
    protected PaymentProcessType.Variance variance;
    @XmlElementWrapper(name = "Promotions")
    @XmlElement(name = "Promotion", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<PaymentProcessType.Promotion> promotions;

    /**
     * Gets the value of the orderItemRefs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemRefs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getOrderItemRefs() {
        if (orderItemRefs == null) {
            orderItemRefs = new ArrayList<Object>();
        }
        return this.orderItemRefs;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessType.Status }
     *     
     */
    public PaymentProcessType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessType.Status }
     *     
     */
    public void setStatus(PaymentProcessType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessType.Amount }
     *     
     */
    public PaymentProcessType.Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessType.Amount }
     *     
     */
    public void setAmount(PaymentProcessType.Amount value) {
        this.amount = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessType.Method }
     *     
     */
    public PaymentProcessType.Method getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessType.Method }
     *     
     */
    public void setMethod(PaymentProcessType.Method value) {
        this.method = value;
    }

    /**
     * Gets the value of the variance property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentProcessType.Variance }
     *     
     */
    public PaymentProcessType.Variance getVariance() {
        return variance;
    }

    /**
     * Sets the value of the variance property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentProcessType.Variance }
     *     
     */
    public void setVariance(PaymentProcessType.Variance value) {
        this.variance = value;
    }

    public List<PaymentProcessType.Promotion> getPromotions() {
        if (promotions == null) {
            promotions = new ArrayList<PaymentProcessType.Promotion>();
        }
        return promotions;
    }

    public void setPromotions(List<PaymentProcessType.Promotion> promotions) {
        this.promotions = promotions;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AwardPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CombinationPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DetailCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EncodedCurrencyPrice"/&gt;
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
        "awardPricing",
        "combinationPricing",
        "simpleCurrencyPrice",
        "detailCurrencyPrice",
        "encodedCurrencyPrice"
    })
    public static class Amount {

        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "SimpleCurrencyPrice")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice")
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice")
        protected EncodedPriceType encodedCurrencyPrice;

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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}VoucherMethod" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}RedemptionMethod" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCardMethod" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DirectBillMethod" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CashMethod" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Check" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "voucherMethod",
        "redemptionMethod",
        "paymentCardMethod",
        "directBillMethod",
        "cashMethod",
        "check"
    })
    public static class Method {

        @XmlElement(name = "VoucherMethod")
        protected VoucherMethodType voucherMethod;
        @XmlElement(name = "RedemptionMethod")
        protected RedemptionMethodType redemptionMethod;
        @XmlElement(name = "PaymentCardMethod")
        protected PaymentCardMethodType paymentCardMethod;
        @XmlElement(name = "DirectBillMethod")
        protected DirectBillMethodType directBillMethod;
        @XmlElement(name = "CashMethod")
        protected CashMethodType cashMethod;
        @XmlElement(name = "Check")
        protected Check check;

        /**
         * Gets the value of the voucherMethod property.
         * 
         * @return
         *     possible object is
         *     {@link VoucherMethodType }
         *     
         */
        public VoucherMethodType getVoucherMethod() {
            return voucherMethod;
        }

        /**
         * Sets the value of the voucherMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link VoucherMethodType }
         *     
         */
        public void setVoucherMethod(VoucherMethodType value) {
            this.voucherMethod = value;
        }

        /**
         * Gets the value of the redemptionMethod property.
         * 
         * @return
         *     possible object is
         *     {@link RedemptionMethodType }
         *     
         */
        public RedemptionMethodType getRedemptionMethod() {
            return redemptionMethod;
        }

        /**
         * Sets the value of the redemptionMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link RedemptionMethodType }
         *     
         */
        public void setRedemptionMethod(RedemptionMethodType value) {
            this.redemptionMethod = value;
        }

        /**
         * Gets the value of the paymentCardMethod property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardMethodType }
         *     
         */
        public PaymentCardMethodType getPaymentCardMethod() {
            return paymentCardMethod;
        }

        /**
         * Sets the value of the paymentCardMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardMethodType }
         *     
         */
        public void setPaymentCardMethod(PaymentCardMethodType value) {
            this.paymentCardMethod = value;
        }

        /**
         * Gets the value of the directBillMethod property.
         * 
         * @return
         *     possible object is
         *     {@link DirectBillMethodType }
         *     
         */
        public DirectBillMethodType getDirectBillMethod() {
            return directBillMethod;
        }

        /**
         * Sets the value of the directBillMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectBillMethodType }
         *     
         */
        public void setDirectBillMethod(DirectBillMethodType value) {
            this.directBillMethod = value;
        }

        /**
         * Gets the value of the cashMethod property.
         * 
         * @return
         *     possible object is
         *     {@link CashMethodType }
         *     
         */
        public CashMethodType getCashMethod() {
            return cashMethod;
        }

        /**
         * Sets the value of the cashMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link CashMethodType }
         *     
         */
        public void setCashMethod(CashMethodType value) {
            this.cashMethod = value;
        }

        /**
         * Check (Cheque) Payment
         * 
         * @return
         *     possible object is
         *     {@link Check }
         *     
         */
        public Check getCheck() {
            return check;
        }

        /**
         * Sets the value of the check property.
         * 
         * @param value
         *     allowed object is
         *     {@link Check }
         *     
         */
        public void setCheck(Check value) {
            this.check = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PromotionType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "associations"
    })
    public static class Promotion
        extends PromotionType
    {

        @XmlElement(name = "Associations", required = true)
        protected OrderItemAssociationType associations;

        /**
         * Association(s), including Passenger and Group.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemAssociationType }
         *     
         */
        public OrderItemAssociationType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemAssociationType }
         *     
         */
        public void setAssociations(OrderItemAssociationType value) {
            this.associations = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PaymentStatusType"&gt;
     *       &lt;attribute name="FailedPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PartialPaymentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="VerificationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="PriceVarianceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Status
        extends PaymentStatusType
    {

        @XmlAttribute(name = "FailedPaymentInd")
        protected Boolean failedPaymentInd;
        @XmlAttribute(name = "PartialPaymentInd")
        protected Boolean partialPaymentInd;
        @XmlAttribute(name = "VerificationInd")
        protected Boolean verificationInd;
        @XmlAttribute(name = "PriceVarianceInd")
        protected Boolean priceVarianceInd;

        /**
         * Gets the value of the failedPaymentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFailedPaymentInd() {
            return failedPaymentInd;
        }

        /**
         * Sets the value of the failedPaymentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFailedPaymentInd(Boolean value) {
            this.failedPaymentInd = value;
        }

        /**
         * Gets the value of the partialPaymentInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPartialPaymentInd() {
            return partialPaymentInd;
        }

        /**
         * Sets the value of the partialPaymentInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPartialPaymentInd(Boolean value) {
            this.partialPaymentInd = value;
        }

        /**
         * Gets the value of the verificationInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVerificationInd() {
            return verificationInd;
        }

        /**
         * Sets the value of the verificationInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVerificationInd(Boolean value) {
            this.verificationInd = value;
        }

        /**
         * Gets the value of the priceVarianceInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPriceVarianceInd() {
            return priceVarianceInd;
        }

        /**
         * Sets the value of the priceVarianceInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPriceVarianceInd(Boolean value) {
            this.priceVarianceInd = value;
        }

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
     *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Associations"/&gt;
     *         &lt;element name="Rule" type="{http://www.iata.org/IATA/EDIST/2017.1}PriceVarianceRuleType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amount",
        "associations",
        "rule"
    })
    public static class Variance {

        @XmlElement(name = "Amount", required = true)
        protected CurrencyAmountOptType amount;
        @XmlElement(name = "Associations", required = true)
        protected OrderItemAssociationType associations;
        @XmlElement(name = "Rule")
        protected PriceVarianceRuleType rule;

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setAmount(CurrencyAmountOptType value) {
            this.amount = value;
        }

        /**
         * Association(s), including Passenger and Group.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemAssociationType }
         *     
         */
        public OrderItemAssociationType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemAssociationType }
         *     
         */
        public void setAssociations(OrderItemAssociationType value) {
            this.associations = value;
        }

        /**
         * Gets the value of the rule property.
         * 
         * @return
         *     possible object is
         *     {@link PriceVarianceRuleType }
         *     
         */
        public PriceVarianceRuleType getRule() {
            return rule;
        }

        /**
         * Sets the value of the rule property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceVarianceRuleType }
         *     
         */
        public void setRule(PriceVarianceRuleType value) {
            this.rule = value;
        }

    }

}
