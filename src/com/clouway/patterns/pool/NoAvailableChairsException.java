package com.clouway.patterns.pool;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class NoAvailableChairsException extends Exception {
    public NoAvailableChairsException(String message) {
        super(message);
    }
}
