
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * CORE ADDRESS representation.
 * 
 * <p>Java class for AddressCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}KeyWithMetaObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentAddress"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleAddress"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressCoreType", propOrder = {
    "address"
})
@XmlSeeAlso({
    AddressDetailType.class
})
public class AddressCoreType
    extends KeyWithMetaObjectBaseType
{

    @XmlElement(name = "Address", required = true)
    protected AddressCoreType.Address address;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressCoreType.Address }
     *     
     */
    public AddressCoreType.Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCoreType.Address }
     *     
     */
    public void setAddress(AddressCoreType.Address value) {
        this.address = value;
    }


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
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PaymentAddress"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}SimpleAddress"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}StructuredAddress"/&gt;
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
        "paymentAddress",
        "simpleAddress",
        "structuredAddress"
    })
    public static class Address {

        @XmlElement(name = "PaymentAddress", required = true)
        protected PaymentAddrType paymentAddress;
        @XmlElement(name = "SimpleAddress", required = true)
        protected SimpleAddrType simpleAddress;
        @XmlElement(name = "StructuredAddress", required = true)
        protected StructuredAddrType structuredAddress;

        /**
         * Gets the value of the paymentAddress property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentAddrType }
         *     
         */
        public PaymentAddrType getPaymentAddress() {
            return paymentAddress;
        }

        /**
         * Sets the value of the paymentAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentAddrType }
         *     
         */
        public void setPaymentAddress(PaymentAddrType value) {
            this.paymentAddress = value;
        }

        /**
         * Gets the value of the simpleAddress property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleAddrType }
         *     
         */
        public SimpleAddrType getSimpleAddress() {
            return simpleAddress;
        }

        /**
         * Sets the value of the simpleAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleAddrType }
         *     
         */
        public void setSimpleAddress(SimpleAddrType value) {
            this.simpleAddress = value;
        }

        /**
         * Gets the value of the structuredAddress property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredAddrType }
         *     
         */
        public StructuredAddrType getStructuredAddress() {
            return structuredAddress;
        }

        /**
         * Sets the value of the structuredAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredAddrType }
         *     
         */
        public void setStructuredAddress(StructuredAddrType value) {
            this.structuredAddress = value;
        }

    }

}
