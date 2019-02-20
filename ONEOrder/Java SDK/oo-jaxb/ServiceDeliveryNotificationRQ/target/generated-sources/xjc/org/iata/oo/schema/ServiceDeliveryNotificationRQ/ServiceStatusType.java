
package org.iata.oo.schema.ServiceDeliveryNotificationRQ;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ServiceStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Service Delivery DELIVERY IN PROGRESS"/&gt;
 *     &lt;enumeration value="Service Delivery DELIVERED"/&gt;
 *     &lt;enumeration value="Service Delivery DELIVERED TO PASSENGER"/&gt;
 *     &lt;enumeration value="Service Delivery NOT CLAIMED"/&gt;
 *     &lt;enumeration value="Service Delivery FAILED TO DELIVER"/&gt;
 *     &lt;enumeration value="Service Delivery READY TO PROCEED"/&gt;
 *     &lt;enumeration value="Service Delivery READY FOR DELIVERY"/&gt;
 *     &lt;enumeration value="Service Delivery NOTIFICATION TO PROVIDER IS SENT"/&gt;
 *     &lt;enumeration value="Service Delivery READY FOR DELIVERY ON-BOARD"/&gt;
 *     &lt;enumeration value="Service Delivery BLOCKED FROM DELIVERY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceStatusType")
@XmlEnum
public enum ServiceStatusType {

    @XmlEnumValue("Service Delivery DELIVERY IN PROGRESS")
    SERVICE_DELIVERY_DELIVERY_IN_PROGRESS("Service Delivery DELIVERY IN PROGRESS"),
    @XmlEnumValue("Service Delivery DELIVERED")
    SERVICE_DELIVERY_DELIVERED("Service Delivery DELIVERED"),
    @XmlEnumValue("Service Delivery DELIVERED TO PASSENGER")
    SERVICE_DELIVERY_DELIVERED_TO_PASSENGER("Service Delivery DELIVERED TO PASSENGER"),
    @XmlEnumValue("Service Delivery NOT CLAIMED")
    SERVICE_DELIVERY_NOT_CLAIMED("Service Delivery NOT CLAIMED"),
    @XmlEnumValue("Service Delivery FAILED TO DELIVER")
    SERVICE_DELIVERY_FAILED_TO_DELIVER("Service Delivery FAILED TO DELIVER"),
    @XmlEnumValue("Service Delivery READY TO PROCEED")
    SERVICE_DELIVERY_READY_TO_PROCEED("Service Delivery READY TO PROCEED"),
    @XmlEnumValue("Service Delivery READY FOR DELIVERY")
    SERVICE_DELIVERY_READY_FOR_DELIVERY("Service Delivery READY FOR DELIVERY"),
    @XmlEnumValue("Service Delivery NOTIFICATION TO PROVIDER IS SENT")
    SERVICE_DELIVERY_NOTIFICATION_TO_PROVIDER_IS_SENT("Service Delivery NOTIFICATION TO PROVIDER IS SENT"),
    @XmlEnumValue("Service Delivery READY FOR DELIVERY ON-BOARD")
    SERVICE_DELIVERY_READY_FOR_DELIVERY_ON_BOARD("Service Delivery READY FOR DELIVERY ON-BOARD"),
    @XmlEnumValue("Service Delivery BLOCKED FROM DELIVERY")
    SERVICE_DELIVERY_BLOCKED_FROM_DELIVERY("Service Delivery BLOCKED FROM DELIVERY");
    private final String value;

    ServiceStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceStatusType fromValue(String v) {
        for (ServiceStatusType c: ServiceStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
