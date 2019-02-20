
package org.iata.oo.schema.ServiceDeliveryRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Aircraft seat row with seat map ghost row metadata definition.
 * 
 * <p>Java class for SeatMapRowNbrType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapRowNbrType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;AirRowNbrSimpleType"&gt;
 *       &lt;attribute name="RowSuffix"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;pattern value="[A-Z]{1}"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="RowPos"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="BACK"/&gt;
 *             &lt;enumeration value="FRONT"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapRowNbrType", propOrder = {
    "value"
})
public class SeatMapRowNbrType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "RowSuffix")
    protected String rowSuffix;
    @XmlAttribute(name = "RowPos")
    protected String rowPos;

    /**
     * Aircraft row number.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the rowSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowSuffix() {
        return rowSuffix;
    }

    /**
     * Sets the value of the rowSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowSuffix(String value) {
        this.rowSuffix = value;
    }

    /**
     * Gets the value of the rowPos property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowPos() {
        return rowPos;
    }

    /**
     * Sets the value of the rowPos property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowPos(String value) {
        this.rowPos = value;
    }

}
