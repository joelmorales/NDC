//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:52:55 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import java.math.BigInteger;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type definition for Augmentation Point  List.
 * 
 * <p>Java class for AugPointListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AugPointListType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}ListBaseType">
 *       &lt;sequence>
 *         &lt;element name="List" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AugPointAssoc" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="KeyRef" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
 *                           &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}OwnerSimpleType" />
 *                           &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NamedAssocs" type="{http://www.iata.org/IATA/EDIST/2017.1}NamedAssocType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ListKey" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassSimpleType" />
 *                 &lt;attribute name="ListName" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *                 &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}OwnerSimpleType" />
 *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AugPointListType", propOrder = {
    "list"
})
public class AugPointListType
    extends ListBaseType
{

    @XmlElement(name = "List", required = true)
    protected java.util.List<AugPointListType.List> list;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AugPointListType.List }
     * 
     * 
     */
    public java.util.List<AugPointListType.List> getList() {
        if (list == null) {
            list = new ArrayList<AugPointListType.List>();
        }
        return this.list;
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
     *         &lt;element name="AugPointAssoc" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="KeyRef" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
     *                 &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}OwnerSimpleType" />
     *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NamedAssocs" type="{http://www.iata.org/IATA/EDIST/2017.1}NamedAssocType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ListKey" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassSimpleType" />
     *       &lt;attribute name="ListName" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
     *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}OwnerSimpleType" />
     *       &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "augPointAssoc",
        "namedAssocs"
    })
    public static class List {

        @XmlElement(name = "AugPointAssoc", required = true)
        protected java.util.List<AugPointListType.List.AugPointAssoc> augPointAssoc;
        @XmlElement(name = "NamedAssocs")
        protected NamedAssocType namedAssocs;
        @XmlAttribute(name = "ListKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String listKey;
        @XmlAttribute(name = "ListName")
        protected String listName;
        @XmlAttribute(name = "Owner")
        protected String owner;
        @XmlAttribute(name = "Seq")
        protected BigInteger seq;

        /**
         * Gets the value of the augPointAssoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the augPointAssoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAugPointAssoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AugPointListType.List.AugPointAssoc }
         * 
         * 
         */
        public java.util.List<AugPointListType.List.AugPointAssoc> getAugPointAssoc() {
            if (augPointAssoc == null) {
                augPointAssoc = new ArrayList<AugPointListType.List.AugPointAssoc>();
            }
            return this.augPointAssoc;
        }

        /**
         * Gets the value of the namedAssocs property.
         * 
         * @return
         *     possible object is
         *     {@link NamedAssocType }
         *     
         */
        public NamedAssocType getNamedAssocs() {
            return namedAssocs;
        }

        /**
         * Sets the value of the namedAssocs property.
         * 
         * @param value
         *     allowed object is
         *     {@link NamedAssocType }
         *     
         */
        public void setNamedAssocs(NamedAssocType value) {
            this.namedAssocs = value;
        }

        /**
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
        }

        /**
         * Gets the value of the listName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListName() {
            return listName;
        }

        /**
         * Sets the value of the listName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListName(String value) {
            this.listName = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
        }

        /**
         * Gets the value of the seq property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeq() {
            return seq;
        }

        /**
         * Sets the value of the seq property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeq(BigInteger value) {
            this.seq = value;
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
         *       &lt;attribute name="KeyRef" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
         *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/EDIST/2017.1}OwnerSimpleType" />
         *       &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AugPointAssoc {

            @XmlAttribute(name = "KeyRef", required = true)
            @XmlIDREF
            protected java.util.List<Object> keyRef;
            @XmlAttribute(name = "Owner")
            protected String owner;
            @XmlAttribute(name = "Seq")
            protected BigInteger seq;

            /**
             * Gets the value of the keyRef property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the keyRef property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getKeyRef().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public java.util.List<Object> getKeyRef() {
                if (keyRef == null) {
                    keyRef = new ArrayList<Object>();
                }
                return this.keyRef;
            }

            /**
             * Gets the value of the owner property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Sets the value of the owner property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Gets the value of the seq property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSeq() {
                return seq;
            }

            /**
             * Sets the value of the seq property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSeq(BigInteger value) {
                this.seq = value;
            }

        }

    }

}
