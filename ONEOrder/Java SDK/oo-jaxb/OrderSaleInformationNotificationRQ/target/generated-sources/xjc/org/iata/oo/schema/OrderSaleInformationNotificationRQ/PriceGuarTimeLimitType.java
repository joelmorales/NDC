
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

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
 * &lt;complexType name="PriceGuarTimeLimitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.1}KeyWithMetaObjectBaseType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
