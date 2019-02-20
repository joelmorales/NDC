package com.globant.ndc;
import java.io.IOException;

import org.iata.oo.OoClient;
import org.iata.oo.builder.ServiceDeliveryRQBuilder;
import org.iata.oo.schema.ServiceDeliveryRQ.IATAServiceDeliveryRQ;
import org.iata.oo.schema.ServiceDeliveryRS.IATAServiceDeliveryRS;

public class TestClient {

	public static void main( String args[] )
    {
		String api_key = "ne9zq57kbpvaut4z9xxm3aqc";
		String server_url="http://iata.api.mashery.com/Zeus/NDC";
		String server_getUrl="http://iata.api.mashery.com/Zeus/OSIN";
		
		OoClient client = new OoClient(server_url, server_getUrl, api_key);

        IATAServiceDeliveryRQ request = new ServiceDeliveryRQBuilder()
                .addService("BAG")
                .addOrder("A12346SG8")
                .build();

        System.out.println( "Making the call" );

        IATAServiceDeliveryRS response = null;
        try {
            response = client.serviceDelivery(request);
        } catch (IOException e) {
            throw new RuntimeException( "A major failure has occurred!", e );
        }

        // If we get an OrderId, everything was processed correctly by the sandbox
        System.out.println( "OrderId: " + response.getOrder().get(0).getOrderID() );

    }

}
