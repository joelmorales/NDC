
package org.iata.oo.schema.OrderSaleInformationNotificationRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareIndicatorListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareIndicatorListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="AP"/&gt;
 *     &lt;enumeration value="AT"/&gt;
 *     &lt;enumeration value="CA"/&gt;
 *     &lt;enumeration value="CT"/&gt;
 *     &lt;enumeration value="EH"/&gt;
 *     &lt;enumeration value="FE"/&gt;
 *     &lt;enumeration value="IN"/&gt;
 *     &lt;enumeration value="NA"/&gt;
 *     &lt;enumeration value="PA"/&gt;
 *     &lt;enumeration value="PN"/&gt;
 *     &lt;enumeration value="PO"/&gt;
 *     &lt;enumeration value="RU"/&gt;
 *     &lt;enumeration value="RW"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SP"/&gt;
 *     &lt;enumeration value="TB"/&gt;
 *     &lt;enumeration value="TS"/&gt;
 *     &lt;enumeration value="US"/&gt;
 *     &lt;enumeration value="WH"/&gt;
 *     &lt;enumeration value="ZZ"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareIndicatorListType")
@XmlEnum
public enum FareIndicatorListType {


    /**
     * FareByRule, All fares included (EH/TS)
     *                     
     * 
     */
    AL("AL"),

    /**
     * Via Atlantic Pacific
     * 
     */
    AP("AP"),

    /**
     * Via Atlantic
     * 
     */
    AT("AT"),

    /**
     * Within Canada.
     * 
     */
    CA("CA"),

    /**
     * Circle trip.
     * 
     */
    CT("CT"),

    /**
     * Within Eastern Hemisphere
     *                     
     * 
     */
    EH("EH"),

    /**
     * Far East
     * 
     */
    FE("FE"),

    /**
     * FareByRule - For int'l incl.
     *                         AT/PA/WH/CT/RW
     * 
     */
    IN("IN"),

    /**
     * FareByRule for North America incl
     *                         US/CA/TB/PV
     * 
     */
    NA("NA"),

    /**
     * Via Pacific
     * 
     */
    PA("PA"),

    /**
     * Via Pacific and via North America
     *                     
     * 
     */
    PN("PN"),

    /**
     * Via Polar Route.
     * 
     */
    PO("PO"),

    /**
     * Russia - Area 3 
     * 
     */
    RU("RU"),

    /**
     * Round The World.
     * 
     */
    RW("RW"),

    /**
     * South Atlantic only
     * 
     */
    SA("SA"),

    /**
     * Via South Polar Route
     * 
     */
    SP("SP"),

    /**
     * Trans-border
     * 
     */
    TB("TB"),

    /**
     * Via Siberia.
     * 
     */
    TS("TS"),

    /**
     * Within the United States.
     *                     
     * 
     */
    US("US"),

    /**
     * Within Western Hemisphere
     *                     
     * 
     */
    WH("WH"),

    /**
     * Any Global
     * 
     */
    ZZ("ZZ"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FareIndicatorListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareIndicatorListType fromValue(String v) {
        for (FareIndicatorListType c: FareIndicatorListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
