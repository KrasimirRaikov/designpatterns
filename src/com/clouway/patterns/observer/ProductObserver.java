package com.clouway.patterns.observer;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public interface ProductObserver {

    void bought(Product product, int quantity);

    void sold(Product product, int quantity);
}
