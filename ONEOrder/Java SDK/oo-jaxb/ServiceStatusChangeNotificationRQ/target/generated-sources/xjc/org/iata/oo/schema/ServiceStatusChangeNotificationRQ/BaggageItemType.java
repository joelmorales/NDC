
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A BAGGAGE OFFER with additional Significant Carrier, Baggage Characteristics (e.g. dimensions/ weight) and Disclosures.
 * 
 * <p>Java class for BaggageItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BagDisclosureRule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BaggageAllowance"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DimensionAllowance" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WeightAllowance" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageItemType", propOrder = {
    "bagDisclosureRule",
    "baggageAllowance"
})
public class BaggageItemType {

    @XmlElement(name = "BagDisclosureRule", required = true)
    protected String bagDisclosureRule;
    @XmlElement(name = "BaggageAllowance", required = true)
    protected BaggageItemType.BaggageAllowance baggageAllowance;

    /**
     * Gets the value of the bagDisclosureRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagDisclosureRule() {
        return bagDisclosureRule;
    }

    /**
     * Sets the value of the bagDisclosureRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagDisclosureRule(String value) {
        this.bagDisclosureRule = value;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageItemType.BaggageAllowance }
     *     
     */
    public BaggageItemType.BaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageItemType.BaggageAllowance }
     *     
     */
    public void setBaggageAllowance(BaggageItemType.BaggageAllowance value) {
        this.baggageAllowance = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DimensionAllowance" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}WeightAllowance" minOccurs="0"/&gt;
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
        "dimensionAllowance",
        "pieceAllowance",
        "weightAllowance"
    })
    public static class BaggageAllowance {

        @XmlElement(name = "DimensionAllowance")
        protected BagAllowanceDimensionType dimensionAllowance;
        @XmlElement(name = "PieceAllowance")
        protected List<PieceAllowance> pieceAllowance;
        @XmlElement(name = "WeightAllowance")
        protected WeightAllowance weightAllowance;

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
         * Gets the value of the pieceAllowance property.
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

    }

}
