
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="FlightItemInternalValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *         &lt;element name="FlightItemSettlementValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OriginDestination" type="{http://www.iata.org/IATA/EDIST/2017.1}FlightType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="FlightItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *       &lt;attribute name="FlightItemStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightItemType", propOrder = {
    "flightItemInternalValue",
    "flightItemSettlementValue",
    "originDestination"
})
public class FlightItemType {

    @XmlElement(name = "FlightItemInternalValue", required = true)
    protected Object flightItemInternalValue;
    @XmlElement(name = "FlightItemSettlementValue")
    protected Object flightItemSettlementValue;
    @XmlElement(name = "OriginDestination")
    protected List<FlightType> originDestination;
    @XmlAttribute(name = "FlightItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String flightItemID;
    @XmlAttribute(name = "FlightItemStatus", required = true)
    protected String flightItemStatus;

    /**
     * Gets the value of the flightItemInternalValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFlightItemInternalValue() {
        return flightItemInternalValue;
    }

    /**
     * Sets the value of the flightItemInternalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFlightItemInternalValue(Object value) {
        this.flightItemInternalValue = value;
    }

    /**
     * Gets the value of the flightItemSettlementValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFlightItemSettlementValue() {
        return flightItemSettlementValue;
    }

    /**
     * Sets the value of the flightItemSettlementValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFlightItemSettlementValue(Object value) {
        this.flightItemSettlementValue = value;
    }

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

}
