
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * UNIQUE MEDIA ID representation.
 * 
 * Unique Media ID. Example: IMG215
 * 
 * <p>Java class for MediaID_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MediaID_Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iata.org/IATA/EDIST/2017.1&gt;UniqueIDContextType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MediaID_Type")
public class MediaIDType
    extends UniqueIDContextType
{


}
