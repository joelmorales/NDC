//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.02.28 at 01:52:55 PM CST 
//


package org.iata.oo.schema.AirShoppingRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PayFormListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PayFormListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BankAccount"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="DebitCard"/>
 *     &lt;enumeration value="DirectBill"/>
 *     &lt;enumeration value="LoyaltyRedemption"/>
 *     &lt;enumeration value="MiscChargeOrder"/>
 *     &lt;enumeration value="PaymentCard"/>
 *     &lt;enumeration value="Voucher"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PayFormListType")
@XmlEnum
public enum PayFormListType {

    @XmlEnumValue("BankAccount")
    BANK_ACCOUNT("BankAccount"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("DirectBill")
    DIRECT_BILL("DirectBill"),
    @XmlEnumValue("LoyaltyRedemption")
    LOYALTY_REDEMPTION("LoyaltyRedemption"),
    @XmlEnumValue("MiscChargeOrder")
    MISC_CHARGE_ORDER("MiscChargeOrder"),
    @XmlEnumValue("PaymentCard")
    PAYMENT_CARD("PaymentCard"),
    @XmlEnumValue("Voucher")
    VOUCHER("Voucher"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PayFormListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PayFormListType fromValue(String v) {
        for (PayFormListType c: PayFormListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
