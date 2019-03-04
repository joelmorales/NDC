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
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type definition for Named Association Type.
 * 
 * Named Association(s).
 * 
 * Note: This capability supports implementer-specified, or "Named" reference associations to other (target) instantiated objects with @Key, @GroupKey and/ or @ListKey attributes.
 * 
 * <p>Java class for NamedAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NamedAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamedAssoc" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Group" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="GroupKeyRef" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
 *                           &lt;attribute name="TokenRef" type="{http://www.iata.org/IATA/EDIST/2017.1}TokenID_SimpleType" />
 *                           &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="List" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ListKeyRef" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
 *                           &lt;attribute name="TokenRef" type="{http://www.iata.org/IATA/EDIST/2017.1}TokenID_SimpleType" />
 *                           &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UniqueKeyID" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="UniqueID_Ref" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueID_SimpleType" />
 *                           &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Target" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *                 &lt;attribute name="KeyRef" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
 *                 &lt;attribute name="From" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
 *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NamedAssocType", propOrder = {
    "namedAssoc"
})
public class NamedAssocType {

    @XmlElement(name = "NamedAssoc", required = true)
    protected java.util.List<NamedAssocType.NamedAssoc> namedAssoc;

    /**
     * Gets the value of the namedAssoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namedAssoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamedAssoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NamedAssocType.NamedAssoc }
     * 
     * 
     */
    public java.util.List<NamedAssocType.NamedAssoc> getNamedAssoc() {
        if (namedAssoc == null) {
            namedAssoc = new ArrayList<NamedAssocType.NamedAssoc>();
        }
        return this.namedAssoc;
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
     *         &lt;element name="Group" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="GroupKeyRef" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
     *                 &lt;attribute name="TokenRef" type="{http://www.iata.org/IATA/EDIST/2017.1}TokenID_SimpleType" />
     *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="List" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ListKeyRef" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
     *                 &lt;attribute name="TokenRef" type="{http://www.iata.org/IATA/EDIST/2017.1}TokenID_SimpleType" />
     *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UniqueKeyID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="UniqueID_Ref" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueID_SimpleType" />
     *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Target" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
     *       &lt;attribute name="KeyRef" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
     *       &lt;attribute name="From" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" />
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
        "group",
        "list",
        "uniqueKeyID"
    })
    public static class NamedAssoc {

        @XmlElement(name = "Group")
        protected java.util.List<NamedAssocType.NamedAssoc.Group> group;
        @XmlElement(name = "List")
        protected java.util.List<NamedAssocType.NamedAssoc.List> list;
        @XmlElement(name = "UniqueKeyID")
        protected java.util.List<NamedAssocType.NamedAssoc.UniqueKeyID> uniqueKeyID;
        @XmlAttribute(name = "Target", required = true)
        protected String target;
        @XmlAttribute(name = "KeyRef")
        @XmlIDREF
        protected java.util.List<Object> keyRef;
        @XmlAttribute(name = "From")
        protected String from;
        @XmlAttribute(name = "Seq")
        protected BigInteger seq;

        /**
         * Gets the value of the group property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the group property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NamedAssocType.NamedAssoc.Group }
         * 
         * 
         */
        public java.util.List<NamedAssocType.NamedAssoc.Group> getGroup() {
            if (group == null) {
                group = new ArrayList<NamedAssocType.NamedAssoc.Group>();
            }
            return this.group;
        }

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
         * {@link NamedAssocType.NamedAssoc.List }
         * 
         * 
         */
        public java.util.List<NamedAssocType.NamedAssoc.List> getList() {
            if (list == null) {
                list = new ArrayList<NamedAssocType.NamedAssoc.List>();
            }
            return this.list;
        }

        /**
         * Gets the value of the uniqueKeyID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uniqueKeyID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUniqueKeyID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NamedAssocType.NamedAssoc.UniqueKeyID }
         * 
         * 
         */
        public java.util.List<NamedAssocType.NamedAssoc.UniqueKeyID> getUniqueKeyID() {
            if (uniqueKeyID == null) {
                uniqueKeyID = new ArrayList<NamedAssocType.NamedAssoc.UniqueKeyID>();
            }
            return this.uniqueKeyID;
        }

        /**
         * Gets the value of the target property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Sets the value of the target property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

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
         * Gets the value of the from property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrom() {
            return from;
        }

        /**
         * Sets the value of the from property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrom(String value) {
            this.from = value;
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
         *       &lt;attribute name="GroupKeyRef" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
         *       &lt;attribute name="TokenRef" type="{http://www.iata.org/IATA/EDIST/2017.1}TokenID_SimpleType" />
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
        public static class Group {

            @XmlAttribute(name = "GroupKeyRef")
            @XmlIDREF
            protected java.util.List<Object> groupKeyRef;
            @XmlAttribute(name = "TokenRef")
            protected String tokenRef;
            @XmlAttribute(name = "Seq")
            protected BigInteger seq;

            /**
             * Gets the value of the groupKeyRef property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the groupKeyRef property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGroupKeyRef().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public java.util.List<Object> getGroupKeyRef() {
                if (groupKeyRef == null) {
                    groupKeyRef = new ArrayList<Object>();
                }
                return this.groupKeyRef;
            }

            /**
             * Gets the value of the tokenRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTokenRef() {
                return tokenRef;
            }

            /**
             * Sets the value of the tokenRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTokenRef(String value) {
                this.tokenRef = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="ListKeyRef" type="{http://www.iata.org/IATA/EDIST/2017.1}InstanceClassRefSimpleType" />
         *       &lt;attribute name="TokenRef" type="{http://www.iata.org/IATA/EDIST/2017.1}TokenID_SimpleType" />
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
        public static class List {

            @XmlAttribute(name = "ListKeyRef")
            @XmlIDREF
            protected java.util.List<Object> listKeyRef;
            @XmlAttribute(name = "TokenRef")
            protected String tokenRef;
            @XmlAttribute(name = "Seq")
            protected BigInteger seq;

            /**
             * Gets the value of the listKeyRef property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the listKeyRef property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getListKeyRef().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public java.util.List<Object> getListKeyRef() {
                if (listKeyRef == null) {
                    listKeyRef = new ArrayList<Object>();
                }
                return this.listKeyRef;
            }

            /**
             * Gets the value of the tokenRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTokenRef() {
                return tokenRef;
            }

            /**
             * Sets the value of the tokenRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTokenRef(String value) {
                this.tokenRef = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="UniqueID_Ref" use="required" type="{http://www.iata.org/IATA/EDIST/2017.1}UniqueID_SimpleType" />
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
        public static class UniqueKeyID {

            @XmlAttribute(name = "UniqueID_Ref", required = true)
            protected String uniqueIDRef;
            @XmlAttribute(name = "Seq")
            protected BigInteger seq;

            /**
             * Gets the value of the uniqueIDRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUniqueIDRef() {
                return uniqueIDRef;
            }

            /**
             * Sets the value of the uniqueIDRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUniqueIDRef(String value) {
                this.uniqueIDRef = value;
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
