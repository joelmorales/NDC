//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 04:34:49 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * FARE COMPONENT definition.
 * 
 * <p>Java class for FareComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/EDIST/2017.2}FarePriceDetailType" minOccurs="0"/>
 *         &lt;element name="FareBasis" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCode" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareRulesRemarks" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCityPair" minOccurs="0"/>
 *                   &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="CabinType">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CabinTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="CabinTypeName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}TicketDesig" minOccurs="0"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareRules" minOccurs="0"/>
 *         &lt;element name="PriceClassRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/>
 *         &lt;element name="SegmentRefs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREFS">
 *                 &lt;attribute name="ON_Point" type="{http://www.iata.org/IATA/EDIST/2017.2}AirportCitySimpleType" />
 *                 &lt;attribute name="OFF_Point" type="{http://www.iata.org/IATA/EDIST/2017.2}AirportCitySimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
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
@XmlType(name = "FareComponentType", propOrder = {
    "parameters",
    "price",
    "fareBasis",
    "ticketDesig",
    "fareRules",
    "priceClassRef",
    "segmentRefs"
})
public class FareComponentType {

    @XmlElement(name = "Parameters")
    protected FareComponentType.Parameters parameters;
    @XmlElement(name = "Price")
    protected FarePriceDetailType price;
    @XmlElement(name = "FareBasis")
    protected FareComponentType.FareBasis fareBasis;
    @XmlElement(name = "TicketDesig")
    protected TicketDesignatorType ticketDesig;
    @XmlElement(name = "FareRules")
    protected FareRulesType fareRules;
    @XmlElement(name = "PriceClassRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object priceClassRef;
    @XmlElement(name = "SegmentRefs")
    protected FareComponentType.SegmentRefs segmentRefs;

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
     * Gets the value of the priceClassRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPriceClassRef() {
        return priceClassRef;
    }

    /**
     * Sets the value of the priceClassRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPriceClassRef(Object value) {
        this.priceClassRef = value;
    }

    /**
     * Gets the value of the segmentRefs property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentType.SegmentRefs }
     *     
     */
    public FareComponentType.SegmentRefs getSegmentRefs() {
        return segmentRefs;
    }

    /**
     * Sets the value of the segmentRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentType.SegmentRefs }
     *     
     */
    public void setSegmentRefs(FareComponentType.SegmentRefs value) {
        this.segmentRefs = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCode" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareRulesRemarks" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}FareBasisCityPair" minOccurs="0"/>
     *         &lt;element name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="CabinType">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CabinTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="CabinTypeName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "fareBasisCode",
        "fareRulesRemarks",
        "fareBasisCityPair",
        "rbd",
        "cabinType"
    })
    public static class FareBasis {

        @XmlElement(name = "FareBasisCode")
        protected FareBasisCodeType fareBasisCode;
        @XmlElement(name = "FareRulesRemarks")
        protected FareRulesRemarks fareRulesRemarks;
        @XmlElement(name = "FareBasisCityPair")
        protected String fareBasisCityPair;
        @XmlElement(name = "RBD")
        protected String rbd;
        @XmlElement(name = "CabinType", required = true)
        protected FareComponentType.FareBasis.CabinType cabinType;

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
         * Gets the value of the fareRulesRemarks property.
         * 
         * @return
         *     possible object is
         *     {@link FareRulesRemarks }
         *     
         */
        public FareRulesRemarks getFareRulesRemarks() {
            return fareRulesRemarks;
        }

        /**
         * Sets the value of the fareRulesRemarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareRulesRemarks }
         *     
         */
        public void setFareRulesRemarks(FareRulesRemarks value) {
            this.fareRulesRemarks = value;
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

        /**
         * Gets the value of the cabinType property.
         * 
         * @return
         *     possible object is
         *     {@link FareComponentType.FareBasis.CabinType }
         *     
         */
        public FareComponentType.FareBasis.CabinType getCabinType() {
            return cabinType;
        }

        /**
         * Sets the value of the cabinType property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareComponentType.FareBasis.CabinType }
         *     
         */
        public void setCabinType(FareComponentType.FareBasis.CabinType value) {
            this.cabinType = value;
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
         *         &lt;element name="CabinTypeCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="CabinTypeName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
            "cabinTypeCode",
            "cabinTypeName"
        })
        public static class CabinType {

            @XmlElement(name = "CabinTypeCode", required = true)
            protected Object cabinTypeCode;
            @XmlElement(name = "CabinTypeName", required = true)
            protected Object cabinTypeName;

            /**
             * Gets the value of the cabinTypeCode property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCabinTypeCode() {
                return cabinTypeCode;
            }

            /**
             * Sets the value of the cabinTypeCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCabinTypeCode(Object value) {
                this.cabinTypeCode = value;
            }

            /**
             * Gets the value of the cabinTypeName property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCabinTypeName() {
                return cabinTypeName;
            }

            /**
             * Sets the value of the cabinTypeName property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCabinTypeName(Object value) {
                this.cabinTypeName = value;
            }

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
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>IDREFS">
     *       &lt;attribute name="ON_Point" type="{http://www.iata.org/IATA/EDIST/2017.2}AirportCitySimpleType" />
     *       &lt;attribute name="OFF_Point" type="{http://www.iata.org/IATA/EDIST/2017.2}AirportCitySimpleType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SegmentRefs {

        @XmlValue
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> value;
        @XmlAttribute(name = "ON_Point")
        protected String onPoint;
        @XmlAttribute(name = "OFF_Point")
        protected String offPoint;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getValue() {
            if (value == null) {
                value = new ArrayList<Object>();
            }
            return this.value;
        }

        /**
         * Gets the value of the onPoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getONPoint() {
            return onPoint;
        }

        /**
         * Sets the value of the onPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setONPoint(String value) {
            this.onPoint = value;
        }

        /**
         * Gets the value of the offPoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOFFPoint() {
            return offPoint;
        }

        /**
         * Sets the value of the offPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOFFPoint(String value) {
            this.offPoint = value;
        }

    }

}
