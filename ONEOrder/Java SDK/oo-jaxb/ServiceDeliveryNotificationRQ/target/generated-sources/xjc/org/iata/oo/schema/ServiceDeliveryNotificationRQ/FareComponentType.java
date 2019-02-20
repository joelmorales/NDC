
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * FARE COMPONENT definition.
 * 
 * <p>Java class for FareComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Parameters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SegmentReference" minOccurs="0"/&gt;
 *         &lt;element name="PriceBreakdown" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.1}FarePriceDetailType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FareBasis" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisCode" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareRulesRemarks" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisCityPair" minOccurs="0"/&gt;
 *                   &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}TicketDesig" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareRules" minOccurs="0"/&gt;
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
@XmlType(name = "FareComponentType", propOrder = {
    "parameters",
    "segmentReference",
    "priceBreakdown",
    "fareBasis",
    "ticketDesig",
    "fareRules"
})
public class FareComponentType {

    @XmlElement(name = "Parameters")
    protected FareComponentType.Parameters parameters;
    @XmlElement(name = "SegmentReference")
    protected SegmentReference segmentReference;
    @XmlElement(name = "PriceBreakdown")
    protected FareComponentType.PriceBreakdown priceBreakdown;
    @XmlElement(name = "FareBasis")
    protected FareComponentType.FareBasis fareBasis;
    @XmlElement(name = "TicketDesig")
    protected TicketDesignatorType ticketDesig;
    @XmlElement(name = "FareRules")
    protected FareRulesType fareRules;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.Parameters }
     *     
     */
    public FareComponentType.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.Parameters }
     *     
     */
    public void setParameters(FareComponentType.Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the segmentReference property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentReference }
     *     
     */
    public SegmentReference getSegmentReference() {
        return segmentReference;
    }

    /**
     * Sets the value of the segmentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentReference }
     *     
     */
    public void setSegmentReference(SegmentReference value) {
        this.segmentReference = value;
    }

    /**
     * Gets the value of the priceBreakdown property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.PriceBreakdown }
     *     
     */
    public FareComponentType.PriceBreakdown getPriceBreakdown() {
        return priceBreakdown;
    }

    /**
     * Sets the value of the priceBreakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.PriceBreakdown }
     *     
     */
    public void setPriceBreakdown(FareComponentType.PriceBreakdown value) {
        this.priceBreakdown = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.FareBasis }
     *     
     */
    public FareComponentType.FareBasis getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.FareBasis }
     *     
     */
    public void setFareBasis(FareComponentType.FareBasis value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the ticketDesig property.
     * 
     * @return
     *     possible object is
     *     {@link TicketDesignatorType }
     *     
     */
    public TicketDesignatorType getTicketDesig() {
        return ticketDesig;
    }

    /**
     * Sets the value of the ticketDesig property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketDesignatorType }
     *     
     */
    public void setTicketDesig(TicketDesignatorType value) {
        this.ticketDesig = value;
    }

    /**
     * Gets the value of the fareRules property.
     * 
     * @return
     *     possible object is
     *     {@link FareRulesType }
     *     
     */
    public FareRulesType getFareRules() {
        return fareRules;
    }

    /**
     * Sets the value of the fareRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareRulesType }
     *     
     */
    public void setFareRules(FareRulesType value) {
        this.fareRules = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisCode" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareRulesRemarks" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisCityPair" minOccurs="0"/&gt;
     *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "fareBasisCode",
        "fareRulesRemarks",
        "fareBasisCityPair",
        "rbd"
    })
    public static class FareBasis {

        @XmlElement(name = "FareBasisCode")
        protected FareBasisCodeType fareBasisCode;
        @XmlElementWrapper(name = "FareRulesRemarks")
        @XmlElement(name = "FareRulesRemark", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
        protected List<FareRulesRemark> fareRulesRemarks;
        @XmlElement(name = "FareBasisCityPair")
        protected String fareBasisCityPair;
        @XmlElement(name = "RBD")
        protected String rbd;

        /**
         * Gets the value of the fareBasisCode property.
         * 
         * @return
         *     possible object is
         *     {@link FareBasisCodeType }
         *     
         */
        public FareBasisCodeType getFareBasisCode() {
            return fareBasisCode;
        }

        /**
         * Sets the value of the fareBasisCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareBasisCodeType }
         *     
         */
        public void setFareBasisCode(FareBasisCodeType value) {
            this.fareBasisCode = value;
        }

        /**
         * Gets the value of the fareBasisCityPair property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareBasisCityPair() {
            return fareBasisCityPair;
        }

        /**
         * Sets the value of the fareBasisCityPair property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareBasisCityPair(String value) {
            this.fareBasisCityPair = value;
        }

        /**
         * Gets the value of the rbd property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRBD() {
            return rbd;
        }

        /**
         * Sets the value of the rbd property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRBD(String value) {
            this.rbd = value;
        }

        public List<FareRulesRemark> getFareRulesRemarks() {
            if (fareRulesRemarks == null) {
                fareRulesRemarks = new ArrayList<FareRulesRemark>();
            }
            return fareRulesRemarks;
        }

        public void setFareRulesRemarks(List<FareRulesRemark> fareRulesRemarks) {
            this.fareRulesRemarks = fareRulesRemarks;
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
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Parameters {

        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger quantity;

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
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
     *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.1}FarePriceDetailType"/&gt;
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
        "price"
    })
    public static class PriceBreakdown {

        @XmlElement(name = "Price", required = true)
        protected FarePriceDetailType price;

        /**
         * Gets the value of the price property.
         * 
         * @return
         *     possible object is
         *     {@link FarePriceDetailType }
         *     
         */
        public FarePriceDetailType getPrice() {
            return price;
        }

        /**
         * Sets the value of the price property.
         * 
         * @param value
         *     allowed object is
         *     {@link FarePriceDetailType }
         *     
         */
        public void setPrice(FarePriceDetailType value) {
            this.price = value;
        }

    }

}
