//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 04:34:49 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer-Associated Optional Services definition.
 * 
 * <p>Java class for ServiceInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInfoAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}BundleReference"/>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}ServiceReferences"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoAssocType", propOrder = {
    "bundleReference",
    "serviceReferences"
})
public class ServiceInfoAssocType {

    @XmlElement(name = "BundleReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object bundleReference;
    @XmlList
    @XmlElement(name = "ServiceReferences")
    @XmlIDREF
    protected List<Object> serviceReferences;

    /**
     * Gets the value of the bundleReference property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBundleReference() {
        return bundleReference;
    }

    /**
     * Sets the value of the bundleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBundleReference(Object value) {
        this.bundleReference = value;
    }

    /**
     * Gets the value of the serviceReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getServiceReferences() {
        if (serviceReferences == null) {
            serviceReferences = new ArrayList<Object>();
        }
        return this.serviceReferences;
    }

}
