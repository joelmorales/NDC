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
 * AIRCRAFT CORE representation.
 * 
 * <p>Java class for AircraftCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AircraftCode"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *       &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftCoreType", propOrder = {
    "aircraftCode"
})
@XmlSeeAlso({
    AircraftSummaryType.class
})
public class AircraftCoreType {

    @XmlElement(name = "AircraftCode", required = true)
    protected AircraftCode aircraftCode;
    @XmlAttribute(name = "ChangeOfGaugeInd")
    protected Boolean changeOfGaugeInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Equipment Code. Example: 737
     * 
     * Encoding Scheme: IATA/ A4A Equipment Code
     * 
     * @return
     *     possible object is
     *     {@link AircraftCode }
     *     
     */
    public AircraftCode getAircraftCode() {
        return aircraftCode;
    }

    /**
     * Sets the value of the aircraftCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AircraftCode }
     *     
     */
    public void setAircraftCode(AircraftCode value) {
        this.aircraftCode = value;
    }

    /**
     * Gets the value of the changeOfGaugeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeOfGaugeInd() {
        return changeOfGaugeInd;
    }

    /**
     * Sets the value of the changeOfGaugeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeOfGaugeInd(Boolean value) {
        this.changeOfGaugeInd = value;
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
