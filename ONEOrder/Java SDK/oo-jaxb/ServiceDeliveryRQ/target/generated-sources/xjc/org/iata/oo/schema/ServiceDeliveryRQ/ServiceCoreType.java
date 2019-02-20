
package org.iata.oo.schema.ServiceDeliveryRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OPTIONAL SERVICE CORE definition.
 * 
 * <p>Java class for ServiceCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceType" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceEncodingType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PartnerID" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SeatItem" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCoreType", propOrder = {
    "serviceType",
    "partnerID",
    "seatItem"
})
@XmlSeeAlso({
    ServiceDetailType.class
})
public class ServiceCoreType {

    @XmlElement(name = "ServiceType")
    protected ServiceEncodingType serviceType;
    @XmlElement(name = "PartnerID")
    protected PartnerCompanyIDType partnerID;
    @XmlElement(name = "SeatItem")
    protected SeatItem seatItem;
    @XmlAttribute(name = "ServiceID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String serviceID;
    @XmlAttribute(name = "Owner")
    protected String owner;

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEncodingType }
     *     
     */
    public ServiceEncodingType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEncodingType }
     *     
     */
    public void setServiceType(ServiceEncodingType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the partnerID property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerCompanyIDType }
     *     
     */
    public PartnerCompanyIDType getPartnerID() {
        return partnerID;
    }

    /**
     * Sets the value of the partnerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerCompanyIDType }
     *     
     */
    public void setPartnerID(PartnerCompanyIDType value) {
        this.partnerID = value;
    }

    /**
     * Gets the value of the seatItem property.
     * 
     * @return
     *     possible object is
     *     {@link SeatItem }
     *     
     */
    public SeatItem getSeatItem() {
        return seatItem;
    }

    /**
     * Sets the value of the seatItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatItem }
     *     
     */
    public void setSeatItem(SeatItem value) {
        this.seatItem = value;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

}
