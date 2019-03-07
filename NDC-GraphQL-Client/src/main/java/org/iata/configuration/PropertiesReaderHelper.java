package org.iata.configuration;

import java.util.Optional;
import java.util.Properties;

import org.iata.crosscutting.exception.ApplicationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class PropertiesReaderHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(PropertiesReaderHelper.class);
	private final static String servicePropertiesFile = "service.properties";
	private static Properties properties;
	
	private PropertiesReaderHelper() {
		
	}
	
	static {
		final ClassPathResource resource = new ClassPathResource(servicePropertiesFile);
		try {
			properties = PropertiesLoaderUtils.loadProperties(resource);
		}catch(Exception ex) {
			throw new ApplicationException("Load Properties Error:"+ex.getMessage());
		}
	}
	
	public static String getProperty(final String propertyKey) {
		LOGGER.info("Get Property for:"+propertyKey);
		return Optional.ofNullable(properties.getProperty(propertyKey)).orElseThrow(()->
			 new ApplicationException("Property not found.")
		);
	}
	
}
