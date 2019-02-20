
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Price" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ClassOfService" minOccurs="0"/&gt;
 *                   &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderPenaltyType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission" minOccurs="0"/&gt;
 *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PercentageValue" minOccurs="0"/&gt;
 *                   &lt;element name="ApplicableRemarks" type="{http://www.iata.org/IATA/EDIST/2017.1}RemarkType" minOccurs="0"/&gt;
 *                   &lt;element name="PriceQuotes" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PriceQuote" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Amount"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmount"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Source"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                               &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceGuaranteeTimeLimit"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.1}TaxDetailType" minOccurs="0"/&gt;
 *                   &lt;element name="Fees" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" minOccurs="0"/&gt;
 *                   &lt;element name="FareGroup" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Fare"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareCode"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareDetail" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FareBasisCode"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType"/&gt;
 *                                       &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisAppSimpleType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}DataListObjAttrGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FareCalculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OrderItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="Owner" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType" /&gt;
 *       &lt;attribute name="OwnerType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="ORA"/&gt;
 *             &lt;enumeration value="POA"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "price",
    "service"
})
@XmlRootElement(name = "OrderItem")
public class OrderItem {

    @XmlElement(name = "Price", required = true)
    protected List<OrderItem.Price> price;
    @XmlElement(name = "Service")
    protected List<ServiceDetailType> service;
    @XmlAttribute(name = "OrderItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String orderItemID;
    @XmlAttribute(name = "Owner", required = true)
    protected String owner;
    @XmlAttribute(name = "OwnerType")
    protected String ownerType;

    /**
     * Gets the value of the price property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the price property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItem.Price }
     * 
     * 
     */
    public List<OrderItem.Price> getPrice() {
        if (price == null) {
            price = new ArrayList<OrderItem.Price>();
        }
        return this.price;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDetailType }
     * 
     * 
     */
    public List<ServiceDetailType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceDetailType>();
        }
        return this.service;
    }

    /**
     * Gets the value of the orderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemID() {
        return orderItemID;
    }

    /**
     * Sets the value of the orderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemID(String value) {
        this.orderItemID = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ClassOfService" minOccurs="0"/&gt;
     *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/EDIST/2017.1}OrderPenaltyType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission" minOccurs="0"/&gt;
     *         &lt;element name="Amount" type="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmountOptType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PercentageValue" minOccurs="0"/&gt;
     *         &lt;element name="ApplicableRemarks" type="{http://www.iata.org/IATA/EDIST/2017.1}RemarkType" minOccurs="0"/&gt;
     *         &lt;element name="PriceQuotes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PriceQuote" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Amount"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmount"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Source"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                                     &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceGuaranteeTimeLimit"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/EDIST/2017.1}TaxDetailType" minOccurs="0"/&gt;
     *         &lt;element name="Fees" type="{http://www.iata.org/IATA/EDIST/2017.1}FeeSurchargeType" minOccurs="0"/&gt;
     *         &lt;element name="FareGroup" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Fare"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareCode"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareDetail" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FareBasisCode"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType"/&gt;
     *                             &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisAppSimpleType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}DataListObjAttrGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FareCalculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "classOfService",
        "penalty",
        "commission",
        "amount",
        "percentageValue",
        "applicableRemarks",
        "priceQuotes",
        "taxes",
        "fees",
        "fareGroup",
        "fareCalculation"
    })
    public static class Price {

        @XmlElement(name = "ClassOfService")
        protected FlightCOSCoreType classOfService;
        @XmlElement(name = "Penalty")
        protected OrderPenaltyType penalty;
        @XmlElement(name = "Commission")
        protected CommissionType commission;
        @XmlElement(name = "Amount")
        protected CurrencyAmountOptType amount;
        @XmlElement(name = "PercentageValue")
        protected BigDecimal percentageValue;
        @XmlElementWrapper(name = "ApplicableRemarks")
        @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<Remark> applicableRemarks;
        @XmlElementWrapper(name = "PriceQuotes")
        @XmlElement(name = "PriceQuote", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<OrderItem.Price.PriceQuote> priceQuotes;
        @XmlElement(name = "Taxes")
        protected TaxDetailType taxes;
        @XmlElement(name = "Fees")
        protected FeeSurchargeType fees;
        @XmlElement(name = "FareGroup")
        protected List<OrderItem.Price.FareGroup> fareGroup;
        @XmlElement(name = "FareCalculation")
        protected String fareCalculation;

        /**
         * Gets the value of the classOfService property.
         * 
         * @return
         *     possible object is
         *     {@link FlightCOSCoreType }
         *     
         */
        public FlightCOSCoreType getClassOfService() {
            return classOfService;
        }

        /**
         * Sets the value of the classOfService property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightCOSCoreType }
         *     
         */
        public void setClassOfService(FlightCOSCoreType value) {
            this.classOfService = value;
        }

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link OrderPenaltyType }
         *     
         */
        public OrderPenaltyType getPenalty() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderPenaltyType }
         *     
         */
        public void setPenalty(OrderPenaltyType value) {
            this.penalty = value;
        }

        /**
         * Gets the value of the commission property.
         * 
         * @return
         *     possible object is
         *     {@link CommissionType }
         *     
         */
        public CommissionType getCommission() {
            return commission;
        }

        /**
         * Sets the value of the commission property.
         * 
         * @param value
         *     allowed object is
         *     {@link CommissionType }
         *     
         */
        public void setCommission(CommissionType value) {
            this.commission = value;
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
         * Gets the value of the percentageValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentageValue() {
            return percentageValue;
        }

        /**
         * Sets the value of the percentageValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentageValue(BigDecimal value) {
            this.percentageValue = value;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link TaxDetailType }
         *     
         */
        public TaxDetailType getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxDetailType }
         *     
         */
        public void setTaxes(TaxDetailType value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the fees property.
         * 
         * @return
         *     possible object is
         *     {@link FeeSurchargeType }
         *     
         */
        public FeeSurchargeType getFees() {
            return fees;
        }

        /**
         * Sets the value of the fees property.
         * 
         * @param value
         *     allowed object is
         *     {@link FeeSurchargeType }
         *     
         */
        public void setFees(FeeSurchargeType value) {
            this.fees = value;
        }

        /**
         * Gets the value of the fareGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderItem.Price.FareGroup }
         * 
         * 
         */
        public List<OrderItem.Price.FareGroup> getFareGroup() {
            if (fareGroup == null) {
                fareGroup = new ArrayList<OrderItem.Price.FareGroup>();
            }
            return this.fareGroup;
        }

        /**
         * Gets the value of the fareCalculation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareCalculation() {
            return fareCalculation;
        }

        /**
         * Sets the value of the fareCalculation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareCalculation(String value) {
            this.fareCalculation = value;
        }

        public List<Remark> getApplicableRemarks() {
            if (applicableRemarks == null) {
                applicableRemarks = new ArrayList<Remark>();
            }
            return applicableRemarks;
        }

        public void setApplicableRemarks(List<Remark> applicableRemarks) {
            this.applicableRemarks = applicableRemarks;
        }

        public List<OrderItem.Price.PriceQuote> getPriceQuotes() {
            if (priceQuotes == null) {
                priceQuotes = new ArrayList<OrderItem.Price.PriceQuote>();
            }
            return priceQuotes;
        }

        public void setPriceQuotes(List<OrderItem.Price.PriceQuote> priceQuotes) {
            this.priceQuotes = priceQuotes;
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
         *         &lt;element name="Fare"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareCode"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareDetail" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FareBasisCode"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType"/&gt;
         *                   &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisAppSimpleType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}DataListObjAttrGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "fare",
            "fareBasisCode"
        })
        public static class FareGroup {

            @XmlElement(name = "Fare", required = true)
            protected OrderItem.Price.FareGroup.Fare fare;
            @XmlElement(name = "FareBasisCode", required = true)
            protected OrderItem.Price.FareGroup.FareBasisCode fareBasisCode;
            @XmlAttribute(name = "refs")
            @XmlIDREF
            protected List<Object> refs;
            @XmlAttribute(name = "ListKey", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String listKey;

            /**
             * Gets the value of the fare property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItem.Price.FareGroup.Fare }
             *     
             */
            public OrderItem.Price.FareGroup.Fare getFare() {
                return fare;
            }

            /**
             * Sets the value of the fare property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItem.Price.FareGroup.Fare }
             *     
             */
            public void setFare(OrderItem.Price.FareGroup.Fare value) {
                this.fare = value;
            }

            /**
             * Gets the value of the fareBasisCode property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItem.Price.FareGroup.FareBasisCode }
             *     
             */
            public OrderItem.Price.FareGroup.FareBasisCode getFareBasisCode() {
                return fareBasisCode;
            }

            /**
             * Sets the value of the fareBasisCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItem.Price.FareGroup.FareBasisCode }
             *     
             */
            public void setFareBasisCode(OrderItem.Price.FareGroup.FareBasisCode value) {
                this.fareBasisCode = value;
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
             * Gets the value of the listKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getListKey() {
                return listKey;
            }

            /**
             * Sets the value of the listKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setListKey(String value) {
                this.listKey = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareCode"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareDetail" minOccurs="0"/&gt;
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
                "fareCode",
                "fareDetail"
            })
            public static class Fare {

                @XmlElement(name = "FareCode", required = true)
                protected FareCodeType fareCode;
                @XmlElement(name = "FareDetail")
                protected FareDetailType fareDetail;

                /**
                 * Gets the value of the fareCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareCodeType }
                 *     
                 */
                public FareCodeType getFareCode() {
                    return fareCode;
                }

                /**
                 * Sets the value of the fareCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareCodeType }
                 *     
                 */
                public void setFareCode(FareCodeType value) {
                    this.fareCode = value;
                }

                /**
                 * Gets the value of the fareDetail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FareDetailType }
                 *     
                 */
                public FareDetailType getFareDetail() {
                    return fareDetail;
                }

                /**
                 * Sets the value of the fareDetail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FareDetailType }
                 *     
                 */
                public void setFareDetail(FareDetailType value) {
                    this.fareDetail = value;
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
             *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType"/&gt;
             *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisAppSimpleType" minOccurs="0"/&gt;
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
                "code",
                "application"
            })
            public static class FareBasisCode {

                @XmlElement(name = "Code", required = true)
                protected String code;
                @XmlElement(name = "Application")
                protected String application;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the application property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getApplication() {
                    return application;
                }

                /**
                 * Sets the value of the application property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setApplication(String value) {
                    this.application = value;
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
         *       &lt;sequence&gt;
         *         &lt;element name="Amount"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmount"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Source"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Commission"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PriceGuaranteeTimeLimit"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amount",
            "source",
            "commission",
            "priceGuaranteeTimeLimit"
        })
        public static class PriceQuote {

            @XmlElement(name = "Amount", required = true)
            protected OrderItem.Price.PriceQuote.Amount amount;
            @XmlElement(name = "Source", required = true)
            protected OrderItem.Price.PriceQuote.Source source;
            @XmlElement(name = "Commission", required = true)
            protected CommissionType commission;
            @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
            protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
            @XmlAttribute(name = "CreatedDate")
            @XmlSchemaType(name = "anySimpleType")
            protected String createdDate;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItem.Price.PriceQuote.Amount }
             *     
             */
            public OrderItem.Price.PriceQuote.Amount getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItem.Price.PriceQuote.Amount }
             *     
             */
            public void setAmount(OrderItem.Price.PriceQuote.Amount value) {
                this.amount = value;
            }

            /**
             * Gets the value of the source property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItem.Price.PriceQuote.Source }
             *     
             */
            public OrderItem.Price.PriceQuote.Source getSource() {
                return source;
            }

            /**
             * Sets the value of the source property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItem.Price.PriceQuote.Source }
             *     
             */
            public void setSource(OrderItem.Price.PriceQuote.Source value) {
                this.source = value;
            }

            /**
             * Gets the value of the commission property.
             * 
             * @return
             *     possible object is
             *     {@link CommissionType }
             *     
             */
            public CommissionType getCommission() {
                return commission;
            }

            /**
             * Sets the value of the commission property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommissionType }
             *     
             */
            public void setCommission(CommissionType value) {
                this.commission = value;
            }

            /**
             * Gets the value of the priceGuaranteeTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link PriceGuaranteeTimeLimit }
             *     
             */
            public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
                return priceGuaranteeTimeLimit;
            }

            /**
             * Sets the value of the priceGuaranteeTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceGuaranteeTimeLimit }
             *     
             */
            public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
                this.priceGuaranteeTimeLimit = value;
            }

            /**
             * Gets the value of the createdDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreatedDate() {
                return createdDate;
            }

            /**
             * Sets the value of the createdDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreatedDate(String value) {
                this.createdDate = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}CurrencyAmount"/&gt;
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
                "currencyAmount"
            })
            public static class Amount {

                @XmlElement(name = "CurrencyAmount", required = true)
                protected CurrencyAmountOptType currencyAmount;

                /**
                 * Gets the value of the currencyAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public CurrencyAmountOptType getCurrencyAmount() {
                    return currencyAmount;
                }

                /**
                 * Sets the value of the currencyAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public void setCurrencyAmount(CurrencyAmountOptType value) {
                    this.currencyAmount = value;
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
             *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Source {

                @XmlAttribute(name = "Owner")
                @XmlSchemaType(name = "anySimpleType")
                protected String owner;
                @XmlAttribute(name = "Reference")
                @XmlSchemaType(name = "anySimpleType")
                protected String reference;

                /**
                 * Gets the value of the owner property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOwner() {
                    return owner;
                }

                /**
                 * Sets the value of the owner property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOwner(String value) {
                    this.owner = value;
                }

                /**
                 * Gets the value of the reference property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReference() {
                    return reference;
                }

                /**
                 * Sets the value of the reference property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReference(String value) {
                    this.reference = value;
                }

            }

        }

    }

}
