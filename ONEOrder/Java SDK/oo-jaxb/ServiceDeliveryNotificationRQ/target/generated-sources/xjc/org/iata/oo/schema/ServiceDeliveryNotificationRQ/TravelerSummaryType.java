
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type for SUMMARY Traveler representation.
 * 
 * <p>Java class for TravelerSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelerSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Surname" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"/&gt;
 *                   &lt;element name="Given" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" maxOccurs="5" minOccurs="0"/&gt;
 *                   &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Middle" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="3" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassengerAssociation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResidenceCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CountrySimpleType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Age" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Value"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
 *                           &lt;attribute name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}AgeUnitSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BirthDate"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BirthCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CitizenshipCountryCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CountrySimpleType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AddressContact" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerSummaryType", propOrder = {
    "name",
    "contactMethod",
    "passengerAssociation",
    "passengerTypeCode",
    "residenceCode",
    "age",
    "birthCountry",
    "citizenshipCountryCode",
    "addressContact"
})
public class TravelerSummaryType {

    @XmlElement(name = "Name", required = true)
    protected TravelerSummaryType.Name name;
    @XmlElement(name = "ContactMethod")
    protected String contactMethod;
    @XmlElement(name = "PassengerAssociation")
    protected String passengerAssociation;
    @XmlElement(name = "PassengerTypeCode", required = true)
    protected String passengerTypeCode;
    @XmlElement(name = "ResidenceCode")
    protected TravelerSummaryType.ResidenceCode residenceCode;
    @XmlElement(name = "Age")
    protected TravelerSummaryType.Age age;
    @XmlElement(name = "BirthCountry")
    protected String birthCountry;
    @XmlElement(name = "CitizenshipCountryCode")
    protected TravelerSummaryType.CitizenshipCountryCode citizenshipCountryCode;
    @XmlElement(name = "AddressContact")
    protected AddressContactType addressContact;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerSummaryType.Name }
     *     
     */
    public TravelerSummaryType.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerSummaryType.Name }
     *     
     */
    public void setName(TravelerSummaryType.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the contactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMethod() {
        return contactMethod;
    }

    /**
     * Sets the value of the contactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMethod(String value) {
        this.contactMethod = value;
    }

    /**
     * Gets the value of the passengerAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerAssociation() {
        return passengerAssociation;
    }

    /**
     * Sets the value of the passengerAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerAssociation(String value) {
        this.passengerAssociation = value;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * Sets the value of the passengerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * Gets the value of the residenceCode property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerSummaryType.ResidenceCode }
     *     
     */
    public TravelerSummaryType.ResidenceCode getResidenceCode() {
        return residenceCode;
    }

    /**
     * Sets the value of the residenceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerSummaryType.ResidenceCode }
     *     
     */
    public void setResidenceCode(TravelerSummaryType.ResidenceCode value) {
        this.residenceCode = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerSummaryType.Age }
     *     
     */
    public TravelerSummaryType.Age getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerSummaryType.Age }
     *     
     */
    public void setAge(TravelerSummaryType.Age value) {
        this.age = value;
    }

    /**
     * Gets the value of the birthCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountry() {
        return birthCountry;
    }

    /**
     * Sets the value of the birthCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountry(String value) {
        this.birthCountry = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link TravelerSummaryType.CitizenshipCountryCode }
     *     
     */
    public TravelerSummaryType.CitizenshipCountryCode getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelerSummaryType.CitizenshipCountryCode }
     *     
     */
    public void setCitizenshipCountryCode(TravelerSummaryType.CitizenshipCountryCode value) {
        this.citizenshipCountryCode = value;
    }

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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="Value"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
     *                 &lt;attribute name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}AgeUnitSimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BirthDate"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "value",
        "birthDate"
    })
    public static class Age {

        @XmlElement(name = "Value")
        protected TravelerSummaryType.Age.Value value;
        @XmlElement(name = "BirthDate")
        protected TravelerSummaryType.Age.BirthDate birthDate;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerSummaryType.Age.Value }
         *     
         */
        public TravelerSummaryType.Age.Value getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerSummaryType.Age.Value }
         *     
         */
        public void setValue(TravelerSummaryType.Age.Value value) {
            this.value = value;
        }

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link TravelerSummaryType.Age.BirthDate }
         *     
         */
        public TravelerSummaryType.Age.BirthDate getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link TravelerSummaryType.Age.BirthDate }
         *     
         */
        public void setBirthDate(TravelerSummaryType.Age.BirthDate value) {
            this.birthDate = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
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
        public static class BirthDate {

            @XmlValue
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar value;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
         *       &lt;attribute name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}AgeUnitSimpleType" /&gt;
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
        public static class Value {

            @XmlValue
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger value;
            @XmlAttribute(name = "UOM")
            protected AgeUnitSimpleType uom;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValue(BigInteger value) {
                this.value = value;
            }

            /**
             * Gets the value of the uom property.
             * 
             * @return
             *     possible object is
             *     {@link AgeUnitSimpleType }
             *     
             */
            public AgeUnitSimpleType getUOM() {
                return uom;
            }

            /**
             * Sets the value of the uom property.
             * 
             * @param value
             *     allowed object is
             *     {@link AgeUnitSimpleType }
             *     
             */
            public void setUOM(AgeUnitSimpleType value) {
                this.uom = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CountrySimpleType"&gt;
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
    public static class CitizenshipCountryCode {

        @XmlValue
        protected String value;

        /**
         * A data type for Country Code encoding constraint: ISO 3166-1 (two character) Country Code
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Surname" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"/&gt;
     *         &lt;element name="Given" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" maxOccurs="5" minOccurs="0"/&gt;
     *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SurnameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        protected String surname;
        @XmlElement(name = "Given")
        protected List<String> given;
        @XmlElement(name = "Title")
        protected String title;
        @XmlElement(name = "SurnameSuffix")
        protected String surnameSuffix;
        @XmlElement(name = "Middle")
        protected List<String> middle;

        /**
         * Gets the value of the surname property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurname() {
            return surname;
        }

        /**
         * Sets the value of the surname property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurname(String value) {
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
         * {@link String }
         * 
         * 
         */
        public List<String> getGiven() {
            if (given == null) {
                given = new ArrayList<String>();
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
         *     {@link String }
         *     
         */
        public String getSurnameSuffix() {
            return surnameSuffix;
        }

        /**
         * Sets the value of the surnameSuffix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurnameSuffix(String value) {
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CountrySimpleType"&gt;
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
    public static class ResidenceCode {

        @XmlValue
        protected String value;

        /**
         * A data type for Country Code encoding constraint: ISO 3166-1 (two character) Country Code
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
