
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * NDC Capability Model: PENALTY
 * 
 *  ============
 * Representation(s)
 *  ============
 * • Core Penalty
 * • Detail Penalty
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Penalty Indicators (Cancellation fees apply; Change of Itinerary fees apply; Refundable ticket and/ or fare; Reusable ticket and/ or fare; Upgrade fee applies)
 * • Applicable Fee Remarks
 * • Penalty Type (Cancellation, No Show, Upgrade, etc.)
 * • Penalty Application (IATA Padis Codeset FAT - Fare or Application Penalty Type)
 * • Penalty Amount, represented as percentage or fixed value, with Amount Application (MinimumPenaltyAmount, MaximumPenaltyAmount, Other) and Applicable Fee Remarks
 * 
 *  ============
 * Metadata
 *  ============
 * • PenaltyMetadata
 * 
 * <p>Java class for PenaltyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}RemarkType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Detail" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.1}PenaltySimpleType"/&gt;
 *                             &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType" minOccurs="0"/&gt;
 *                             &lt;element name="Amounts" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Amount" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;choice&gt;
 *                                                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountValue"/&gt;
 *                                                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PercentageValue"/&gt;
 *                                                 &lt;/choice&gt;
 *                                                 &lt;element name="AmountApplication" type="{http://www.iata.org/IATA/EDIST/2017.1}PenaltyAppSimpleType" minOccurs="0"/&gt;
 *                                                 &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}RemarkType"&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="CancelFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ChangeFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReuseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UpgradeFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ObjectKey" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyType", propOrder = {
    "applicableFeeRemarks",
    "details"
})
@XmlSeeAlso({
    PenaltyDetailType.class,
    OrderPenaltyType.class
})
public class PenaltyType {

    @XmlElement(name = "ApplicableFeeRemarks")
    protected PenaltyType.ApplicableFeeRemarks applicableFeeRemarks;
    @XmlElementWrapper(name = "Details")
    @XmlElement(name = "Detail", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<PenaltyType.Detail> details;
    @XmlAttribute(name = "CancelFeeInd")
    protected Boolean cancelFeeInd;
    @XmlAttribute(name = "ChangeFeeInd")
    protected Boolean changeFeeInd;
    @XmlAttribute(name = "RefundableInd")
    protected Boolean refundableInd;
    @XmlAttribute(name = "ReuseInd")
    protected Boolean reuseInd;
    @XmlAttribute(name = "UpgradeFeeInd")
    protected Boolean upgradeFeeInd;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String objectKey;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the applicableFeeRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyType.ApplicableFeeRemarks }
     *     
     */
    public PenaltyType.ApplicableFeeRemarks getApplicableFeeRemarks() {
        return applicableFeeRemarks;
    }

    /**
     * Sets the value of the applicableFeeRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyType.ApplicableFeeRemarks }
     *     
     */
    public void setApplicableFeeRemarks(PenaltyType.ApplicableFeeRemarks value) {
        this.applicableFeeRemarks = value;
    }

    /**
     * Gets the value of the cancelFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelFeeInd() {
        return cancelFeeInd;
    }

    /**
     * Sets the value of the cancelFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelFeeInd(Boolean value) {
        this.cancelFeeInd = value;
    }

    /**
     * Gets the value of the changeFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeFeeInd() {
        return changeFeeInd;
    }

    /**
     * Sets the value of the changeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeFeeInd(Boolean value) {
        this.changeFeeInd = value;
    }

    /**
     * Gets the value of the refundableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundableInd() {
        return refundableInd;
    }

    /**
     * Sets the value of the refundableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundableInd(Boolean value) {
        this.refundableInd = value;
    }

    /**
     * Gets the value of the reuseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReuseInd() {
        return reuseInd;
    }

    /**
     * Sets the value of the reuseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReuseInd(Boolean value) {
        this.reuseInd = value;
    }

    /**
     * Gets the value of the upgradeFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgradeFeeInd() {
        return upgradeFeeInd;
    }

    /**
     * Sets the value of the upgradeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgradeFeeInd(Boolean value) {
        this.upgradeFeeInd = value;
    }

    /**
     * Gets the value of the objectKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectKey() {
        return objectKey;
    }

    /**
     * Sets the value of the objectKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectKey(String value) {
        this.objectKey = value;
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

    public List<PenaltyType.Detail> getDetails() {
        if (details == null) {
            details = new ArrayList<PenaltyType.Detail>();
        }
        return details;
    }

    public void setDetails(List<PenaltyType.Detail> details) {
        this.details = details;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}RemarkType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ApplicableFeeRemarks
        extends RemarkType
    {


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
     *         &lt;element name="Type" type="{http://www.iata.org/IATA/EDIST/2017.1}PenaltySimpleType"/&gt;
     *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType" minOccurs="0"/&gt;
     *         &lt;element name="Amounts" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Amount" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;choice&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountValue"/&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PercentageValue"/&gt;
     *                             &lt;/choice&gt;
     *                             &lt;element name="AmountApplication" type="{http://www.iata.org/IATA/EDIST/2017.1}PenaltyAppSimpleType" minOccurs="0"/&gt;
     *                             &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}RemarkType"&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "type",
        "application",
        "amounts"
    })
    public static class Detail {

        @XmlElement(name = "Type", required = true)
        protected String type;
        @XmlElement(name = "Application")
        protected CodesetType application;
        @XmlElementWrapper(name = "Amounts")
        @XmlElement(name = "Amount", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<PenaltyType.Detail.Amount> amounts;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setApplication(CodesetType value) {
            this.application = value;
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

        public List<PenaltyType.Detail.Amount> getAmounts() {
            if (amounts == null) {
                amounts = new ArrayList<PenaltyType.Detail.Amount>();
            }
            return amounts;
        }

        public void setAmounts(List<PenaltyType.Detail.Amount> amounts) {
            this.amounts = amounts;
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
         *         &lt;choice&gt;
         *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountValue"/&gt;
         *           &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PercentageValue"/&gt;
         *         &lt;/choice&gt;
         *         &lt;element name="AmountApplication" type="{http://www.iata.org/IATA/EDIST/2017.1}PenaltyAppSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}RemarkType"&gt;
         *               &lt;/extension&gt;
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
        @XmlType(name = "", propOrder = {
            "currencyAmountValue",
            "percentageValue",
            "amountApplication",
            "applicableFeeRemarks"
        })
        public static class Amount {

            @XmlElement(name = "CurrencyAmountValue")
            protected CurrencyAmountOptType currencyAmountValue;
            @XmlElement(name = "PercentageValue")
            protected BigDecimal percentageValue;
            @XmlElement(name = "AmountApplication")
            protected String amountApplication;
            @XmlElement(name = "ApplicableFeeRemarks")
            protected PenaltyType.Detail.Amount.ApplicableFeeRemarks applicableFeeRemarks;

            /**
             * Penalty monetary value amount and currency code.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getCurrencyAmountValue() {
                return currencyAmountValue;
            }

            /**
             * Sets the value of the currencyAmountValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setCurrencyAmountValue(CurrencyAmountOptType value) {
                this.currencyAmountValue = value;
            }

            /**
             * Gets the value of the percentageValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercentageValue() {
                return percentageValue;
            }

            /**
             * Sets the value of the percentageValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercentageValue(BigDecimal value) {
                this.percentageValue = value;
            }

            /**
             * Gets the value of the amountApplication property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmountApplication() {
                return amountApplication;
            }

            /**
             * Sets the value of the amountApplication property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmountApplication(String value) {
                this.amountApplication = value;
            }

            /**
             * Gets the value of the applicableFeeRemarks property.
             * 
             * @return
             *     possible object is
             *     {@link PenaltyType.Detail.Amount.ApplicableFeeRemarks }
             *     
             */
            public PenaltyType.Detail.Amount.ApplicableFeeRemarks getApplicableFeeRemarks() {
                return applicableFeeRemarks;
            }

            /**
             * Sets the value of the applicableFeeRemarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link PenaltyType.Detail.Amount.ApplicableFeeRemarks }
             *     
             */
            public void setApplicableFeeRemarks(PenaltyType.Detail.Amount.ApplicableFeeRemarks value) {
                this.applicableFeeRemarks = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}RemarkType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ApplicableFeeRemarks
                extends RemarkType
            {


            }

        }

    }

}
