package com.clouway.patterns.proxy;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class IntegerFactory {


    public Integer createInstance(int integer) {
        return new IntegerProxy(integer);
    }
}
