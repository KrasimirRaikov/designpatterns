package com.clouway.patterns.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class SoldProducts implements ProductObserver {
    Map<Product, Integer> soldProducts = new HashMap<Product, Integer>();
    private ProductListener listener;

    public SoldProducts(ProductListener listener) {
        this.listener = listener;
        listener.registerObserver(this);
    }

    @Override
    public void bought(Product product, int quantity) {
    }

    @Override
    public void sold(Product product, int quantity) {
        if (soldProducts.containsKey(product)) {
            int currentQuantity = soldProducts.get(product);
            soldProducts.put(product, currentQuantity + quantity);
        } else {
            soldProducts.put(product, quantity);
        }
        System.out.println("Sold " + quantity + " " + product.getName() + "s");
    }
}
