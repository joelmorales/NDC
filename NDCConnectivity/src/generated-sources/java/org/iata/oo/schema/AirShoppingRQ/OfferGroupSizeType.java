//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.22 at 03:57:37 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * MINIMUM/ MAXIMUM GROUP SIZE definition.
 * 
 * <p>Java class for OfferGroupSizeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferGroupSizeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="2">
 *         &lt;element name="Minimum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="Maximum" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferGroupSizeType", propOrder = {
    "minimumOrMaximum"
})
public class OfferGroupSizeType {

    @XmlElementRefs({
        @XmlElementRef(name = "Minimum", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Maximum", namespace = "http://www.iata.org/IATA/EDIST/2017.1", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<BigInteger>> minimumOrMaximum;

    /**
     * Gets the value of the minimumOrMaximum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumOrMaximum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumOrMaximum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * 
     */
    public List<JAXBElement<BigInteger>> getMinimumOrMaximum() {
        if (minimumOrMaximum == null) {
            minimumOrMaximum = new ArrayList<JAXBElement<BigInteger>>();
        }
        return this.minimumOrMaximum;
    }

}
