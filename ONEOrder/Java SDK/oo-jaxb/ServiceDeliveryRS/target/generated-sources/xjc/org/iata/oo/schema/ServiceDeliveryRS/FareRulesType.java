
package org.iata.oo.schema.ServiceDeliveryRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: FARE - FARE DETAIL- FARE RULES
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Fare Penalty information
 * • Corporate Fare information
 * • Advance Ticketing, Purchase, Minimum and Maximum Stay Requirements
 * • Ticketing Instructions
 * • Fare Rule Remarks
 * 
 *  ============
 * Metadata
 *  ============
 * • FareRuleMetadata
 * 
 * <p>Java class for FareRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareRulesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Penalty" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CorporateFare" minOccurs="0"/&gt;
 *         &lt;element name="AdvanceStay" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AdvancePurchase" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AdvanceTicketing" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MinimumStay" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MaximumStay" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ticketing" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TicketlessInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InstantPurchase" minOccurs="0"/&gt;
 *                   &lt;element name="Endorsements" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Endorsement" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" maxOccurs="unbounded"/&gt;
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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/&gt;
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
@XmlType(name = "FareRulesType", propOrder = {
    "penalty",
    "corporateFare",
    "advanceStay",
    "ticketing",
    "remarks"
})
public class FareRulesType {

    @XmlElement(name = "Penalty")
    protected PenaltyDetailType penalty;
    @XmlElement(name = "CorporateFare")
    protected CorporateFare corporateFare;
    @XmlElement(name = "AdvanceStay")
    protected FareRulesType.AdvanceStay advanceStay;
    @XmlElement(name = "Ticketing")
    protected FareRulesType.Ticketing ticketing;
    @XmlElementWrapper(name = "Remarks")
    @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<Remark> remarks;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyDetailType }
     *     
     */
    public PenaltyDetailType getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyDetailType }
     *     
     */
    public void setPenalty(PenaltyDetailType value) {
        this.penalty = value;
    }

    /**
     * Gets the value of the corporateFare property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateFare }
     *     
     */
    public CorporateFare getCorporateFare() {
        return corporateFare;
    }

    /**
     * Sets the value of the corporateFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateFare }
     *     
     */
    public void setCorporateFare(CorporateFare value) {
        this.corporateFare = value;
    }

    /**
     * Gets the value of the advanceStay property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesType.AdvanceStay }
     *     
     */
    public FareRulesType.AdvanceStay getAdvanceStay() {
        return advanceStay;
    }

    /**
     * Sets the value of the advanceStay property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesType.AdvanceStay }
     *     
     */
    public void setAdvanceStay(FareRulesType.AdvanceStay value) {
        this.advanceStay = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesType.Ticketing }
     *     
     */
    public FareRulesType.Ticketing getTicketing() {
        return ticketing;
    }

    /**
     * Sets the value of the ticketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesType.Ticketing }
     *     
     */
    public void setTicketing(FareRulesType.Ticketing value) {
        this.ticketing = value;
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

    public List<Remark> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<Remark>();
        }
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AdvancePurchase" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AdvanceTicketing" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MinimumStay" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MaximumStay" minOccurs="0"/&gt;
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
        "advancePurchase",
        "advanceTicketing",
        "minimumStay",
        "maximumStay"
    })
    public static class AdvanceStay {

        @XmlElement(name = "AdvancePurchase")
        protected AdvancePurchase advancePurchase;
        @XmlElement(name = "AdvanceTicketing")
        protected AdvanceTicketing advanceTicketing;
        @XmlElement(name = "MinimumStay")
        protected MinimumStay minimumStay;
        @XmlElement(name = "MaximumStay")
        protected MaximumStay maximumStay;

        /**
         * Gets the value of the advancePurchase property.
         * 
         * @return
         *     possible object is
         *     {@link AdvancePurchase }
         *     
         */
        public AdvancePurchase getAdvancePurchase() {
            return advancePurchase;
        }

        /**
         * Sets the value of the advancePurchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvancePurchase }
         *     
         */
        public void setAdvancePurchase(AdvancePurchase value) {
            this.advancePurchase = value;
        }

        /**
         * Gets the value of the advanceTicketing property.
         * 
         * @return
         *     possible object is
         *     {@link AdvanceTicketing }
         *     
         */
        public AdvanceTicketing getAdvanceTicketing() {
            return advanceTicketing;
        }

        /**
         * Sets the value of the advanceTicketing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AdvanceTicketing }
         *     
         */
        public void setAdvanceTicketing(AdvanceTicketing value) {
            this.advanceTicketing = value;
        }

        /**
         * Gets the value of the minimumStay property.
         * 
         * @return
         *     possible object is
         *     {@link MinimumStay }
         *     
         */
        public MinimumStay getMinimumStay() {
            return minimumStay;
        }

        /**
         * Sets the value of the minimumStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link MinimumStay }
         *     
         */
        public void setMinimumStay(MinimumStay value) {
            this.minimumStay = value;
        }

        /**
         * Gets the value of the maximumStay property.
         * 
         * @return
         *     possible object is
         *     {@link MaximumStay }
         *     
         */
        public MaximumStay getMaximumStay() {
            return maximumStay;
        }

        /**
         * Sets the value of the maximumStay property.
         * 
         * @param value
         *     allowed object is
         *     {@link MaximumStay }
         *     
         */
        public void setMaximumStay(MaximumStay value) {
            this.maximumStay = value;
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
     *         &lt;element name="TicketlessInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}InstantPurchase" minOccurs="0"/&gt;
     *         &lt;element name="Endorsements" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Endorsement" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" maxOccurs="unbounded"/&gt;
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
    @XmlType(name = "", propOrder = {
        "ticketlessInd",
        "instantPurchase",
        "endorsements"
    })
    public static class Ticketing {

        @XmlElement(name = "TicketlessInd")
        protected Boolean ticketlessInd;
        @XmlElement(name = "InstantPurchase")
        protected InstantPurchaseType instantPurchase;
        @XmlElementWrapper(name = "Endorsements")
        @XmlElement(name = "Endorsement", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<String> endorsements;

        /**
         * Gets the value of the ticketlessInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isTicketlessInd() {
            return ticketlessInd;
        }

        /**
         * Sets the value of the ticketlessInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setTicketlessInd(Boolean value) {
            this.ticketlessInd = value;
        }

        /**
         * Gets the value of the instantPurchase property.
         * 
         * @return
         *     possible object is
         *     {@link InstantPurchaseType }
         *     
         */
        public InstantPurchaseType getInstantPurchase() {
            return instantPurchase;
        }

        /**
         * Sets the value of the instantPurchase property.
         * 
         * @param value
         *     allowed object is
         *     {@link InstantPurchaseType }
         *     
         */
        public void setInstantPurchase(InstantPurchaseType value) {
            this.instantPurchase = value;
        }

        public List<String> getEndorsements() {
            if (endorsements == null) {
                endorsements = new ArrayList<String>();
            }
            return endorsements;
        }

        public void setEndorsements(List<String> endorsements) {
            this.endorsements = endorsements;
        }

    }

}
