
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * PROMOTION helper object.
 * 
 * <p>Java class for PromotionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CodesetValueSimpleType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectPolicyMetaAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Issuer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlineID"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AgencyID"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PartnerID"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/&gt;
 *         &lt;element name="VoucherOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionType", propOrder = {
    "code",
    "link",
    "issuer",
    "remarks",
    "voucherOwner"
})
@XmlSeeAlso({
    org.iata.oo.schema.ServiceStatusChangeNotificationRQ.PaymentProcessType.Promotion.class
})
public class PromotionType {

    @XmlElement(name = "Code", required = true)
    protected PromotionType.Code code;
    @XmlElement(name = "Link")
    @XmlSchemaType(name = "anyURI")
    protected String link;
    @XmlElement(name = "Issuer")
    protected PromotionType.Issuer issuer;
    @XmlElementWrapper(name = "Remarks")
    @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<Remark> remarks;
    @XmlElement(name = "VoucherOwner")
    protected String voucherOwner;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionType.Code }
     *     
     */
    public PromotionType.Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType.Code }
     *     
     */
    public void setCode(PromotionType.Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionType.Issuer }
     *     
     */
    public PromotionType.Issuer getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType.Issuer }
     *     
     */
    public void setIssuer(PromotionType.Issuer value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the voucherOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherOwner() {
        return voucherOwner;
    }

    /**
     * Sets the value of the voucherOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherOwner(String value) {
        this.voucherOwner = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getRefs() {
        if (refs == null) {
            refs = new ArrayList<Object>();
        }
        return this.refs;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;CodesetValueSimpleType"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjectPolicyMetaAttrGroup"/&gt;
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
    public static class Code {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ObjectMetaReferences")
        @XmlIDREF
        protected List<Object> objectMetaReferences;

        /**
         * Examples: A, ABC, 1
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
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }

        /**
         * Gets the value of the objectMetaReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the objectMetaReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getObjectMetaReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getObjectMetaReferences() {
            if (objectMetaReferences == null) {
                objectMetaReferences = new ArrayList<Object>();
            }
            return this.objectMetaReferences;
        }

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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AirlineID"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AgencyID"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}PartnerID"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airlineID",
        "agencyID",
        "partnerID"
    })
    public static class Issuer {

        @XmlElement(name = "AirlineID")
        protected AirlineIDType airlineID;
        @XmlElement(name = "AgencyID")
        protected AgencyIDType agencyID;
        @XmlElement(name = "PartnerID")
        protected PartnerCompanyIDType partnerID;

        /**
         * A two-character alpha-numeric code assigned according to the IATA Resolution 762 or a three-letter airline designator assigned by ICAO.  Refer to IATA Airline Coding Directory .
         * 
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
         * Gets the value of the agencyID property.
         * 
         * @return
         *     possible object is
         *     {@link AgencyIDType }
         *     
         */
        public AgencyIDType getAgencyID() {
            return agencyID;
        }

        /**
         * Sets the value of the agencyID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgencyIDType }
         *     
         */
        public void setAgencyID(AgencyIDType value) {
            this.agencyID = value;
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

    }

}
