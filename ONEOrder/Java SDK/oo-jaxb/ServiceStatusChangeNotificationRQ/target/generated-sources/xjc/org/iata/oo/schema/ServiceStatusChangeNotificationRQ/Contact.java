
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


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
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AddressContact" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}EmailContact" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OtherContactMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PhoneContact" minOccurs="0"/&gt;
 *         &lt;element name="Name" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Surname"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;element name="Middle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ContactType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressContact",
    "emailContact",
    "otherContactMethod",
    "phoneContact",
    "name"
})
public class Contact {

    @XmlElement(name = "AddressContact")
    protected AddressContactType addressContact;
    @XmlElement(name = "EmailContact")
    protected EmailType emailContact;
    @XmlElement(name = "OtherContactMethod")
    protected OtherContactMethodType otherContactMethod;
    @XmlElement(name = "PhoneContact")
    protected PhoneContactType phoneContact;
    @XmlElement(name = "Name")
    protected Contact.Name name;
    @XmlAttribute(name = "ContactType")
    @XmlSchemaType(name = "anySimpleType")
    protected String contactType;

    /**
     * Gets the value of the addressContact property.
     * 
     * @return
     *     possible object is
     *     {@link AddressContactType }
     *     
     */
    public AddressContactType getAddressContact() {
        return addressContact;
    }

    /**
     * Sets the value of the addressContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressContactType }
     *     
     */
    public void setAddressContact(AddressContactType value) {
        this.addressContact = value;
    }

    /**
     * Email address details, including application (I.e. home, business, etc.).
     * 
     * @return
     *     possible object is
     *     {@link EmailType }
     *     
     */
    public EmailType getEmailContact() {
        return emailContact;
    }

    /**
     * Sets the value of the emailContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailType }
     *     
     */
    public void setEmailContact(EmailType value) {
        this.emailContact = value;
    }

    /**
     * Gets the value of the otherContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OtherContactMethodType }
     *     
     */
    public OtherContactMethodType getOtherContactMethod() {
        return otherContactMethod;
    }

    /**
     * Sets the value of the otherContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherContactMethodType }
     *     
     */
    public void setOtherContactMethod(OtherContactMethodType value) {
        this.otherContactMethod = value;
    }

    /**
     * Gets the value of the phoneContact property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneContactType }
     *     
     */
    public PhoneContactType getPhoneContact() {
        return phoneContact;
    }

    /**
     * Sets the value of the phoneContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneContactType }
     *     
     */
    public void setPhoneContact(PhoneContactType value) {
        this.phoneContact = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link Contact.Name }
     *     
     */
    public Contact.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact.Name }
     *     
     */
    public void setName(Contact.Name value) {
        this.name = value;
    }

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
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;ProperNameSimpleType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *         &lt;element name="Middle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
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
        "surname",
        "given",
        "title",
        "surnameSuffix",
        "middle"
    })
    public static class Name {

        @XmlElement(name = "Surname", required = true)
        protected Contact.Name.Surname surname;
        @XmlElement(name = "Given")
        protected List<Contact.Name.Given> given;
        @XmlElement(name = "Title")
        protected String title;
        @XmlElement(name = "SurnameSuffix")
        protected Object surnameSuffix;
        @XmlElement(name = "Middle")
        protected List<String> middle;

        /**
         * Gets the value of the surname property.
         * 
         * @return
         *     possible object is
         *     {@link Contact.Name.Surname }
         *     
         */
        public Contact.Name.Surname getSurname() {
            return surname;
        }

        /**
         * Sets the value of the surname property.
         * 
         * @param value
         *     allowed object is
         *     {@link Contact.Name.Surname }
         *     
         */
        public void setSurname(Contact.Name.Surname value) {
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
         * {@link Contact.Name.Given }
         * 
         * 
         */
        public List<Contact.Name.Given> getGiven() {
            if (given == null) {
                given = new ArrayList<Contact.Name.Given>();
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
         * {@link String }
         * 
         * 
         */
        public List<String> getMiddle() {
            if (middle == null) {
                middle = new ArrayList<String>();
            }
            return this.middle;
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

        }

    }

}
