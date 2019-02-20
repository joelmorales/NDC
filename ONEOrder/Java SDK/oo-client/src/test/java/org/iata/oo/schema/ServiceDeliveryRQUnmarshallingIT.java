package org.iata.oo.schema;

import static org.junit.Assert.assertEquals;

import java.util.*;

import javax.xml.bind.JAXBException;

import org.iata.oo.schema.ServiceDeliveryRQ.IATAServiceDeliveryRQ;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ServiceDeliveryRQUnmarshallingIT extends AbstractUnmarshaller<IATAServiceDeliveryRQ> {

	@Parameters(name = "{index}: {0}")
	public static Collection<String[]> sampleFiles() {
		return Arrays.asList(new String[][] {
			{"/Zeus/ServiceDeliveryRQ_order.xml", "BAG"},
			{"/Zeus/ServiceDeliveryRQ_segment.xml", "MEL"}
		});
	}

	@Parameter
	public String resource;

	@Parameter(value=1)
	public String serviceTypeCode;

	@Test
	public void unmarshal() throws JAXBException {
		IATAServiceDeliveryRQ object = unmarshal(resource, "IATAServiceDeliveryRQ");
		String serviceType = object.getService().get(0).getServiceType().getCode().getValue();
		assertEquals(serviceTypeCode, serviceType);
	}
}