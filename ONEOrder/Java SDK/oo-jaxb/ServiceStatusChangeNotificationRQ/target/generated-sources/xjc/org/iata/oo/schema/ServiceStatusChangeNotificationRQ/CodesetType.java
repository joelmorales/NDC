
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: CODESET
 * 
 *  ============
 * Representation(s)
 *  ============
 * • IATA PADIS Encoding
 * • Third-Pary Standard Encoding
 * • Implementer-Proprietary Encoding
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Code value, code definition and code table name may be specified
 * • URI to codeset information source may be specified
 * • Supports Language Localization (Alternate Language Values)
 * • Codeset Source Details (owner, location, etc.) may be specified
 * 
 *  ============
 * Metadata
 *  ============
 * • Yes
 * 
 * <p>Java class for CodesetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodesetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/EDIST/2017.1}CodesetValueSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodesetType", propOrder = {
    "code"
})
@XmlSeeAlso({
    FareCodeType.class,
    RFICType.class,
    InstantPurchaseType.class,
    org.iata.oo.schema.ServiceStatusChangeNotificationRQ.PaymentStatusType.IncompletePayment.StatusCode.class,
    org.iata.oo.schema.ServiceStatusChangeNotificationRQ.SeatLocationType.Characteristic.class
})
public class CodesetType {

    @XmlElement(name = "Code")
    protected String code;

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

}
