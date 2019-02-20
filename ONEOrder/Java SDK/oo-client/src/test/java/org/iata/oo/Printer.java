package org.iata.oo;

import org.iata.oo.schema.OrderSaleInformationNotificationRQ.IATAOrderSaleInformationNotificationRQ;
import org.iata.oo.schema.ServiceDeliveryRS.IATAServiceDeliveryRS;
import org.iata.oo.schema.ServiceDeliveryRS.OrderCoreType;
import org.iata.oo.schema.ServiceDeliveryRS.OrderItem;
import org.iata.oo.schema.ServiceDeliveryRS.ServiceDetailType;

/**
 * This class provides a simple way to print the essential information of each response message.
 */
public class Printer {
    static void printData(IATAServiceDeliveryRS response){
        if(response!=null && response.getOrder()!=null && !response.getOrder().isEmpty()){
            for(OrderCoreType order : response.getOrder()){
                System.out.println("OrderId: "+order.getOrderID());
                for(OrderItem orderitem: order.getOrderItem()){
                    System.out.println("\tOrderItemId: "+orderitem.getOrderItemID());
                    for(ServiceDetailType srv: orderitem.getService()){
                        if(srv.getServiceID()!=null)	System.out.println("\t\tServiceId: "+srv.getServiceID());
                        if(srv.getServiceSelection().getServiceDefinition().getName().getValue()!=null)
                            System.out.println("\t\tName: "+srv.getServiceSelection().getServiceDefinition().getName().getValue());
                        if(srv.getOfferValidDates().getStart().getTimestamp()!=null)
                            System.out.println("\t\tStart Date : "+srv.getOfferValidDates().getStart().getTimestamp());
                        if(srv.getOfferValidDates().getEnd().getTimestamp()!=null)
                            System.out.println("\t\tEnd Date : "+srv.getOfferValidDates().getEnd().getTimestamp());
                        System.out.println("");
                    }
                }
            }
            System.out.println("");
        }else if(response.getError()!=null){
            System.out.println("Error response: "+response.getError().getValue());
        }else{
            System.out.println("Null response.");
        }
    }

    static void printData(String message){
        int start = message.indexOf("<StatusCode>");
        int end = message.indexOf("</StatusCode>");
        int startMsg = message.indexOf("<StatusMessage>");
        int endMsg = message.indexOf("</StatusMessage>");
        System.out.println("Status: "+message.substring(start+12, end)+"\nMessage: "+message.substring(startMsg+15, endMsg));
    }

    static void printData(IATAOrderSaleInformationNotificationRQ response){
        int srvCounter = 0;
        if(response!=null && response.getOrder()!=null && !response.getOrder().isEmpty()){
            for(org.iata.oo.schema.OrderSaleInformationNotificationRQ.OrderCoreType order: response.getOrder()) {
                System.out.println("OrderId: " +order.getOrderID());
                if(order.getTotalOrderPrice().getSimpleCurrencyPrice().getValue()!=null
                        && order.getTotalOrderPrice().getSimpleCurrencyPrice().getCode()!=null){
                    System.out.println("Total Price: " +order.getTotalOrderPrice().getSimpleCurrencyPrice().getValue().toString()
                            +" "+order.getTotalOrderPrice().getSimpleCurrencyPrice().getCode());
                }

                for(org.iata.oo.schema.OrderSaleInformationNotificationRQ.OrderItem orderItem: order.getOrderItem()){
                    if(orderItem.getService()!=null )	srvCounter += orderItem.getService().size();
                }
            }
            System.out.println("Found " +srvCounter+" services.");
        }else if(response!=null){
            System.out.println("Error response..."); //todo
        }else{
            System.out.println("Null response.");
        }
    }
}
