
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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Baggage Allowance by Piece.
 * 
 * <p>Java class for BagAllowancePieceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagAllowancePieceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicableParty" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAppSimpleType"/&gt;
 *         &lt;element name="TotalQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BagType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}Descriptions" minOccurs="0"/&gt;
 *         &lt;element name="PieceMeasurements" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PieceWeightAllowance" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAllowanceWeightType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="PieceDimensionAllowance" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAllowanceDimensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="PieceAllowanceCombination"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="OR"/&gt;
 *             &lt;enumeration value="AND"/&gt;
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
@XmlType(name = "BagAllowancePieceType", propOrder = {
    "applicableParty",
    "totalQuantity",
    "bagType",
    "descriptions",
    "pieceMeasurements"
})
@XmlSeeAlso({
    PieceAllowance.class
})
public class BagAllowancePieceType {

    @XmlElement(name = "ApplicableParty", required = true)
    protected String applicableParty;
    @XmlElement(name = "TotalQuantity", required = true)
    protected BigInteger totalQuantity;
    @XmlElement(name = "BagType")
    protected String bagType;
    @XmlElementWrapper(name = "Descriptions")
    @XmlElement(name = "Description", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<Description> descriptions;
    @XmlElement(name = "PieceMeasurements", required = true)
    protected List<BagAllowancePieceType.PieceMeasurements> pieceMeasurements;
    @XmlAttribute(name = "PieceAllowanceCombination")
    protected String pieceAllowanceCombination;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the applicableParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableParty() {
        return applicableParty;
    }

    /**
     * Sets the value of the applicableParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableParty(String value) {
        this.applicableParty = value;
    }

    /**
     * Gets the value of the totalQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalQuantity() {
        return totalQuantity;
    }

    /**
     * Sets the value of the totalQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalQuantity(BigInteger value) {
        this.totalQuantity = value;
    }

    /**
     * Gets the value of the bagType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagType() {
        return bagType;
    }

    /**
     * Sets the value of the bagType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagType(String value) {
        this.bagType = value;
    }

    /**
     * Gets the value of the pieceMeasurements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceMeasurements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceMeasurements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagAllowancePieceType.PieceMeasurements }
     * 
     * 
     */
    public List<BagAllowancePieceType.PieceMeasurements> getPieceMeasurements() {
        if (pieceMeasurements == null) {
            pieceMeasurements = new ArrayList<BagAllowancePieceType.PieceMeasurements>();
        }
        return this.pieceMeasurements;
    }

    /**
     * Gets the value of the pieceAllowanceCombination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPieceAllowanceCombination() {
        return pieceAllowanceCombination;
    }

    /**
     * Sets the value of the pieceAllowanceCombination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPieceAllowanceCombination(String value) {
        this.pieceAllowanceCombination = value;
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

    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
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
     *         &lt;element name="PieceWeightAllowance" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAllowanceWeightType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="PieceDimensionAllowance" type="{http://www.iata.org/IATA/EDIST/2017.1}BagAllowanceDimensionType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Quantity" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pieceWeightAllowance",
        "pieceDimensionAllowance"
    })
    public static class PieceMeasurements {

        @XmlElement(name = "PieceWeightAllowance")
        protected List<BagAllowanceWeightType> pieceWeightAllowance;
        @XmlElement(name = "PieceDimensionAllowance")
        protected List<BagAllowanceDimensionType> pieceDimensionAllowance;
        @XmlAttribute(name = "Quantity", required = true)
        protected int quantity;

        /**
         * Gets the value of the pieceWeightAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pieceWeightAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceWeightAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BagAllowanceWeightType }
         * 
         * 
         */
        public List<BagAllowanceWeightType> getPieceWeightAllowance() {
            if (pieceWeightAllowance == null) {
                pieceWeightAllowance = new ArrayList<BagAllowanceWeightType>();
            }
            return this.pieceWeightAllowance;
        }

        /**
         * Gets the value of the pieceDimensionAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pieceDimensionAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPieceDimensionAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BagAllowanceDimensionType }
         * 
         * 
         */
        public List<BagAllowanceDimensionType> getPieceDimensionAllowance() {
            if (pieceDimensionAllowance == null) {
                pieceDimensionAllowance = new ArrayList<BagAllowanceDimensionType>();
            }
            return this.pieceDimensionAllowance;
        }

        /**
         * Gets the value of the quantity property.
         * 
         */
        public int getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         */
        public void setQuantity(int value) {
            this.quantity = value;
        }

    }

}
