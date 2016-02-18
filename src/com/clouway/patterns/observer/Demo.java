package com.clouway.patterns.observer;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        ProductListener listener = new ProductListener();
        AvailableProducts availableProducts = new AvailableProducts(listener);
        SoldProducts soldProducts = new SoldProducts(listener);

        Product apple = new Product("Apple", 3);
        Product chair = new Product("Chair", 15);

        listener.bought(apple, 12);
        listener.sold(apple, 10);

        listener.bought(chair, 20);
        listener.sold(chair, 13);

    }
}
