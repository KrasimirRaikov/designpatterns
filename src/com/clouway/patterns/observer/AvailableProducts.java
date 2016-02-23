package com.clouway.patterns.observer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class AvailableProducts implements ProductObserver {

    private Map<Product, Integer> availableProducts = new HashMap<Product, Integer>();

    @Override
    public void bought(Product product, int quantity) {
        if (availableProducts.containsKey(product)) {
            int currentQuantity = availableProducts.get(product);
            availableProducts.put(product, currentQuantity + quantity);
        } else {
            availableProducts.put(product, quantity);
        }
        System.out.println("Bought " + quantity + " " + product.getName() + "s");
    }

    @Override
    public void sold(Product product, int quantity) {
        int quantityUntilNow = availableProducts.get(product);
        if (quantityUntilNow < quantity) {
            availableProducts.put(product, quantityUntilNow - quantity);
        } else {
            availableProducts.remove(product);
        }
    }
}
