
package org.iata.oo.schema.ServiceDeliveryRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Language Code representation.
 * 
 * <p>Java class for LanguageUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageUsageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LanguageCode" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueTextType" minOccurs="0"/&gt;
 *         &lt;element name="LanguageUsage" type="{http://www.iata.org/IATA/EDIST/2017.1}SimpleTextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LanguageUsageType", propOrder = {
    "languageCode",
    "languageUsage"
})
public class LanguageUsageType {

    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "LanguageUsage")
    protected String languageUsage;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the languageUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageUsage() {
        return languageUsage;
    }

    /**
     * Sets the value of the languageUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageUsage(String value) {
        this.languageUsage = value;
    }

}
