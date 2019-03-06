package org.iata.configuration;

import java.util.Optional;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class PropertiesReaderHelper {

	private final static String servicePropertiesFile = "service.properties";
	private static Properties properties;
	
	private PropertiesReaderHelper() {
		
	}
	
	static {
		final ClassPathResource resource = new ClassPathResource(servicePropertiesFile);
		try {
			properties = PropertiesLoaderUtils.loadProperties(resource);
		}catch(Exception ex) {
			throw new RuntimeException("Load Properties Error:"+ex.getMessage());
		}
	}
	
	public static String getProperty(final String propertyKey) {
		return Optional.ofNullable(properties.getProperty(propertyKey)).orElseThrow( ()->
		{
			throw new RuntimeException("Property not found");
		});
	}
	
}
