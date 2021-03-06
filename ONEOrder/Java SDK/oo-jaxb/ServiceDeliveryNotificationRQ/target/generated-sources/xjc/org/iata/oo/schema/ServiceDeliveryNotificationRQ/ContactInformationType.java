
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
 * 
 * <p>Java class for ContactInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactType" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://www.iata.org/IATA/EDIST/2017.1}PostalAddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ContactProvided" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="EmailAddress" type="{http://www.iata.org/IATA/EDIST/2017.1}EmailAddressType" maxOccurs="unbounded"/&gt;
 *                     &lt;element name="Phone" type="{http://www.iata.org/IATA/EDIST/2017.1}PhoneTypeAIDM" maxOccurs="unbounded"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="ContactNotProvided" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="OtherAddress" type="{http://www.iata.org/IATA/EDIST/2017.1}OtherAddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="IndividualRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *           &lt;element name="Individual" type="{http://www.iata.org/IATA/EDIST/2017.1}IndividualType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContactID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformationType", propOrder = {
    "contactType",
    "postalAddress",
    "contactProvided",
    "contactNotProvided",
    "otherAddress",
    "individualRef",
    "individual"
})
public class ContactInformationType {

    @XmlElement(name = "ContactType")
    protected String contactType;
    @XmlElement(name = "PostalAddress")
    protected List<PostalAddressType> postalAddress;
    @XmlElement(name = "ContactProvided")
    protected List<ContactInformationType.ContactProvided> contactProvided;
    @XmlElement(name = "ContactNotProvided")
    protected String contactNotProvided;
    @XmlElement(name = "OtherAddress")
    protected List<OtherAddressType> otherAddress;
    @XmlElement(name = "IndividualRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object individualRef;
    @XmlElement(name = "Individual")
    protected IndividualType individual;
    @XmlAttribute(name = "ContactID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String contactID;

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressType }
     * 
     * 
     */
    public List<PostalAddressType> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<PostalAddressType>();
        }
        return this.postalAddress;
    }

    /**
     * Gets the value of the contactProvided property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactProvided property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactProvided().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationType.ContactProvided }
     * 
     * 
     */
    public List<ContactInformationType.ContactProvided> getContactProvided() {
        if (contactProvided == null) {
            contactProvided = new ArrayList<ContactInformationType.ContactProvided>();
        }
        return this.contactProvided;
    }

    /**
     * Gets the value of the contactNotProvided property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactNotProvided() {
        return contactNotProvided;
    }

    /**
     * Sets the value of the contactNotProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactNotProvided(String value) {
        this.contactNotProvided = value;
    }

    /**
     * Gets the value of the otherAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAddressType }
     * 
     * 
     */
    public List<OtherAddressType> getOtherAddress() {
        if (otherAddress == null) {
            otherAddress = new ArrayList<OtherAddressType>();
        }
        return this.otherAddress;
    }

    /**
     * Gets the value of the individualRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIndividualRef() {
        return individualRef;
    }

    /**
     * Sets the value of the individualRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIndividualRef(Object value) {
        this.individualRef = value;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setIndividual(IndividualType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the contactID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactID() {
        return contactID;
    }

    /**
     * Sets the value of the contactID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactID(String value) {
        this.contactID = value;
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
     *         &lt;element name="EmailAddress" type="{http://www.iata.org/IATA/EDIST/2017.1}EmailAddressType" maxOccurs="unbounded"/&gt;
     *         &lt;element name="Phone" type="{http://www.iata.org/IATA/EDIST/2017.1}PhoneTypeAIDM" maxOccurs="unbounded"/&gt;
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
        "emailAddress",
        "phone"
    })
    public static class ContactProvided {

        @XmlElement(name = "EmailAddress")
        protected List<EmailAddressType> emailAddress;
        @XmlElement(name = "Phone")
        protected List<PhoneTypeAIDM> phone;

        /**
         * Gets the value of the emailAddress property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmailAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmailAddressType }
         * 
         * 
         */
        public List<EmailAddressType> getEmailAddress() {
            if (emailAddress == null) {
                emailAddress = new ArrayList<EmailAddressType>();
            }
            return this.emailAddress;
        }

        /**
         * Gets the value of the phone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PhoneTypeAIDM }
         * 
         * 
         */
        public List<PhoneTypeAIDM> getPhone() {
            if (phone == null) {
                phone = new ArrayList<PhoneTypeAIDM>();
            }
            return this.phone;
        }

    }

}
