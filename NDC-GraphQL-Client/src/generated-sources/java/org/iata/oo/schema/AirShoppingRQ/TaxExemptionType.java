//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 04:29:40 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * EXEMPT TAX representation.
 * 
 * <p>Java class for TaxExemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Total">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.2>CurrencyAmountOptType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="Entities" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="Entity" maxOccurs="unbounded">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType">
 *                             &lt;pattern value="[A-Z]{2}"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="Territories" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="Territory" maxOccurs="unbounded">
 *                         &lt;simpleType>
 *                           &lt;restriction base="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType">
 *                             &lt;pattern value="[A-Z]{2}"/>
 *                           &lt;/restriction>
 *                         &lt;/simpleType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="Countries" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}CountryCode" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="Tax" maxOccurs="unbounded">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Designator" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
 *                     &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType"/>
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}CountryCode" minOccurs="0"/>
 *                     &lt;element name="Nature" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
 *                     &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType" minOccurs="0"/>
 *                     &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *                   &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="CollectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxExemptionType", propOrder = {
    "total",
    "entities",
    "territories",
    "countries",
    "tax"
})
public class TaxExemptionType {

    @XmlElement(name = "Total", required = true)
    protected TaxExemptionType.Total total;
    @XmlElement(name = "Entities")
    protected TaxExemptionType.Entities entities;
    @XmlElement(name = "Territories")
    protected TaxExemptionType.Territories territories;
    @XmlElement(name = "Countries")
    protected TaxExemptionType.Countries countries;
    @XmlElement(name = "Tax")
    protected List<TaxExemptionType.Tax> tax;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionType.Total }
     *     
     */
    public TaxExemptionType.Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionType.Total }
     *     
     */
    public void setTotal(TaxExemptionType.Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the entities property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionType.Entities }
     *     
     */
    public TaxExemptionType.Entities getEntities() {
        return entities;
    }

    /**
     * Sets the value of the entities property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionType.Entities }
     *     
     */
    public void setEntities(TaxExemptionType.Entities value) {
        this.entities = value;
    }

    /**
     * Gets the value of the territories property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionType.Territories }
     *     
     */
    public TaxExemptionType.Territories getTerritories() {
        return territories;
    }

    /**
     * Sets the value of the territories property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionType.Territories }
     *     
     */
    public void setTerritories(TaxExemptionType.Territories value) {
        this.territories = value;
    }

    /**
     * Gets the value of the countries property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionType.Countries }
     *     
     */
    public TaxExemptionType.Countries getCountries() {
        return countries;
    }

    /**
     * Sets the value of the countries property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionType.Countries }
     *     
     */
    public void setCountries(TaxExemptionType.Countries value) {
        this.countries = value;
    }

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxExemptionType.Tax }
     * 
     * 
     */
    public List<TaxExemptionType.Tax> getTax() {
        if (tax == null) {
            tax = new ArrayList<TaxExemptionType.Tax>();
        }
        return this.tax;
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}CountryCode" maxOccurs="unbounded"/>
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
        "countryCode"
    })
    public static class Countries {

        @XmlElement(name = "CountryCode", required = true)
        protected List<CountryCode> countryCode;

        /**
         * Gets the value of the countryCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryCode }
         * 
         * 
         */
        public List<CountryCode> getCountryCode() {
            if (countryCode == null) {
                countryCode = new ArrayList<CountryCode>();
            }
            return this.countryCode;
        }

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
     *         &lt;element name="Entity" maxOccurs="unbounded">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType">
     *               &lt;pattern value="[A-Z]{2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "entity"
    })
    public static class Entities {

        @XmlElement(name = "Entity", required = true)
        protected List<String> entity;

        /**
         * Gets the value of the entity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the entity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEntity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getEntity() {
            if (entity == null) {
                entity = new ArrayList<String>();
            }
            return this.entity;
        }

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
     *         &lt;element name="Designator" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType"/>
     *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}CountryCode" minOccurs="0"/>
     *         &lt;element name="Nature" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" minOccurs="0"/>
     *         &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/EDIST/2017.2}CurrencyAmountOptType" minOccurs="0"/>
     *         &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}ShortDescSimpleType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}ObjAssociationAttrGroup"/>
     *       &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CollectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "designator",
        "amount",
        "countryCode",
        "nature",
        "localAmount",
        "description"
    })
    public static class Tax {

        @XmlElement(name = "Designator", required = true)
        protected String designator;
        @XmlElement(name = "Amount", required = true)
        protected CurrencyAmountOptType amount;
        @XmlElement(name = "CountryCode")
        protected CountryCode countryCode;
        @XmlElement(name = "Nature")
        protected String nature;
        @XmlElement(name = "LocalAmount")
        protected CurrencyAmountOptType localAmount;
        @XmlElement(name = "Description")
        protected String description;
        @XmlAttribute(name = "ApproxInd")
        protected Boolean approxInd;
        @XmlAttribute(name = "CollectionInd")
        protected Boolean collectionInd;
        @XmlAttribute(name = "RefundInd")
        protected Boolean refundInd;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the designator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesignator() {
            return designator;
        }

        /**
         * Sets the value of the designator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesignator(String value) {
            this.designator = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setAmount(CurrencyAmountOptType value) {
            this.amount = value;
        }

        /**
         * Exempt tax country code.  Example: US
         * 
         * Encoding Scheme: ISO 3166-1 (two character) Country Code
         * 
         * @return
         *     possible object is
         *     {@link CountryCode }
         *     
         */
        public CountryCode getCountryCode() {
            return countryCode;
        }

        /**
         * Sets the value of the countryCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CountryCode }
         *     
         */
        public void setCountryCode(CountryCode value) {
            this.countryCode = value;
        }

        /**
         * Gets the value of the nature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNature() {
            return nature;
        }

        /**
         * Sets the value of the nature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNature(String value) {
            this.nature = value;
        }

        /**
         * Gets the value of the localAmount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getLocalAmount() {
            return localAmount;
        }

        /**
         * Sets the value of the localAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setLocalAmount(CurrencyAmountOptType value) {
            this.localAmount = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the approxInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isApproxInd() {
            return approxInd;
        }

        /**
         * Sets the value of the approxInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setApproxInd(Boolean value) {
            this.approxInd = value;
        }

        /**
         * Gets the value of the collectionInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCollectionInd() {
            return collectionInd;
        }

        /**
         * Sets the value of the collectionInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCollectionInd(Boolean value) {
            this.collectionInd = value;
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Territory" maxOccurs="unbounded">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType">
     *               &lt;pattern value="[A-Z]{2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
        "territory"
    })
    public static class Territories {

        @XmlElement(name = "Territory", required = true)
        protected List<String> territory;

        /**
         * Gets the value of the territory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the territory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTerritory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTerritory() {
            if (territory == null) {
                territory = new ArrayList<String>();
            }
            return this.territory;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.2>CurrencyAmountOptType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Total
        extends CurrencyAmountOptType
    {


    }

}
