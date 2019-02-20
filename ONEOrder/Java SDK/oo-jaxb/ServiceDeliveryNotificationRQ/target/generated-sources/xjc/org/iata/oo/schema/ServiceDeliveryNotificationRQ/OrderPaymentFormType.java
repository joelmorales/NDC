
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

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
import javax.xml.bind.annotation.XmlValue;


/**
 * ORDER PAYMENT FORM definition.
 * 
 * <p>Java class for OrderPaymentFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Method"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Voucher" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCard" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}LoyaltyRedemption" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DirectBill" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Cash" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Check" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleCurrencyPriceType"/&gt;
 *         &lt;element name="Associations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Passengers" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}GroupReference"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OfferItemSets" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="OfferItemSetRefs" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType"/&gt;
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
 *         &lt;element name="Payer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Surname"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                             &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectPolicyMetaAttrGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Contacts" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Qualifier" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType" minOccurs="0"/&gt;
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
@XmlType(name = "OrderPaymentFormType", propOrder = {
    "method",
    "amount",
    "associations",
    "payer",
    "qualifier"
})
public class OrderPaymentFormType {

    @XmlElement(name = "Method", required = true)
    protected OrderPaymentFormType.Method method;
    @XmlElement(name = "Amount", required = true)
    protected SimpleCurrencyPriceType amount;
    @XmlElement(name = "Associations")
    protected OrderPaymentFormType.Associations associations;
    @XmlElement(name = "Payer")
    protected OrderPaymentFormType.Payer payer;
    @XmlElement(name = "Qualifier")
    protected CodesetType qualifier;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentFormType.Method }
     *     
     */
    public OrderPaymentFormType.Method getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentFormType.Method }
     *     
     */
    public void setMethod(OrderPaymentFormType.Method value) {
        this.method = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCurrencyPriceType }
     *     
     */
    public SimpleCurrencyPriceType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCurrencyPriceType }
     *     
     */
    public void setAmount(SimpleCurrencyPriceType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentFormType.Associations }
     *     
     */
    public OrderPaymentFormType.Associations getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentFormType.Associations }
     *     
     */
    public void setAssociations(OrderPaymentFormType.Associations value) {
        this.associations = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentFormType.Payer }
     *     
     */
    public OrderPaymentFormType.Payer getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentFormType.Payer }
     *     
     */
    public void setPayer(OrderPaymentFormType.Payer value) {
        this.payer = value;
    }

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link CodesetType }
     *     
     */
    public CodesetType getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodesetType }
     *     
     */
    public void setQualifier(CodesetType value) {
        this.qualifier = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Passengers" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}GroupReference"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OfferItemSets" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="OfferItemSetRefs" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType"/&gt;
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
        "passengers",
        "offerItemSets"
    })
    public static class Associations {

        @XmlElement(name = "Passengers")
        protected OrderPaymentFormType.Associations.Passengers passengers;
        @XmlElementWrapper(name = "OfferItemSets")
        @XmlElement(name = "OfferItemSetRefs", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<Object> offerItemSets;

        /**
         * Gets the value of the passengers property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPaymentFormType.Associations.Passengers }
         *     
         */
        public OrderPaymentFormType.Associations.Passengers getPassengers() {
            return passengers;
        }

        /**
         * Sets the value of the passengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPaymentFormType.Associations.Passengers }
         *     
         */
        public void setPassengers(OrderPaymentFormType.Associations.Passengers value) {
            this.passengers = value;
        }

        public List<Object> getOfferItemSets() {
            if (offerItemSets == null) {
                offerItemSets = new ArrayList<Object>();
            }
            return offerItemSets;
        }

        public void setOfferItemSets(List<Object> offerItemSets) {
            this.offerItemSets = offerItemSets;
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
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PassengerReference"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}GroupReference"/&gt;
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
            "passengerReference",
            "groupReference"
        })
        public static class Passengers {

            @XmlList
            @XmlElement(name = "PassengerReference")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> passengerReference;
            @XmlElement(name = "GroupReference")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object groupReference;

            /**
             * 
             *                             Association to multiple Passenger instance(s). Example: pax1 pax2
             *                           Gets the value of the passengerReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passengerReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassengerReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getPassengerReference() {
                if (passengerReference == null) {
                    passengerReference = new ArrayList<Object>();
                }
                return this.passengerReference;
            }

            /**
             * Gets the value of the groupReference property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getGroupReference() {
                return groupReference;
            }

            /**
             * Sets the value of the groupReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setGroupReference(Object value) {
                this.groupReference = value;
            }

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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Voucher" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentCard" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}LoyaltyRedemption" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DirectBill" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Cash" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Check" minOccurs="0"/&gt;
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
        "voucher",
        "paymentCard",
        "loyaltyRedemption",
        "directBill",
        "cash",
        "check"
    })
    public static class Method {

        @XmlElement(name = "Voucher")
        protected Voucher voucher;
        @XmlElement(name = "PaymentCard")
        protected PaymentCardType paymentCard;
        @XmlElement(name = "LoyaltyRedemption")
        protected LoyaltyRedemption loyaltyRedemption;
        @XmlElement(name = "DirectBill")
        protected DirectBillType directBill;
        @XmlElement(name = "Cash")
        protected Cash cash;
        @XmlElement(name = "Check")
        protected Check check;

        /**
         * Information relating to prepayment vouchers.
         * 
         * @return
         *     possible object is
         *     {@link Voucher }
         *     
         */
        public Voucher getVoucher() {
            return voucher;
        }

        /**
         * Sets the value of the voucher property.
         * 
         * @param value
         *     allowed object is
         *     {@link Voucher }
         *     
         */
        public void setVoucher(Voucher value) {
            this.voucher = value;
        }

        /**
         * Gets the value of the paymentCard property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardType }
         *     
         */
        public PaymentCardType getPaymentCard() {
            return paymentCard;
        }

        /**
         * Sets the value of the paymentCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardType }
         *     
         */
        public void setPaymentCard(PaymentCardType value) {
            this.paymentCard = value;
        }

        /**
         * Gets the value of the loyaltyRedemption property.
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyRedemption }
         *     
         */
        public LoyaltyRedemption getLoyaltyRedemption() {
            return loyaltyRedemption;
        }

        /**
         * Sets the value of the loyaltyRedemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyRedemption }
         *     
         */
        public void setLoyaltyRedemption(LoyaltyRedemption value) {
            this.loyaltyRedemption = value;
        }

        /**
         * Gets the value of the directBill property.
         * 
         * @return
         *     possible object is
         *     {@link DirectBillType }
         *     
         */
        public DirectBillType getDirectBill() {
            return directBill;
        }

        /**
         * Sets the value of the directBill property.
         * 
         * @param value
         *     allowed object is
         *     {@link DirectBillType }
         *     
         */
        public void setDirectBill(DirectBillType value) {
            this.directBill = value;
        }

        /**
         * Gets the value of the cash property.
         * 
         * @return
         *     possible object is
         *     {@link Cash }
         *     
         */
        public Cash getCash() {
            return cash;
        }

        /**
         * Sets the value of the cash property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cash }
         *     
         */
        public void setCash(Cash value) {
            this.cash = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Name"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Surname"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *                   &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectPolicyMetaAttrGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Contacts" minOccurs="0"/&gt;
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
        "name",
        "contacts"
    })
    public static class Payer {

        @XmlElement(name = "Name", required = true)
        protected OrderPaymentFormType.Payer.Name name;
        @XmlElementWrapper(name = "Contacts")
        @XmlElement(name = "Contact", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<Contact> contacts;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPaymentFormType.Payer.Name }
         *     
         */
        public OrderPaymentFormType.Payer.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPaymentFormType.Payer.Name }
         *     
         */
        public void setName(OrderPaymentFormType.Payer.Name value) {
            this.name = value;
        }

        public List<Contact> getContacts() {
            if (contacts == null) {
                contacts = new ArrayList<Contact>();
            }
            return contacts;
        }

        public void setContacts(List<Contact> contacts) {
            this.contacts = contacts;
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
         *         &lt;element name="Surname"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
         *         &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectPolicyMetaAttrGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "surname",
            "given",
            "title",
            "surnameSuffix",
            "middle"
        })
        public static class Name {

            @XmlElement(name = "Surname", required = true)
            protected OrderPaymentFormType.Payer.Name.Surname surname;
            @XmlElement(name = "Given")
            protected List<OrderPaymentFormType.Payer.Name.Given> given;
            @XmlElement(name = "Title")
            protected String title;
            @XmlElement(name = "SurnameSuffix")
            protected Object surnameSuffix;
            @XmlElement(name = "Middle")
            protected List<OrderPaymentFormType.Payer.Name.Middle> middle;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;
            @XmlAttribute(name = "ObjectMetaReferences")
            @XmlIDREF
            protected List<Object> objectMetaReferences;

            /**
             * Gets the value of the surname property.
             * 
             * @return
             *     possible object is
             *     {@link OrderPaymentFormType.Payer.Name.Surname }
             *     
             */
            public OrderPaymentFormType.Payer.Name.Surname getSurname() {
                return surname;
            }

            /**
             * Sets the value of the surname property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderPaymentFormType.Payer.Name.Surname }
             *     
             */
            public void setSurname(OrderPaymentFormType.Payer.Name.Surname value) {
                this.surname = value;
            }

            /**
             * Gets the value of the given property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the given property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGiven().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderPaymentFormType.Payer.Name.Given }
             * 
             * 
             */
            public List<OrderPaymentFormType.Payer.Name.Given> getGiven() {
                if (given == null) {
                    given = new ArrayList<OrderPaymentFormType.Payer.Name.Given>();
                }
                return this.given;
            }

            /**
             * Gets the value of the title property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTitle() {
                return title;
            }

            /**
             * Sets the value of the title property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTitle(String value) {
                this.title = value;
            }

            /**
             * Gets the value of the surnameSuffix property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSurnameSuffix() {
                return surnameSuffix;
            }

            /**
             * Sets the value of the surnameSuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSurnameSuffix(Object value) {
                this.surnameSuffix = value;
            }

            /**
             * Gets the value of the middle property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the middle property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMiddle().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderPaymentFormType.Payer.Name.Middle }
             * 
             * 
             */
            public List<OrderPaymentFormType.Payer.Name.Middle> getMiddle() {
                if (middle == null) {
                    middle = new ArrayList<OrderPaymentFormType.Payer.Name.Middle>();
                }
                return this.middle;
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
             * Gets the value of the objectMetaReferences property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the objectMetaReferences property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObjectMetaReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getObjectMetaReferences() {
                if (objectMetaReferences == null) {
                    objectMetaReferences = new ArrayList<Object>();
                }
                return this.objectMetaReferences;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Given {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
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
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Middle {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
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
             *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Surname {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlIDREF
                protected List<Object> refs;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
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

        }

    }

}
