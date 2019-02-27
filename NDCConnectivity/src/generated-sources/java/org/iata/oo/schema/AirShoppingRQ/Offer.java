//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.27 at 11:03:24 AM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}DisclosureMetadatas"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferMetadatas"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferInstructionMetadatas"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferPenaltyMetadatas"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}OfferTermsMetadatas"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas"
})
@XmlRootElement(name = "Offer")
public class Offer {

    @XmlElements({
        @XmlElement(name = "DisclosureMetadatas", type = DisclosureMetadatas.class),
        @XmlElement(name = "OfferMetadatas", type = OfferMetadatas.class),
        @XmlElement(name = "OfferInstructionMetadatas", type = OfferInstructionMetadatas.class),
        @XmlElement(name = "OfferPenaltyMetadatas", type = OfferPenaltyMetadatas.class),
        @XmlElement(name = "OfferTermsMetadatas", type = OfferTermsMetadatas.class)
    })
    protected List<Object> disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas;

    /**
     * Gets the value of the disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclosureMetadatas }
     * {@link OfferMetadatas }
     * {@link OfferInstructionMetadatas }
     * {@link OfferPenaltyMetadatas }
     * {@link OfferTermsMetadatas }
     * 
     * 
     */
    public List<Object> getDisclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas() {
        if (disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas == null) {
            disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas = new ArrayList<Object>();
        }
        return this.disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas;
    }

}
