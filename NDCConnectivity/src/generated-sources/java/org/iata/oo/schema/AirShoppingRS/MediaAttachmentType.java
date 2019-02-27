//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.27 at 11:03:35 AM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * MEDIA ATTACHMENT representation. 
 * 
 * <p>Java class for MediaAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaAttachmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}ImageID" minOccurs="0"/>
 *         &lt;element name="AttachmentURI" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.1}DescriptionSimpleType" minOccurs="0"/>
 *         &lt;element name="Mimetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileKbSize" type="{http://www.iata.org/IATA/EDIST/2017.1}ContextSimpleType" minOccurs="0"/>
 *         &lt;element name="Rendering" type="{http://www.iata.org/IATA/EDIST/2017.1}RenderingInstructionsType" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaAttachmentType", propOrder = {
    "imageID",
    "attachmentURI",
    "description",
    "mimetype",
    "fileKbSize",
    "rendering",
    "content"
})
public class MediaAttachmentType {

    @XmlElement(name = "ImageID")
    protected ImageID imageID;
    @XmlElement(name = "AttachmentURI")
    protected MediaAttachmentType.AttachmentURI attachmentURI;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Mimetype")
    protected String mimetype;
    @XmlElement(name = "FileKbSize")
    protected String fileKbSize;
    @XmlElement(name = "Rendering")
    protected RenderingInstructionsType rendering;
    @XmlElement(name = "Content")
    protected byte[] content;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the imageID property.
     * 
     * @return
     *     possible object is
     *     {@link ImageID }
     *     
     */
    public ImageID getImageID() {
        return imageID;
    }

    /**
     * Sets the value of the imageID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageID }
     *     
     */
    public void setImageID(ImageID value) {
        this.imageID = value;
    }

    /**
     * Gets the value of the attachmentURI property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAttachmentType.AttachmentURI }
     *     
     */
    public MediaAttachmentType.AttachmentURI getAttachmentURI() {
        return attachmentURI;
    }

    /**
     * Sets the value of the attachmentURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAttachmentType.AttachmentURI }
     *     
     */
    public void setAttachmentURI(MediaAttachmentType.AttachmentURI value) {
        this.attachmentURI = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mimetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimetype() {
        return mimetype;
    }

    /**
     * Sets the value of the mimetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimetype(String value) {
        this.mimetype = value;
    }

    /**
     * Gets the value of the fileKbSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileKbSize() {
        return fileKbSize;
    }

    /**
     * Sets the value of the fileKbSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileKbSize(String value) {
        this.fileKbSize = value;
    }

    /**
     * Gets the value of the rendering property.
     * 
     * @return
     *     possible object is
     *     {@link RenderingInstructionsType }
     *     
     */
    public RenderingInstructionsType getRendering() {
        return rendering;
    }

    /**
     * Sets the value of the rendering property.
     * 
     * @param value
     *     allowed object is
     *     {@link RenderingInstructionsType }
     *     
     */
    public void setRendering(RenderingInstructionsType value) {
        this.rendering = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setContent(byte[] value) {
        this.content = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>anyURI">
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.1}ObjAssociationAttrGroup"/>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class AttachmentURI {

        @XmlValue
        @XmlSchemaType(name = "anyURI")
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;

        /**
         * Gets the value of the value property.
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

    }

}
