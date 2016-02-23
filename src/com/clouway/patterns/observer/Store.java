package com.clouway.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Store {
    List<ProductObserver> observers = new ArrayList<ProductObserver>();



    public void bought(Product product, int quantity) {
        for (ProductObserver observer : observers) {
            observer.bought(product, quantity);
        }
    }

    public void sold(Product product, int quantity) {
        for (ProductObserver observer : observers) {
            observer.sold(product, quantity);
        }
    }

    public void registerObserver(ProductObserver observer) {
        observers.add(observer);
    }

}
