
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * AMOUNT with OPTIONAL CURRENCY ENCODING representation.
 * 
 * <p>Java class for CurrencyAmountOptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyAmountOptType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}AmountCurrencyOptGroup"/&gt;
 *       &lt;attribute name="Taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyAmountOptType", propOrder = {
    "value"
})
@XmlSeeAlso({
    SimpleCurrencyPriceType.class,
    org.iata.oo.schema.ServiceStatusChangeNotificationRQ.TaxExemptionType.Total.class,
    org.iata.oo.schema.ServiceStatusChangeNotificationRQ.FeeSurchargeType.Total.class,
    org.iata.oo.schema.ServiceStatusChangeNotificationRQ.TaxDetailType.Total.class
})
public class CurrencyAmountOptType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "Taxable")
    protected Boolean taxable;
    @XmlAttribute(name = "Code", required = true)
    protected String code;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTaxable() {
        if (taxable == null) {
            return true;
        } else {
            return taxable;
        }
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

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
