//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:52:55 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeeDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeDisclosureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Surcharges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.1}TaxDetailType" minOccurs="0"/>
 *         &lt;element name="Fees" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Refundvalue" type="{http://www.iata.org/IATA/EDIST/2017.1}TotalFareTransactionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeDisclosureType", propOrder = {
    "surcharges",
    "taxes",
    "fees",
    "refundvalue"
})
public class FeeDisclosureType {

    @XmlElement(name = "Surcharges")
    protected FeeDisclosureType.Surcharges surcharges;
    @XmlElement(name = "Taxes")
    protected TaxDetailType taxes;
    @XmlElement(name = "Fees")
    protected FeeDisclosureType.Fees fees;
    @XmlElement(name = "Refundvalue")
    protected TotalFareTransactionType refundvalue;
    @XmlAttribute(name = "RefundInd")
    protected Boolean refundInd;

    /**
     * Gets the value of the surcharges property.
     * 
     * @return
     *     possible object is
     *     {@link FeeDisclosureType.Surcharges }
     *     
     */
    public FeeDisclosureType.Surcharges getSurcharges() {
        return surcharges;
    }

    /**
     * Sets the value of the surcharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeDisclosureType.Surcharges }
     *     
     */
    public void setSurcharges(FeeDisclosureType.Surcharges value) {
        this.surcharges = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailType }
     *     
     */
    public TaxDetailType getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailType }
     *     
     */
    public void setTaxes(TaxDetailType value) {
        this.taxes = value;
    }

    /**
     * Gets the value of the fees property.
     * 
     * @return
     *     possible object is
     *     {@link FeeDisclosureType.Fees }
     *     
     */
    public FeeDisclosureType.Fees getFees() {
        return fees;
    }

    /**
     * Sets the value of the fees property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeDisclosureType.Fees }
     *     
     */
    public void setFees(FeeDisclosureType.Fees value) {
        this.fees = value;
    }

    /**
     * Gets the value of the refundvalue property.
     * 
     * @return
     *     possible object is
     *     {@link TotalFareTransactionType }
     *     
     */
    public TotalFareTransactionType getRefundvalue() {
        return refundvalue;
    }

    /**
     * Sets the value of the refundvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalFareTransactionType }
     *     
     */
    public void setRefundvalue(TotalFareTransactionType value) {
        this.refundvalue = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Fees
        extends FeeSurchargeType
    {


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
     *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" maxOccurs="unbounded"/>
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
        "surcharge"
    })
    public static class Surcharges {

        @XmlElement(name = "Surcharge", required = true)
        protected List<FeeSurchargeType> surcharge;

        /**
         * Gets the value of the surcharge property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the surcharge property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSurcharge().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeeSurchargeType }
         * 
         * 
         */
        public List<FeeSurchargeType> getSurcharge() {
            if (surcharge == null) {
                surcharge = new ArrayList<FeeSurchargeType>();
            }
            return this.surcharge;
        }

    }

}
