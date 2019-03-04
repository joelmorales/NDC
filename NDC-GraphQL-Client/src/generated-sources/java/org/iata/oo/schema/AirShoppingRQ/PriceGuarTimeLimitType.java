//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 02:09:34 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Offer/ Offer Item: PRICE GUARANTEE Time Limit definition.
 * 
 * Price Guarantee Time Limit value.
 * Examples: 2017-05-30T09:00:00,  2015-01-13T13:59:38Z
 * 
 * Notes:
 *  1. This is the period for which an Offer price is guaranteed.
 * 
 *  2. On expiry an Offer may be re-priced up to the point an accountable document is issued.
 * 
 *  3. A Price Guarantee cannot extend beyond the Offer Expiration Time Limit unless an Order has been created.
 * 
 * <p>Java class for PriceGuarTimeLimitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceGuarTimeLimitType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}KeyWithMetaObjectBaseType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceGuarTimeLimitType")
@XmlSeeAlso({
    PriceGuaranteeTimeLimit.class
})
public class PriceGuarTimeLimitType
    extends KeyWithMetaObjectBaseType
{


}
