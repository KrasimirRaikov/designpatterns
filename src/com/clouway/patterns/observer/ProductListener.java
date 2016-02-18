package com.clouway.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class ProductListener {
    List<ProductObserver> boughtObservers = new ArrayList<ProductObserver>();
    List<ProductObserver> soldObservers = new ArrayList<ProductObserver>();


    public void bought(Product product, int quantity) {
        for (ProductObserver observer : boughtObservers) {
            observer.bought(product, quantity);
        }
    }

    public void sold(Product product, int quantity) {
        for (ProductObserver observer : soldObservers) {
            observer.sold(product, quantity);
        }
    }

    public void registerObserverOnBought(ProductObserver observer) {
        boughtObservers.add(observer);
    }

    public void registerObserverOnSold(ProductObserver observer) {
        soldObservers.add(observer);
    }
}
