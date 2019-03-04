//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:52:55 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Geographic Specification information
 * 
 * <p>Java class for GeographicSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}GeoSpecCode" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Coordinates" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PositionType">
 *                 &lt;sequence>
 *                   &lt;element name="CoordinateRadius" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                           &lt;attribute name="UOM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "GeographicSpecificationType", propOrder = {
    "geoSpecCode",
    "coordinates"
})
public class GeographicSpecificationType {

    @XmlElement(name = "GeoSpecCode")
    protected List<GeoSpecCode> geoSpecCode;
    @XmlElement(name = "Coordinates")
    protected GeographicSpecificationType.Coordinates coordinates;

    /**
     * Indicates whether a system may or may not send NDC requests based on geographic specifications. Users may enter a location here which is further defined by the @Type.                                                             Valid area values include 1 = Western Hemisphere 2 = Europe, Africa, and the Near East 3 = Far East, Australia, and Pacific                                                                   Valid sub areas are Standard ISO/IATA sub area code                                               Valid airport and city codes are a three letter  location identifier assigned according to the IATA Resolution 763.  Refer to IATA Airline Coding Directory . Example: TPA    
     *     Gets the value of the geoSpecCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the geoSpecCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeoSpecCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeoSpecCode }
     * 
     * 
     */
    public List<GeoSpecCode> getGeoSpecCode() {
        if (geoSpecCode == null) {
            geoSpecCode = new ArrayList<GeoSpecCode>();
        }
        return this.geoSpecCode;
    }

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicSpecificationType.Coordinates }
     *     
     */
    public GeographicSpecificationType.Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicSpecificationType.Coordinates }
     *     
     */
    public void setCoordinates(GeographicSpecificationType.Coordinates value) {
        this.coordinates = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}PositionType">
     *       &lt;sequence>
     *         &lt;element name="CoordinateRadius" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                 &lt;attribute name="UOM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
    @XmlType(name = "", propOrder = {
        "coordinateRadius"
    })
    public static class Coordinates
        extends PositionType
    {

        @XmlElement(name = "CoordinateRadius")
        protected GeographicSpecificationType.Coordinates.CoordinateRadius coordinateRadius;

        /**
         * Gets the value of the coordinateRadius property.
         * 
         * @return
         *     possible object is
         *     {@link GeographicSpecificationType.Coordinates.CoordinateRadius }
         *     
         */
        public GeographicSpecificationType.Coordinates.CoordinateRadius getCoordinateRadius() {
            return coordinateRadius;
        }

        /**
         * Sets the value of the coordinateRadius property.
         * 
         * @param value
         *     allowed object is
         *     {@link GeographicSpecificationType.Coordinates.CoordinateRadius }
         *     
         */
        public void setCoordinateRadius(GeographicSpecificationType.Coordinates.CoordinateRadius value) {
            this.coordinateRadius = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *       &lt;attribute name="UOM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        public static class CoordinateRadius {

            @XmlValue
            protected BigDecimal value;
            @XmlAttribute(name = "UOM")
            @XmlSchemaType(name = "anySimpleType")
            protected String uom;

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
             * Gets the value of the uom property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUOM() {
                return uom;
            }

            /**
             * Sets the value of the uom property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUOM(String value) {
                this.uom = value;
            }

        }

    }

}
