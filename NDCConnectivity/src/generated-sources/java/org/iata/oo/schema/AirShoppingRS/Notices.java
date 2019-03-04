//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:53:10 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Notice" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TaxExemptionNotice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceFilterNotice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PricingParametersNotice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceVarianceNotice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentRulesNotice"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeNotif"/>
 *                 &lt;/choice>
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
@XmlType(name = "", propOrder = {
    "notice"
})
@XmlRootElement(name = "Notices")
public class Notices {

    @XmlElement(name = "Notice", required = true)
    protected List<Notices.Notice> notice;

    /**
     * Gets the value of the notice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Notices.Notice }
     * 
     * 
     */
    public List<Notices.Notice> getNotice() {
        if (notice == null) {
            notice = new ArrayList<Notices.Notice>();
        }
        return this.notice;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TaxExemptionNotice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ServiceFilterNotice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PricingParametersNotice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceVarianceNotice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentRulesNotice"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InventoryGuaranteeNotif"/>
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
        "taxExemptionNotice",
        "serviceFilterNotice",
        "pricingParametersNotice",
        "priceVarianceNotice",
        "paymentRulesNotice",
        "inventoryGuaranteeNotif"
    })
    public static class Notice {

        @XmlElement(name = "TaxExemptionNotice")
        protected TaxExemptionNoticeType taxExemptionNotice;
        @XmlElement(name = "ServiceFilterNotice")
        protected ServiceFilterNoticeType serviceFilterNotice;
        @XmlElement(name = "PricingParametersNotice")
        protected PricingParametersNoticeType pricingParametersNotice;
        @XmlElement(name = "PriceVarianceNotice")
        protected PriceVarianceNotice priceVarianceNotice;
        @XmlElement(name = "PaymentRulesNotice")
        protected PaymentRulesNoticeType paymentRulesNotice;
        @XmlElement(name = "InventoryGuaranteeNotif")
        protected InvGuaranteeNoticeType inventoryGuaranteeNotif;

        /**
         * Gets the value of the taxExemptionNotice property.
         * 
         * @return
         *     possible object is
         *     {@link TaxExemptionNoticeType }
         *     
         */
        public TaxExemptionNoticeType getTaxExemptionNotice() {
            return taxExemptionNotice;
        }

        /**
         * Sets the value of the taxExemptionNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxExemptionNoticeType }
         *     
         */
        public void setTaxExemptionNotice(TaxExemptionNoticeType value) {
            this.taxExemptionNotice = value;
        }

        /**
         * Gets the value of the serviceFilterNotice property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFilterNoticeType }
         *     
         */
        public ServiceFilterNoticeType getServiceFilterNotice() {
            return serviceFilterNotice;
        }

        /**
         * Sets the value of the serviceFilterNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFilterNoticeType }
         *     
         */
        public void setServiceFilterNotice(ServiceFilterNoticeType value) {
            this.serviceFilterNotice = value;
        }

        /**
         * Gets the value of the pricingParametersNotice property.
         * 
         * @return
         *     possible object is
         *     {@link PricingParametersNoticeType }
         *     
         */
        public PricingParametersNoticeType getPricingParametersNotice() {
            return pricingParametersNotice;
        }

        /**
         * Sets the value of the pricingParametersNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingParametersNoticeType }
         *     
         */
        public void setPricingParametersNotice(PricingParametersNoticeType value) {
            this.pricingParametersNotice = value;
        }

        /**
         * Price Variance Rule(s) Notice. Note: Supports specifying Payment Processing Rules, including payment failure. Request messages may include defined payment processing rules and an indicator requesting that the rules be applied during payment processing where relevant. Response messages may additionally include notice about if and how payment rule(s) were applied during transaction processing.
         *       
         * 
         * @return
         *     possible object is
         *     {@link PriceVarianceNotice }
         *     
         */
        public PriceVarianceNotice getPriceVarianceNotice() {
            return priceVarianceNotice;
        }

        /**
         * Sets the value of the priceVarianceNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceVarianceNotice }
         *     
         */
        public void setPriceVarianceNotice(PriceVarianceNotice value) {
            this.priceVarianceNotice = value;
        }

        /**
         * Gets the value of the paymentRulesNotice property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentRulesNoticeType }
         *     
         */
        public PaymentRulesNoticeType getPaymentRulesNotice() {
            return paymentRulesNotice;
        }

        /**
         * Sets the value of the paymentRulesNotice property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentRulesNoticeType }
         *     
         */
        public void setPaymentRulesNotice(PaymentRulesNoticeType value) {
            this.paymentRulesNotice = value;
        }

        /**
         * Gets the value of the inventoryGuaranteeNotif property.
         * 
         * @return
         *     possible object is
         *     {@link InvGuaranteeNoticeType }
         *     
         */
        public InvGuaranteeNoticeType getInventoryGuaranteeNotif() {
            return inventoryGuaranteeNotif;
        }

        /**
         * Sets the value of the inventoryGuaranteeNotif property.
         * 
         * @param value
         *     allowed object is
         *     {@link InvGuaranteeNoticeType }
         *     
         */
        public void setInventoryGuaranteeNotif(InvGuaranteeNoticeType value) {
            this.inventoryGuaranteeNotif = value;
        }

    }

}
