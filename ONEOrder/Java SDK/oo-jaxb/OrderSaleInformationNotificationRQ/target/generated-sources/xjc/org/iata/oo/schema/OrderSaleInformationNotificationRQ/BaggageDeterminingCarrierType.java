
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaggageDeterminingCarrierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDeterminingCarrierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlineID"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="BagRule" type="{http://www.iata.org/IATA/EDIST/2017.1}BagDiscloseRuleSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BDC_Reason"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Regulatory"/&gt;
 *             &lt;enumeration value="Deferral"/&gt;
 *             &lt;enumeration value="Bilateral"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDeterminingCarrierType", propOrder = {
    "airlineID",
    "name",
    "bagRule"
})
public class BaggageDeterminingCarrierType {

    @XmlElement(name = "AirlineID", required = true)
    protected AirlineIDType airlineID;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "BagRule")
    protected String bagRule;
    @XmlAttribute(name = "BDC_Reason")
    protected String bdcReason;

    /**
     * Gets the value of the airlineID property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineIDType }
     *     
     */
    public AirlineIDType getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineIDType }
     *     
     */
    public void setAirlineID(AirlineIDType value) {
        this.airlineID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bagRule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagRule() {
        return bagRule;
    }

    /**
     * Sets the value of the bagRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagRule(String value) {
        this.bagRule = value;
    }

    /**
     * Gets the value of the bdcReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCReason() {
        return bdcReason;
    }

    /**
     * Sets the value of the bdcReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDCReason(String value) {
        this.bdcReason = value;
    }

}
