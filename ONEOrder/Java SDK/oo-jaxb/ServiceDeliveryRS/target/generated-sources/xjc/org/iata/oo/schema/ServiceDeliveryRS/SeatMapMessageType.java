
package org.iata.oo.schema.ServiceDeliveryRS;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * SEAT MAP COMPONENT MEDIA and MESSAGE definition.
 * 
 * <p>Java class for SeatMapMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatMapMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Images" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ImageID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST/2017.1}CabinCameraPosType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Links" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MediaLink"/&gt;
 *                   &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST/2017.1}CabinCameraPosType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Remarks" minOccurs="0"/&gt;
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
@XmlType(name = "SeatMapMessageType", propOrder = {
    "images",
    "links",
    "remarks"
})
@XmlSeeAlso({
    org.iata.oo.schema.ServiceDeliveryRS.SeatDataType.Marketing.class
})
public class SeatMapMessageType {

    @XmlElement(name = "Images")
    protected List<SeatMapMessageType.Images> images;
    @XmlElement(name = "Links")
    protected List<SeatMapMessageType.Links> links;
    @XmlElementWrapper(name = "Remarks")
    @XmlElement(name = "Remark", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<Remark> remarks;
    @XmlAttribute(name = "refs")
    @XmlIDREF
    protected List<Object> refs;

    /**
     * Gets the value of the images property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the images property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapMessageType.Images }
     * 
     * 
     */
    public List<SeatMapMessageType.Images> getImages() {
        if (images == null) {
            images = new ArrayList<SeatMapMessageType.Images>();
        }
        return this.images;
    }

    /**
     * Gets the value of the links property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the links property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinks().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapMessageType.Links }
     * 
     * 
     */
    public List<SeatMapMessageType.Links> getLinks() {
        if (links == null) {
            links = new ArrayList<SeatMapMessageType.Links>();
        }
        return this.links;
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ImageID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST/2017.1}CabinCameraPosType" minOccurs="0"/&gt;
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
        "imageID",
        "position"
    })
    public static class Images {

        @XmlElement(name = "ImageID", required = true)
        protected String imageID;
        @XmlElement(name = "Position")
        protected CabinCameraPosType position;

        /**
         * Gets the value of the imageID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImageID() {
            return imageID;
        }

        /**
         * Sets the value of the imageID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImageID(String value) {
            this.imageID = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link CabinCameraPosType }
         *     
         */
        public CabinCameraPosType getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinCameraPosType }
         *     
         */
        public void setPosition(CabinCameraPosType value) {
            this.position = value;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}MediaLink"/&gt;
     *         &lt;element name="Position" type="{http://www.iata.org/IATA/EDIST/2017.1}CabinCameraPosType" minOccurs="0"/&gt;
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
        "mediaLink",
        "position"
    })
    public static class Links {

        @XmlElement(name = "MediaLink", required = true)
        protected MediaLink mediaLink;
        @XmlElement(name = "Position")
        protected CabinCameraPosType position;

        /**
         * Gets the value of the mediaLink property.
         * 
         * @return
         *     possible object is
         *     {@link MediaLink }
         *     
         */
        public MediaLink getMediaLink() {
            return mediaLink;
        }

        /**
         * Sets the value of the mediaLink property.
         * 
         * @param value
         *     allowed object is
         *     {@link MediaLink }
         *     
         */
        public void setMediaLink(MediaLink value) {
            this.mediaLink = value;
        }

        /**
         * Gets the value of the position property.
         * 
         * @return
         *     possible object is
         *     {@link CabinCameraPosType }
         *     
         */
        public CabinCameraPosType getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link CabinCameraPosType }
         *     
         */
        public void setPosition(CabinCameraPosType value) {
            this.position = value;
        }

    }

}
