# One Order Java SDK

This is a Java project which wraps OneOrder-compliant API.

## Installation
mvn install -DskipTests

## Usage

Add the following dependency to your project's dependencies
```
    <dependency>
      <groupId>org.iata.oo</groupId>
      <artifactId>oo-client</artifactId>
      <version>0.1.0-SNAPSHOT</version>
      <scope>compile</scope>
    </dependency>
```


Add oo-client to project dependencies

Request sample
```java
import java.io.IOException;
import org.iata.oo.*;
import org.iata.oo.builder.ServiceDeliveryRQBuilder;
import org.iata.oo.schema.ServiceDeliveryRQ.IATAServiceDeliveryRQ;
import org.iata.oo.schema.ServiceDeliveryRS.IATAServiceDeliveryRS;


public class TestClient
{
    public static void main( String args[] )
    {
        OoClient client = new OoClient("http://zeus_url", "http://zeus_url_for_orderInformationRequest", "apiKey");

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

```
Available builders are:
* ServiceDeliveryRQBuilder
* ServiceStatusChangeNotifRQBuilder
