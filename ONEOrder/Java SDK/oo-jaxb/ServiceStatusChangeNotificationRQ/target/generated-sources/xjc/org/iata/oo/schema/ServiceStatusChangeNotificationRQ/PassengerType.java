
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Any person except members of the crew carried or to be carried with the consent of the carrier, on board of any transport vehicle such as aircraft, train, bus, ship.  Holds the attributes specific to a one booking, from shopping to fulfilment.
 * 
 * <p>Java class for PassengerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTC" type="{http://www.iata.org/IATA/EDIST/2017.1}PassengerTypeCodeType" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="Age" type="{http://www.iata.org/IATA/EDIST/2017.1}MeasureType" minOccurs="0"/&gt;
 *           &lt;element name="Birthdate" type="{http://www.iata.org/IATA/EDIST/2017.1}DateType" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ResidenceCountryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ISO_3166CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CitizenshipCountryCode" type="{http://www.iata.org/IATA/EDIST/2017.1}ISO_3166CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Individual" type="{http://www.iata.org/IATA/EDIST/2017.1}IndividualType" minOccurs="0"/&gt;
 *         &lt;element name="ProfileID" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyProgramAccount" type="{http://www.iata.org/IATA/EDIST/2017.1}LoyaltyProgramAccountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FOID" type="{http://www.iata.org/IATA/EDIST/2017.1}FOID" minOccurs="0"/&gt;
 *         &lt;element name="IdentityDocument" type="{http://www.iata.org/IATA/EDIST/2017.1}IdentityDocumentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactInformation" type="{http://www.iata.org/IATA/EDIST/2017.1}ContactInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="InfantRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.iata.org/IATA/EDIST/2017.1}LanguageUsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Remark" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}RemarkTypeAIDM"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PassengerID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="ProfileConsentIndicator" type="{http://www.iata.org/IATA/EDIST/2017.1}IndicatorType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerType", propOrder = {
    "ptc",
    "age",
    "birthdate",
    "residenceCountryCode",
    "citizenshipCountryCode",
    "individual",
    "profileID",
    "loyaltyProgramAccount",
    "foid",
    "identityDocument",
    "contactInformation",
    "infantRef",
    "language",
    "remark"
})
public class PassengerType {

    @XmlElement(name = "PTC")
    protected String ptc;
    @XmlElement(name = "Age")
    protected MeasureType age;
    @XmlElement(name = "Birthdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "ResidenceCountryCode")
    protected String residenceCountryCode;
    @XmlElement(name = "CitizenshipCountryCode")
    protected String citizenshipCountryCode;
    @XmlElement(name = "Individual")
    protected IndividualType individual;
    @XmlElement(name = "ProfileID")
    protected String profileID;
    @XmlElement(name = "LoyaltyProgramAccount")
    protected List<LoyaltyProgramAccountType> loyaltyProgramAccount;
    @XmlElement(name = "FOID")
    protected FOID foid;
    @XmlElement(name = "IdentityDocument")
    protected List<IdentityDocumentType> identityDocument;
    @XmlElement(name = "ContactInformation", required = true)
    protected List<ContactInformationType> contactInformation;
    @XmlElement(name = "InfantRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object infantRef;
    @XmlElement(name = "Language")
    protected List<LanguageUsageType> language;
    @XmlElement(name = "Remark")
    protected List<PassengerType.Remark> remark;
    @XmlAttribute(name = "PassengerID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String passengerID;
    @XmlAttribute(name = "ProfileConsentIndicator")
    protected Boolean profileConsentIndicator;

    /**
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTC(String value) {
        this.ptc = value;
    }

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAge(MeasureType value) {
        this.age = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the residenceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Sets the value of the residenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryCode(String value) {
        this.residenceCountryCode = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipCountryCode(String value) {
        this.citizenshipCountryCode = value;
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
     * Gets the value of the profileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileID() {
        return profileID;
    }

    /**
     * Sets the value of the profileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileID(String value) {
        this.profileID = value;
    }

    /**
     * Gets the value of the loyaltyProgramAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgramAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyProgramAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramAccountType }
     * 
     * 
     */
    public List<LoyaltyProgramAccountType> getLoyaltyProgramAccount() {
        if (loyaltyProgramAccount == null) {
            loyaltyProgramAccount = new ArrayList<LoyaltyProgramAccountType>();
        }
        return this.loyaltyProgramAccount;
    }

    /**
     * Gets the value of the foid property.
     * 
     * @return
     *     possible object is
     *     {@link FOID }
     *     
     */
    public FOID getFOID() {
        return foid;
    }

    /**
     * Sets the value of the foid property.
     * 
     * @param value
     *     allowed object is
     *     {@link FOID }
     *     
     */
    public void setFOID(FOID value) {
        this.foid = value;
    }

    /**
     * Gets the value of the identityDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityDocumentType }
     * 
     * 
     */
    public List<IdentityDocumentType> getIdentityDocument() {
        if (identityDocument == null) {
            identityDocument = new ArrayList<IdentityDocumentType>();
        }
        return this.identityDocument;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationType }
     * 
     * 
     */
    public List<ContactInformationType> getContactInformation() {
        if (contactInformation == null) {
            contactInformation = new ArrayList<ContactInformationType>();
        }
        return this.contactInformation;
    }

    /**
     * Gets the value of the infantRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getInfantRef() {
        return infantRef;
    }

    /**
     * Sets the value of the infantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setInfantRef(Object value) {
        this.infantRef = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageUsageType }
     * 
     * 
     */
    public List<LanguageUsageType> getLanguage() {
        if (language == null) {
            language = new ArrayList<LanguageUsageType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PassengerType.Remark }
     * 
     * 
     */
    public List<PassengerType.Remark> getRemark() {
        if (remark == null) {
            remark = new ArrayList<PassengerType.Remark>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the passengerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerID() {
        return passengerID;
    }

    /**
     * Sets the value of the passengerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerID(String value) {
        this.passengerID = value;
    }

    /**
     * Gets the value of the profileConsentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfileConsentIndicator() {
        return profileConsentIndicator;
    }

    /**
     * Sets the value of the profileConsentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfileConsentIndicator(Boolean value) {
        this.profileConsentIndicator = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}RemarkTypeAIDM"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Remark
        extends RemarkTypeAIDM
    {


    }

}
