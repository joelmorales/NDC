package org.iata.oo.builder;

/**
 *
 * Interface for all builders
 */
public interface Buildable<T> {
    
    String VERSION = "IATA2017.1";
    
    T build();
}
