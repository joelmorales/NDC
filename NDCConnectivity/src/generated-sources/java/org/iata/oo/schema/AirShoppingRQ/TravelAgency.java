//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:52:55 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}TravelAgencyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}AgentUserID"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UserRole" type="{http://www.iata.org/IATA/EDIST/2017.1}ProperNameSimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "agentUserID"
})
@XmlRootElement(name = "TravelAgency")
public class TravelAgency
    extends TravelAgencyType
{

    @XmlElement(name = "AgentUserID", required = true)
    protected AgentUserIDType agentUserID;
    @XmlAttribute(name = "UserRole")
    protected String userRole;

    /**
     * Gets the value of the agentUserID property.
     * 
     * @return
     *     possible object is
     *     {@link AgentUserIDType }
     *     
     */
    public AgentUserIDType getAgentUserID() {
        return agentUserID;
    }

    /**
     * Sets the value of the agentUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgentUserIDType }
     *     
     */
    public void setAgentUserID(AgentUserIDType value) {
        this.agentUserID = value;
    }

    /**
     * Gets the value of the userRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * Sets the value of the userRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserRole(String value) {
        this.userRole = value;
    }

}
