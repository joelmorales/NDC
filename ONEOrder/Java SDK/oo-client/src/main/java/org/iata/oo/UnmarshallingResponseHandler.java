package org.iata.oo;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.bind.*;
import org.apache.http.HttpEntity;
import org.apache.http.client.ResponseHandler;
import org.apache.http.impl.client.AbstractResponseHandler;

class UnmarshallingResponseHandler<T> extends AbstractResponseHandler<T> implements ResponseHandler<T> {

	private String type;
	public UnmarshallingResponseHandler(String method, boolean isPost) {
		if(isPost)	this.type=method+"RS";
		else	this.type=method+"RQ";
	}



	@Override
	public T handleEntity(HttpEntity entity) throws IOException {
		return unmarshallRequest(entity.getContent());
	}

	@SuppressWarnings("unchecked")
	private T unmarshallRequest(InputStream response) {
		try {

			JAXBContext context = OoClient.getJaxbContext(type);

			Unmarshaller unmarshaller = context.createUnmarshaller();
			return (T) unmarshaller.unmarshal(response);
		} catch (JAXBException e) {
			throw new ClientException(e);
		}
	}

}
