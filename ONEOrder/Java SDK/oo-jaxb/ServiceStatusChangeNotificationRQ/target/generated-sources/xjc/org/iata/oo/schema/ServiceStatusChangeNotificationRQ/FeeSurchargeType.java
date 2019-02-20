
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for a Fee/ Surcharge.
 * 
 * <p>Java class for FeeSurchargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeSurchargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Total"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CurrencyAmountOptType"&gt;
 *                 &lt;attribute name="refundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Breakdown" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fee" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/&gt;
 *                             &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                             &lt;element name="Designator" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/&gt;
 *                             &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/&gt;
 *                             &lt;element name="Nature" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *                           &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeSurchargeType", propOrder = {
    "total",
    "breakdown"
})
@XmlSeeAlso({
    org.iata.oo.schema.ServiceStatusChangeNotificationRQ.DetailCurrencyPriceType.Fees.class
})
public class FeeSurchargeType {

    @XmlElement(name = "Total", required = true)
    protected FeeSurchargeType.Total total;
    @XmlElementWrapper(name = "Breakdown")
    @XmlElement(name = "Fee", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<FeeSurchargeType.Fee> breakdown;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link FeeSurchargeType.Total }
     *     
     */
    public FeeSurchargeType.Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeSurchargeType.Total }
     *     
     */
    public void setTotal(FeeSurchargeType.Total value) {
        this.total = value;
    }

    public List<FeeSurchargeType.Fee> getBreakdown() {
        if (breakdown == null) {
            breakdown = new ArrayList<FeeSurchargeType.Fee>();
        }
        return breakdown;
    }

    public void setBreakdown(List<FeeSurchargeType.Fee> breakdown) {
        this.breakdown = breakdown;
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
     *         &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/&gt;
     *         &lt;element name="Designator" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/&gt;
     *         &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/&gt;
     *         &lt;element name="Nature" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
     *       &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        "localAmount",
        "designator",
        "description",
        "nature"
    })
    public static class Fee {

        @XmlElement(name = "Amount", required = true)
        protected CurrencyAmountOptType amount;
        @XmlElement(name = "LocalAmount")
        protected CurrencyAmountOptType localAmount;
        @XmlElement(name = "Designator")
        protected String designator;
        @XmlElement(name = "Description")
        protected String description;
        @XmlElement(name = "Nature")
        protected String nature;
        @XmlAttribute(name = "ApproxInd")
        protected Boolean approxInd;
        @XmlAttribute(name = "RefundInd")
        protected Boolean refundInd;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

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
         * Gets the value of the localAmount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getLocalAmount() {
            return localAmount;
        }

        /**
         * Sets the value of the localAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setLocalAmount(CurrencyAmountOptType value) {
            this.localAmount = value;
        }

        /**
         * Gets the value of the designator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesignator() {
            return designator;
        }

        /**
         * Sets the value of the designator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesignator(String value) {
            this.designator = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the nature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNature() {
            return nature;
        }

        /**
         * Sets the value of the nature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNature(String value) {
            this.nature = value;
        }

        /**
         * Gets the value of the approxInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isApproxInd() {
            return approxInd;
        }

        /**
         * Sets the value of the approxInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setApproxInd(Boolean value) {
            this.approxInd = value;
        }

        /**
         * Gets the value of the refundInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRefundInd() {
            return refundInd;
        }

        /**
         * Sets the value of the refundInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefundInd(Boolean value) {
            this.refundInd = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CurrencyAmountOptType"&gt;
     *       &lt;attribute name="refundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Total
        extends CurrencyAmountOptType
    {

        @XmlAttribute(name = "refundInd")
        protected Boolean refundInd;

        /**
         * Gets the value of the refundInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRefundInd() {
            return refundInd;
        }

        /**
         * Sets the value of the refundInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefundInd(Boolean value) {
            this.refundInd = value;
        }

    }

}
