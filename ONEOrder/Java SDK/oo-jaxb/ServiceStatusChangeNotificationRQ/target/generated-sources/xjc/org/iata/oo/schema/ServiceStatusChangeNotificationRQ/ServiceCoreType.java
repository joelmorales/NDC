
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
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
 *         &lt;element name="ServiceStatus" type="{http://www.iata.org/IATA/EDIST/2017.1}ServiceStatusType"/&gt;
 *         &lt;element name="Provider" type="{http://www.iata.org/IATA/EDIST/2017.1}PartnerCoreRepType" minOccurs="0"/&gt;
 *         &lt;element name="PassengerRef" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="Owner" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}AirlineDesigSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCoreType", propOrder = {
    "serviceStatus",
    "provider",
    "passengerRef"
})
@XmlSeeAlso({
    ServiceDetailType.class
})
public class ServiceCoreType {

    @XmlElement(name = "ServiceStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ServiceStatusType serviceStatus;
    @XmlElement(name = "Provider")
    protected PartnerCoreRepType provider;
    @XmlElement(name = "PassengerRef")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object passengerRef;
    @XmlAttribute(name = "ServiceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String serviceID;
    @XmlAttribute(name = "Owner", required = true)
    protected String owner;

    /**
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatusType }
     *     
     */
    public ServiceStatusType getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatusType }
     *     
     */
    public void setServiceStatus(ServiceStatusType value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerCoreRepType }
     *     
     */
    public PartnerCoreRepType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerCoreRepType }
     *     
     */
    public void setProvider(PartnerCoreRepType value) {
        this.provider = value;
    }

    /**
     * Gets the value of the passengerRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getPassengerRef() {
        return passengerRef;
    }

    /**
     * Sets the value of the passengerRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setPassengerRef(Object value) {
        this.passengerRef = value;
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
