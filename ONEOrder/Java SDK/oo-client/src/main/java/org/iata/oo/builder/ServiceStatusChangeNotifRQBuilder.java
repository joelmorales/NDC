package org.iata.oo.builder;

import org.iata.oo.schema.ServiceStatusChangeNotificationRQ.*;
import java.util.List;

/**
 * This class provides a simple way to create IATAServiceStatusChangeNotificationRQ objects.
 */
public class ServiceStatusChangeNotifRQBuilder implements Buildable<IATAServiceStatusChangeNotificationRQ>{
    private IATAServiceStatusChangeNotificationRQ request;

    /**
     * Creates a new instance of ServiceStatusChangeNotifRQBuilder.
     */
    public ServiceStatusChangeNotifRQBuilder() { //{@link #clear)
        doInitialize();
    }

    /**
     * Re-initializes builder to empty state.
     */
    protected void doInitialize() {
        request = Initializer.getObject(IATAServiceStatusChangeNotificationRQ.class);
    }

    /**
     * Creates a new instance of {@link OrderCoreType} using supplied data and adds it to the IATAServiceStatusChangeNotificationRQ instance.
     * @param orderId orderId of the OrderCoreType
     * @param owner owner of the OrderCoreType
     * @param orderItems a list containing the orderitems of the OrderCoreType
     * @return current builder instance
     */
    public ServiceStatusChangeNotifRQBuilder addOrder(String orderId, String owner, List<OrderItem> orderItems) {
        OrderCoreType order = new OrderCoreType();
        order.setOrderID(orderId);
        order.setOwner(owner);
        for(OrderItem oi: orderItems){
            order.getOrderItem().add(oi);
        }

        request.getOrder().add(order);
        return this;
    }

    /**
     * Creates a new instance of {@link OrderItem} using supplied data and returns it.
     * @param orderItemId orderItemId of the OrderItem
     * @param owner owner of the OrderItem
     * @param services a list containing the services of the OrderItem
     * @return constructed OrderItem instance
     */
    public OrderItem addOrderItem(String orderItemId, String owner, List<ServiceDetailType> services) {
        OrderItem orderItem = new OrderItem();
        orderItem.setOrderItemID(orderItemId);
        orderItem.setOwner(owner);
        for(ServiceDetailType srv: services){
            orderItem.getService().add(srv);
        }

        return orderItem;
    }

    /**
     * Creates a new instance of {@link ServiceDetailType} using supplied data and returns it.
     * @param serviceId serviceId of the ServiceDetailType
     * @param owner owner of the ServiceDetailType
     * @param status status of the ServiceDetailType
     * @return constructed ServiceDetailType instance
     */
    public ServiceDetailType addService(String serviceId, String owner, String status) {
        ServiceDetailType service = new ServiceDetailType();
        service.setServiceID(serviceId);
        service.setOwner(owner);
        service.setServiceStatus(ServiceStatusType.fromValue(status));

        return service;
    }

    /**
     * Builds IATAServiceStatusChangeNotificationRQ instance and returns it.
     * @return constructed IATAServiceStatusChangeNotificationRQ instance
     */
    @Override
    public IATAServiceStatusChangeNotificationRQ build() {
        addRequestAttributes();
        return request;
    }

    /**
     * Adds request attributes to the IATAServiceStatusChangeNotificationRQ instance
     */
    private void addRequestAttributes() {
        request.setVersion(VERSION);
    }


}
