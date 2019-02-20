
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: FARE - FARE BASIS CODE
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Fare Basis Application (usage context) maybe specified (e.g. Requested, Ticketed, Other).
 * 
 *  ============
 * Metadata
 *  ============
 * • FareMetadata
 * 
 * <p>Java class for FareBasisCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareBasisCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}KeyWithMetaObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType"/&gt;
 *         &lt;element name="Application" type="{http://www.iata.org/IATA/EDIST/2017.1}FareBasisAppSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareBasisCodeType", propOrder = {
    "code",
    "application"
})
public class FareBasisCodeType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Application")
    protected String application;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplication(String value) {
        this.application = value;
    }

}
