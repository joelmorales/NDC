
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdvanceReservation"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;duration"&gt;
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}AdvPurchaseSimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdvanceDeparture"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;duration"&gt;
 *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}AdvPurchaseSimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
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
@XmlType(name = "", propOrder = {
    "advanceReservation",
    "advanceDeparture"
})
@XmlRootElement(name = "AdvanceTicketing")
public class AdvanceTicketing {

    @XmlElement(name = "AdvanceReservation", required = true)
    protected AdvanceTicketing.AdvanceReservation advanceReservation;
    @XmlElement(name = "AdvanceDeparture", required = true)
    protected AdvanceTicketing.AdvanceDeparture advanceDeparture;

    /**
     * Gets the value of the advanceReservation property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceTicketing.AdvanceReservation }
     *     
     */
    public AdvanceTicketing.AdvanceReservation getAdvanceReservation() {
        return advanceReservation;
    }

    /**
     * Sets the value of the advanceReservation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceTicketing.AdvanceReservation }
     *     
     */
    public void setAdvanceReservation(AdvanceTicketing.AdvanceReservation value) {
        this.advanceReservation = value;
    }

    /**
     * Gets the value of the advanceDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link AdvanceTicketing.AdvanceDeparture }
     *     
     */
    public AdvanceTicketing.AdvanceDeparture getAdvanceDeparture() {
        return advanceDeparture;
    }

    /**
     * Sets the value of the advanceDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceTicketing.AdvanceDeparture }
     *     
     */
    public void setAdvanceDeparture(AdvanceTicketing.AdvanceDeparture value) {
        this.advanceDeparture = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;duration"&gt;
     *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}AdvPurchaseSimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AdvanceDeparture {

        @XmlValue
        protected Duration value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setValue(Duration value) {
            this.value = value;
        }

        /**
         * Gets the value of the context property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContext() {
            return context;
        }

        /**
         * Sets the value of the context property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContext(String value) {
            this.context = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;duration"&gt;
     *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/EDIST/2017.1}AdvPurchaseSimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AdvanceReservation {

        @XmlValue
        protected Duration value;
        @XmlAttribute(name = "Context")
        protected String context;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setValue(Duration value) {
            this.value = value;
        }

        /**
         * Gets the value of the context property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContext() {
            return context;
        }

        /**
         * Sets the value of the context property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContext(String value) {
            this.context = value;
        }

    }

}
