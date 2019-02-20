
package org.iata.oo.schema.ServiceDeliveryRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * FLIGHT Order Item.
 * 
 * <p>Java class for FlightItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginDestination" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FlightItemID" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="FlightItemStatus" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightItemType", propOrder = {
    "originDestination",
    "remarks"
})
public class FlightItemType {

    @XmlElement(name = "OriginDestination")
    protected List<FlightType> originDestination;
    @XmlElementWrapper(name = "Remarks")
    @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<Remark> remarks;
    @XmlAttribute(name = "FlightItemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String flightItemID;
    @XmlAttribute(name = "FlightItemStatus")
    protected String flightItemStatus;

    /**
     * Gets the value of the originDestination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightType }
     * 
     * 
     */
    public List<FlightType> getOriginDestination() {
        if (originDestination == null) {
            originDestination = new ArrayList<FlightType>();
        }
        return this.originDestination;
    }

    /**
     * Gets the value of the flightItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightItemID() {
        return flightItemID;
    }

    /**
     * Sets the value of the flightItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightItemID(String value) {
        this.flightItemID = value;
    }

    /**
     * Gets the value of the flightItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightItemStatus() {
        return flightItemStatus;
    }

    /**
     * Sets the value of the flightItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightItemStatus(String value) {
        this.flightItemStatus = value;
    }

    public List<Remark> getRemarks() {
        if (remarks == null) {
            remarks = new ArrayList<Remark>();
        }
        return remarks;
    }

    public void setRemarks(List<Remark> remarks) {
        this.remarks = remarks;
    }

}
