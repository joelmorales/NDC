
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type for Effective/ Expiration Short Date Period Representation.
 * 
 * <p>Java class for DatePeriodRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatePeriodRepType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Effective" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatePeriodRepType", propOrder = {
    "effective",
    "expiration"
})
public class DatePeriodRepType {

    @XmlElement(name = "Effective")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effective;
    @XmlElement(name = "Expiration")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiration;

    /**
     * Gets the value of the effective property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffective() {
        return effective;
    }

    /**
     * Sets the value of the effective property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffective(XMLGregorianCalendar value) {
        this.effective = value;
    }

    /**
     * Gets the value of the expiration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiration() {
        return expiration;
    }

    /**
     * Sets the value of the expiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiration(XMLGregorianCalendar value) {
        this.expiration = value;
    }

}
