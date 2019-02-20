package org.iata.oo.schema;

import org.iata.oo.schema.ServiceDeliveryRS.IATAServiceDeliveryRS;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import javax.xml.bind.JAXBException;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ServiceDeliveryRSUnmarshallingIT extends AbstractUnmarshaller<IATAServiceDeliveryRS> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Zeus/ServiceDeliveryRS.xml", "D127V5"}
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String orderId;

	@Test
	public void unmarshal() throws JAXBException {
		IATAServiceDeliveryRS object = unmarshal(resource, "IATAServiceDeliveryRS");
		String orderId = object.getOrder().get(0).getOrderID();
		assertEquals(this.orderId, orderId);
	}
}