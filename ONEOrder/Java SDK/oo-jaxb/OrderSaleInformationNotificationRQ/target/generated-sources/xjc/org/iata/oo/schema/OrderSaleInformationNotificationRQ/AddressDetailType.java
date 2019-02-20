
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;


/**
 * DETAIL ADDRESS representation.
 * 
 * <p>Java class for AddressDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}AddressCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Directions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.1}Direction" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressDetailType", propOrder = {
    "directions"
})
public class AddressDetailType
    extends AddressCoreType
{

    @XmlElementWrapper(name = "Directions")
    @XmlElement(name = "Direction", namespace = "http://www.iata.org/IATA/EDIST/2017.1")
    protected List<DirectionsType> directions;

    public List<DirectionsType> getDirections() {
        if (directions == null) {
            directions = new ArrayList<DirectionsType>();
        }
        return directions;
    }

    public void setDirections(List<DirectionsType> directions) {
        this.directions = directions;
    }

}
