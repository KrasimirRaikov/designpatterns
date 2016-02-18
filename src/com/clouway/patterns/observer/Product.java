package com.clouway.patterns.observer;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Product {

    private final String name;
    private final double price;

    public Product(String name, double price) {

        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " that cost " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        return name.equals(product.name);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public String getName() {
        return name;
    }
}
