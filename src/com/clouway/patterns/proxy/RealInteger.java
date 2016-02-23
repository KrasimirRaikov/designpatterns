package com.clouway.patterns.proxy;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class RealInteger implements Integer {
    private int integer;

    public RealInteger(int integer) {
        this.integer = integer;
    }

    @Override
    public String integerAsString() {
        return "real integer: "+ integer;
    }
}
