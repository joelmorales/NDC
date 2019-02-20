
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Seat size and marketing information definition.
 * 
 * <p>Java class for SeatDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.1}Descriptions" minOccurs="0"/&gt;
 *           &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.1}SizeUnitSimpleType" minOccurs="0"/&gt;
 *           &lt;choice&gt;
 *             &lt;sequence&gt;
 *               &lt;element name="SeatPitchLow" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *               &lt;element name="SeatWidthLow" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *             &lt;element name="Keywords" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="KeyWord" type="{http://www.iata.org/IATA/EDIST/2017.1}KeyWordType" maxOccurs="unbounded"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Marketing" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SeatMapMessageType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDataType", propOrder = {
    "descriptions",
    "uom",
    "seatPitchLow",
    "seatWidthLow",
    "keywords",
    "marketing"
})
@XmlSeeAlso({
    org.iata.oo.schema.ServiceDeliveryNotificationRQ.SeatLocationType.Row.SeatData.class
})
public class SeatDataType {

    @XmlElementWrapper(name = "Descriptions")
    @XmlElement(name = "Description", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<Description> descriptions;
    @XmlElement(name = "UOM")
    @XmlSchemaType(name = "string")
    protected SizeUnitSimpleType uom;
    @XmlElement(name = "SeatPitchLow")
    protected BigDecimal seatPitchLow;
    @XmlElement(name = "SeatWidthLow")
    protected BigDecimal seatWidthLow;
    @XmlElementWrapper(name = "Keywords")
    @XmlElement(name = "KeyWord", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<KeyWordType> keywords;
    @XmlElement(name = "Marketing")
    protected SeatDataType.Marketing marketing;

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public SizeUnitSimpleType getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public void setUOM(SizeUnitSimpleType value) {
        this.uom = value;
    }

    /**
     * Gets the value of the seatPitchLow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatPitchLow() {
        return seatPitchLow;
    }

    /**
     * Sets the value of the seatPitchLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatPitchLow(BigDecimal value) {
        this.seatPitchLow = value;
    }

    /**
     * Gets the value of the seatWidthLow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatWidthLow() {
        return seatWidthLow;
    }

    /**
     * Sets the value of the seatWidthLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatWidthLow(BigDecimal value) {
        this.seatWidthLow = value;
    }

    /**
     * Gets the value of the marketing property.
     * 
     * @return
     *     possible object is
     *     {@link SeatDataType.Marketing }
     *     
     */
    public SeatDataType.Marketing getMarketing() {
        return marketing;
    }

    /**
     * Sets the value of the marketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDataType.Marketing }
     *     
     */
    public void setMarketing(SeatDataType.Marketing value) {
        this.marketing = value;
    }

    public List<Description> getDescriptions() {
        if (descriptions == null) {
            descriptions = new ArrayList<Description>();
        }
        return descriptions;
    }

    public void setDescriptions(List<Description> descriptions) {
        this.descriptions = descriptions;
    }

    public List<KeyWordType> getKeywords() {
        if (keywords == null) {
            keywords = new ArrayList<KeyWordType>();
        }
        return keywords;
    }

    public void setKeywords(List<KeyWordType> keywords) {
        this.keywords = keywords;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}SeatMapMessageType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Marketing
        extends SeatMapMessageType
    {


    }

}
