
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * CORE PRICE definition.
 * 
 * <p>Java class for PriceCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RefundAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="TaxIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="OtherChargeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceCoreType")
@XmlSeeAlso({
    DetailCurrencyPriceType.class
})
public class PriceCoreType {

    @XmlAttribute(name = "ApproxInd")
    protected Boolean approxInd;
    @XmlAttribute(name = "RefundAllInd")
    protected Boolean refundAllInd;
    @XmlAttribute(name = "TaxIncludedInd")
    protected Boolean taxIncludedInd;
    @XmlAttribute(name = "OtherChargeInd")
    protected Boolean otherChargeInd;
    @XmlAttribute(name = "AutoExchangeInd")
    protected Boolean autoExchangeInd;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the approxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproxInd() {
        return approxInd;
    }

    /**
     * Sets the value of the approxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproxInd(Boolean value) {
        this.approxInd = value;
    }

    /**
     * Gets the value of the refundAllInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundAllInd() {
        return refundAllInd;
    }

    /**
     * Sets the value of the refundAllInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundAllInd(Boolean value) {
        this.refundAllInd = value;
    }

    /**
     * Gets the value of the taxIncludedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxIncludedInd() {
        return taxIncludedInd;
    }

    /**
     * Sets the value of the taxIncludedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxIncludedInd(Boolean value) {
        this.taxIncludedInd = value;
    }

    /**
     * Gets the value of the otherChargeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOtherChargeInd() {
        return otherChargeInd;
    }

    /**
     * Sets the value of the otherChargeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOtherChargeInd(Boolean value) {
        this.otherChargeInd = value;
    }

    /**
     * Gets the value of the autoExchangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExchangeInd() {
        return autoExchangeInd;
    }

    /**
     * Sets the value of the autoExchangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoExchangeInd(Boolean value) {
        this.autoExchangeInd = value;
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
