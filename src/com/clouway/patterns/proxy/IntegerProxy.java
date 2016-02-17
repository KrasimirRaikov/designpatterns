package com.clouway.patterns.proxy;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class IntegerProxy implements Integer {

    private int integer;
    private RealInteger realInteger;

    public IntegerProxy(int integer) {
        this.integer = integer;
    }

    @Override
    public String integerAsString() {
        if (realInteger == null) {
            realInteger = new RealInteger(integer);
        }
        return realInteger.integerAsString();
    }
}
