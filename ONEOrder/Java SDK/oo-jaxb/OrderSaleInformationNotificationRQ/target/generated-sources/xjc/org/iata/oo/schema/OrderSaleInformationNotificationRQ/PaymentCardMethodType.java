
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

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
 * PAYMENT CARD Payment Method definition.
 * 
 * <p>Java class for PaymentCardMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardMethodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardType" type="{http://www.iata.org/IATA/EDIST/2017.1}PayCardTypeSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="CardCode" type="{http://www.iata.org/IATA/EDIST/2017.1}PayCardCodeSimpleType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Contacts" minOccurs="0"/&gt;
 *         &lt;element name="CardIssuerName" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BankID" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardholderAddress" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleAddress"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentAddress"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ApprovalType" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardMethodType", propOrder = {
    "cardType",
    "cardCode",
    "contacts",
    "cardIssuerName",
    "cardholderAddress",
    "approvalType"
})
public class PaymentCardMethodType {

    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElementWrapper(name = "Contacts")
    @XmlElement(name = "Contact", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<Contact> contacts;
    @XmlElement(name = "CardIssuerName")
    protected PaymentCardMethodType.CardIssuerName cardIssuerName;
    @XmlElement(name = "CardholderAddress")
    protected PaymentCardMethodType.CardholderAddress cardholderAddress;
    @XmlElement(name = "ApprovalType")
    protected String approvalType;

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Sets the value of the cardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Gets the value of the cardIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardMethodType.CardIssuerName }
     *     
     */
    public PaymentCardMethodType.CardIssuerName getCardIssuerName() {
        return cardIssuerName;
    }

    /**
     * Sets the value of the cardIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardMethodType.CardIssuerName }
     *     
     */
    public void setCardIssuerName(PaymentCardMethodType.CardIssuerName value) {
        this.cardIssuerName = value;
    }

    /**
     * Gets the value of the cardholderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardMethodType.CardholderAddress }
     *     
     */
    public PaymentCardMethodType.CardholderAddress getCardholderAddress() {
        return cardholderAddress;
    }

    /**
     * Sets the value of the cardholderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardMethodType.CardholderAddress }
     *     
     */
    public void setCardholderAddress(PaymentCardMethodType.CardholderAddress value) {
        this.cardholderAddress = value;
    }

    /**
     * Gets the value of the approvalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalType() {
        return approvalType;
    }

    /**
     * Sets the value of the approvalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalType(String value) {
        this.approvalType = value;
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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleAddress"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentAddress"/&gt;
     *       &lt;/choice&gt;
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
        "simpleAddress",
        "structuredAddress",
        "paymentAddress"
    })
    public static class CardholderAddress {

        @XmlElement(name = "SimpleAddress")
        protected SimpleAddrType simpleAddress;
        @XmlElement(name = "StructuredAddress")
        protected StructuredAddrType structuredAddress;
        @XmlElement(name = "PaymentAddress")
        protected PaymentAddrType paymentAddress;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the simpleAddress property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleAddrType }
         *     
         */
        public SimpleAddrType getSimpleAddress() {
            return simpleAddress;
        }

        /**
         * Sets the value of the simpleAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleAddrType }
         *     
         */
        public void setSimpleAddress(SimpleAddrType value) {
            this.simpleAddress = value;
        }

        /**
         * Gets the value of the structuredAddress property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredAddrType }
         *     
         */
        public StructuredAddrType getStructuredAddress() {
            return structuredAddress;
        }

        /**
         * Sets the value of the structuredAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredAddrType }
         *     
         */
        public void setStructuredAddress(StructuredAddrType value) {
            this.structuredAddress = value;
        }

        /**
         * Gets the value of the paymentAddress property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentAddrType }
         *     
         */
        public PaymentAddrType getPaymentAddress() {
            return paymentAddress;
        }

        /**
         * Sets the value of the paymentAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentAddrType }
         *     
         */
        public void setPaymentAddress(PaymentAddrType value) {
            this.paymentAddress = value;
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BankID" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"/&gt;
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
        "bankID"
    })
    public static class CardIssuerName {

        @XmlElement(name = "BankID", required = true)
        protected String bankID;

        /**
         * Gets the value of the bankID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankID() {
            return bankID;
        }

        /**
         * Sets the value of the bankID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankID(String value) {
            this.bankID = value;
        }

    }

}
