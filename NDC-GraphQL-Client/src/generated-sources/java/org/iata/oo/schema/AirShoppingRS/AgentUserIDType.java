//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.03.05 at 04:34:49 PM CST 
//


package org.iata.oo.schema.AirShoppingRS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type for Agent User (e.g. Travel Agent) ID.
 * 
 * User ID.
 * Example: ksmith212
 * 
 * <p>Java class for AgentUserID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgentUserID_Type">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.2>UniqueIDContextType">
 *       &lt;attribute name="Name" type="{http://www.iata.org/IATA/EDIST/2017.2}ProperNameSimpleType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgentUserID_Type")
public class AgentUserIDType
    extends UniqueIDContextType
{

    @XmlAttribute(name = "Name")
    protected String name;

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

}
