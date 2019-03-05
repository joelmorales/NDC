//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 04:34:49 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type definition for Encoding Scheme.
 * 
 * <p>Java class for EncSchemeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncSchemeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Detail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SupportedDomain" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}DomainListType" />
 *                           &lt;attribute name="Version" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="SchemeName" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
 *                 &lt;attribute name="SchemePurpose" type="{http://www.iata.org/IATA/EDIST/2017.2}ApplicationSimpleType" />
 *                 &lt;attribute name="Scheme_URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                 &lt;attribute name="SchemeVersion" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Metadata" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetaBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="Remarks" type="{http://www.iata.org/IATA/EDIST/2017.2}RemarkType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Key" type="{http://www.iata.org/IATA/EDIST/2017.2}InstanceClassSimpleType" />
 *       &lt;attribute name="OwnerCode" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}OwnerSimpleType" />
 *       &lt;attribute name="OwnerType" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}EncSchemeListType" />
 *       &lt;attribute name="OwnerName" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
 *       &lt;attribute name="SchemeToken" type="{http://www.iata.org/IATA/EDIST/2017.2}DescriptionSimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncSchemeType", propOrder = {
    "detail",
    "metadata"
})
@XmlSeeAlso({
    org.iata.oo.schema.AirShoppingRS.PolicyType.Metadata.EncodingScheme.class
})
public class EncSchemeType {

    @XmlElement(name = "Detail")
    protected EncSchemeType.Detail detail;
    @XmlElement(name = "Metadata")
    protected EncSchemeType.Metadata metadata;
    @XmlAttribute(name = "Key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String key;
    @XmlAttribute(name = "OwnerCode", required = true)
    protected String ownerCode;
    @XmlAttribute(name = "OwnerType", required = true)
    protected String ownerType;
    @XmlAttribute(name = "OwnerName")
    protected String ownerName;
    @XmlAttribute(name = "SchemeToken")
    protected String schemeToken;

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link EncSchemeType.Detail }
     *     
     */
    public EncSchemeType.Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncSchemeType.Detail }
     *     
     */
    public void setDetail(EncSchemeType.Detail value) {
        this.detail = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link EncSchemeType.Metadata }
     *     
     */
    public EncSchemeType.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncSchemeType.Metadata }
     *     
     */
    public void setMetadata(EncSchemeType.Metadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKey(String value) {
        this.key = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the schemeToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemeToken() {
        return schemeToken;
    }

    /**
     * Sets the value of the schemeToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemeToken(String value) {
        this.schemeToken = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SupportedDomain" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}DomainListType" />
     *                 &lt;attribute name="Version" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="SchemeName" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
     *       &lt;attribute name="SchemePurpose" type="{http://www.iata.org/IATA/EDIST/2017.2}ApplicationSimpleType" />
     *       &lt;attribute name="Scheme_URI" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *       &lt;attribute name="SchemeVersion" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "supportedDomain"
    })
    public static class Detail {

        @XmlElement(name = "SupportedDomain")
        protected List<EncSchemeType.Detail.SupportedDomain> supportedDomain;
        @XmlAttribute(name = "SchemeName")
        protected String schemeName;
        @XmlAttribute(name = "SchemePurpose")
        protected String schemePurpose;
        @XmlAttribute(name = "Scheme_URI")
        @XmlSchemaType(name = "anyURI")
        protected String schemeURI;
        @XmlAttribute(name = "SchemeVersion")
        protected String schemeVersion;

        /**
         * Gets the value of the supportedDomain property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the supportedDomain property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSupportedDomain().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EncSchemeType.Detail.SupportedDomain }
         * 
         * 
         */
        public List<EncSchemeType.Detail.SupportedDomain> getSupportedDomain() {
            if (supportedDomain == null) {
                supportedDomain = new ArrayList<EncSchemeType.Detail.SupportedDomain>();
            }
            return this.supportedDomain;
        }

        /**
         * Gets the value of the schemeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemeName() {
            return schemeName;
        }

        /**
         * Sets the value of the schemeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemeName(String value) {
            this.schemeName = value;
        }

        /**
         * Gets the value of the schemePurpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemePurpose() {
            return schemePurpose;
        }

        /**
         * Sets the value of the schemePurpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemePurpose(String value) {
            this.schemePurpose = value;
        }

        /**
         * Gets the value of the schemeURI property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemeURI() {
            return schemeURI;
        }

        /**
         * Sets the value of the schemeURI property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemeURI(String value) {
            this.schemeURI = value;
        }

        /**
         * Gets the value of the schemeVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchemeVersion() {
            return schemeVersion;
        }

        /**
         * Sets the value of the schemeVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchemeVersion(String value) {
            this.schemeVersion = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}DomainListType" />
         *       &lt;attribute name="Version" type="{http://www.iata.org/IATA/EDIST/2017.2}ContextSimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SupportedDomain {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Version")
            protected String version;

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
             * Gets the value of the version property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVersion() {
                return version;
            }

            /**
             * Sets the value of the version property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVersion(String value) {
                this.version = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetaBaseType">
     *       &lt;sequence>
     *         &lt;element name="Remarks" type="{http://www.iata.org/IATA/EDIST/2017.2}RemarkType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remarks"
    })
    public static class Metadata
        extends MetaBaseType
    {

        @XmlElement(name = "Remarks")
        protected RemarkType remarks;
        @XmlAttribute(name = "Timestamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;

        /**
         * Gets the value of the remarks property.
         * 
         * @return
         *     possible object is
         *     {@link RemarkType }
         *     
         */
        public RemarkType getRemarks() {
            return remarks;
        }

        /**
         * Sets the value of the remarks property.
         * 
         * @param value
         *     allowed object is
         *     {@link RemarkType }
         *     
         */
        public void setRemarks(RemarkType value) {
            this.remarks = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

    }

}
