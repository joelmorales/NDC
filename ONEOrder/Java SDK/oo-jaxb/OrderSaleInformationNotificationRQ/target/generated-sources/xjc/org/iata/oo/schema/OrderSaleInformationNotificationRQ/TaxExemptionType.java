
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
 * EXEMPT TAX representation.
 * 
 * <p>Java class for TaxExemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Total"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CurrencyAmountOptType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="Entities" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="Entity" maxOccurs="unbounded"&gt;
 *                         &lt;simpleType&gt;
 *                           &lt;restriction base="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"&gt;
 *                             &lt;pattern value="[A-Z]{2}"/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/simpleType&gt;
 *                       &lt;/element&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="Territories" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="Territory" maxOccurs="unbounded"&gt;
 *                         &lt;simpleType&gt;
 *                           &lt;restriction base="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType"&gt;
 *                             &lt;pattern value="[A-Z]{2}"/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/simpleType&gt;
 *                       &lt;/element&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="Countries" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryCode" maxOccurs="unbounded"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="Tax" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Designator" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType"/&gt;
 *                     &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryCode" minOccurs="0"/&gt;
 *                     &lt;element name="Nature" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
 *                     &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                     &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *                   &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                   &lt;attribute name="CollectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                   &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
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
    @XmlElementWrapper(name = "Entities")
    @XmlElement(name = "Entity", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<String> entities;
    @XmlElementWrapper(name = "Territories")
    @XmlElement(name = "Territory", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<String> territories;
    @XmlElementWrapper(name = "Countries")
    @XmlElement(name = "CountryCode", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<CountryCode> countries;
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

    public List<String> getEntities() {
        if (entities == null) {
            entities = new ArrayList<String>();
        }
        return entities;
    }

    public void setEntities(List<String> entities) {
        this.entities = entities;
    }

    public List<String> getTerritories() {
        if (territories == null) {
            territories = new ArrayList<String>();
        }
        return territories;
    }

    public void setTerritories(List<String> territories) {
        this.territories = territories;
    }

    public List<CountryCode> getCountries() {
        if (countries == null) {
            countries = new ArrayList<CountryCode>();
        }
        return countries;
    }

    public void setCountries(List<CountryCode> countries) {
        this.countries = countries;
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
     *         &lt;element name="Designator" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType"/&gt;
     *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CountryCode" minOccurs="0"/&gt;
     *         &lt;element name="Nature" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
     *         &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/&gt;
     *         &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}ShortDescSimpleType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
     *       &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="CollectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
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
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CurrencyAmountOptType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
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
