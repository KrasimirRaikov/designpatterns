package com.clouway.patterns.observer;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Store store = new Store();
        store.registerObserver(new SoldProducts());
        store.registerObserver(new AvailableProducts());

        Product apple = new Product("Apple", 3);
        Product chair = new Product("Chair", 15);

        store.bought(apple, 12);
        store.sold(apple, 10);

        store.bought(chair, 20);
        store.sold(chair, 13);

    }
}
