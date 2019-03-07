package org.iata.oo.builder;

import org.iata.configuration.AppPropertyKeys;
import org.iata.configuration.PropertiesReaderHelper;

/**
 *
 * Interface for all builders
 */
public interface Buildable<T> {
    
    String VERSION = PropertiesReaderHelper.getProperty(AppPropertyKeys.IATA_VERSION);
    
    T build();
}
