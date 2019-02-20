
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
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
