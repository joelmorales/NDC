package org.iata.oo.schema;

import java.io.InputStream;
import javax.xml.bind.*;
import org.iata.oo.OoClient;

abstract class AbstractUnmarshaller<T> {

	public T unmarshal(String resource, String messageName) throws JAXBException {
		InputStream inputStream = this.getClass().getResourceAsStream(resource);
		JAXBContext context = OoClient.getJaxbContext(messageName);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return (T) unmarshaller.unmarshal(inputStream);

	}

}
