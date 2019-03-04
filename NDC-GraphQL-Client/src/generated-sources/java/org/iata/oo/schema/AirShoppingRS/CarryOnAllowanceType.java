//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 02:09:42 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * CARRY-ON ALLOWANCE definition.
 * 
 * <p>Java class for CarryOnAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarryOnAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarryOnBag" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WeightAllowance" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DimensionAllowance" minOccurs="0"/>
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AllowanceDescription" minOccurs="0"/>
 *                   &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDeterminingCarrierType" minOccurs="0"/>
 *                   &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
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
@XmlType(name = "CarryOnAllowanceType", propOrder = {
    "carryOnBag"
})
@XmlSeeAlso({
    CarryOnBags.class
})
public class CarryOnAllowanceType {

    @XmlElement(name = "CarryOnBag", required = true)
    protected List<CarryOnAllowanceType.CarryOnBag> carryOnBag;

    /**
     * Gets the value of the carryOnBag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnBag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnBag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarryOnAllowanceType.CarryOnBag }
     * 
     * 
     */
    public List<CarryOnAllowanceType.CarryOnBag> getCarryOnBag() {
        if (carryOnBag == null) {
            carryOnBag = new ArrayList<CarryOnAllowanceType.CarryOnBag>();
        }
        return this.carryOnBag;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WeightAllowance" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DimensionAllowance" minOccurs="0"/>
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AllowanceDescription" minOccurs="0"/>
     *         &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.1}BaggageDeterminingCarrierType" minOccurs="0"/>
     *         &lt;element name="BDC_AnalysisResult" type="{http://www.iata.org/IATA/EDIST/2017.1}IATA_CodeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "weightAllowance",
        "pieceAllowance",
        "dimensionAllowance",
        "allowanceDescription",
        "baggageDeterminingCarrier",
        "bdcAnalysisResult"
    })
    public static class CarryOnBag {

        @XmlElement(name = "WeightAllowance")
        protected WeightAllowance weightAllowance;
        @XmlElement(name = "PieceAllowance")
        protected List<PieceAllowance> pieceAllowance;
        @XmlElement(name = "DimensionAllowance")
        protected BagAllowanceDimensionType dimensionAllowance;
        @XmlElement(name = "AllowanceDescription")
        protected BagAllowanceDescType allowanceDescription;
        @XmlElement(name = "BaggageDeterminingCarrier")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlElement(name = "BDC_AnalysisResult")
        protected String bdcAnalysisResult;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the weightAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link WeightAllowance }
         *     
         */
        public WeightAllowance getWeightAllowance() {
            return weightAllowance;
        }

        /**
         * Sets the value of the weightAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link WeightAllowance }
         *     
         */
        public void setWeightAllowance(WeightAllowance value) {
            this.weightAllowance = value;
        }

        /**
         * Defines the maximum number of each allowable baggage type.Gets the value of the pieceAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pieceAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PieceAllowance }
         * 
         * 
         */
        public List<PieceAllowance> getPieceAllowance() {
            if (pieceAllowance == null) {
                pieceAllowance = new ArrayList<PieceAllowance>();
            }
            return this.pieceAllowance;
        }

        /**
         * Gets the value of the dimensionAllowance property.
         * 
         * @return
         *     possible object is
         *     {@link BagAllowanceDimensionType }
         *     
         */
        public BagAllowanceDimensionType getDimensionAllowance() {
            return dimensionAllowance;
        }

        /**
         * Sets the value of the dimensionAllowance property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagAllowanceDimensionType }
         *     
         */
        public void setDimensionAllowance(BagAllowanceDimensionType value) {
            this.dimensionAllowance = value;
        }

        /**
         * Gets the value of the allowanceDescription property.
         * 
         * @return
         *     possible object is
         *     {@link BagAllowanceDescType }
         *     
         */
        public BagAllowanceDescType getAllowanceDescription() {
            return allowanceDescription;
        }

        /**
         * Sets the value of the allowanceDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link BagAllowanceDescType }
         *     
         */
        public void setAllowanceDescription(BagAllowanceDescType value) {
            this.allowanceDescription = value;
        }

        /**
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
        }

        /**
         * Gets the value of the bdcAnalysisResult property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBDCAnalysisResult() {
            return bdcAnalysisResult;
        }

        /**
         * Sets the value of the bdcAnalysisResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBDCAnalysisResult(String value) {
            this.bdcAnalysisResult = value;
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

}
