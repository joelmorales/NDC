
package org.iata.oo.schema.ServiceStatusChangeNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: FARE - FARE CODE
 * 
 *  ============
 * Representation(s)
 *  ============
 * • Encoding Scheme: PADIS codeset element 9910 - Fare Qualifier
 * 
 *  ============
 * Metadata
 *  ============
 * • FareMetadata
 * 
 * <p>Java class for FareCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}CodesetType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareCodeType")
public class FareCodeType
    extends CodesetType
{


}
