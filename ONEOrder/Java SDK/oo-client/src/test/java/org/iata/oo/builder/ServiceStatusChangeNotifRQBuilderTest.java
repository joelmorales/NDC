package org.iata.oo.builder;

import org.iata.oo.schema.ServiceStatusChangeNotificationRQ.*;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class ServiceStatusChangeNotifRQBuilderTest {
    private ServiceStatusChangeNotifRQBuilder testedClass;

    @Before
    public void setUp() {
        testedClass = new ServiceStatusChangeNotifRQBuilder();
    }

    @Test
    public void documentNode() {
        IATAServiceStatusChangeNotificationRQ request = testedClass.build();
        assertEquals("IATA2017.1", request.getVersion());
    }

    @Test
    public void setOrder() {
        List<OrderItem> orderItemList = new ArrayList<>();

        ServiceDetailType service = new ServiceDetailType();
        service.setServiceID("SV1023_AL2_1_SH1");
        service.setOwner("Z9");
        service.setServiceStatus(ServiceStatusType.fromValue("Service Delivery READY FOR DELIVERY"));

        OrderItem orderItem = new OrderItem();
        orderItem.setOrderItemID("ORDERITEM2");
        orderItem.setOwner("Z9");
        orderItem.getService().add(service);
        orderItemList.add(orderItem);

        IATAServiceStatusChangeNotificationRQ request = testedClass.addOrder("AD12345", "Z9", orderItemList).build();
        assertEquals("AD12345", request.getOrder().get(0).getOrderID());
        assertEquals("Z9", request.getOrder().get(0).getOwner());
        assertEquals("ORDERITEM2", request.getOrder().get(0).getOrderItem().get(0).getOrderItemID());
        assertEquals("SV1023_AL2_1_SH1", request.getOrder().get(0).getOrderItem().get(0).getService().get(0).getServiceID());
        assertEquals("Service Delivery READY FOR DELIVERY", request.getOrder().get(0).getOrderItem().get(0).getService().get(0).getServiceStatus().value());
    }
}
