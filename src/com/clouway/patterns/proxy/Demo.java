package com.clouway.patterns.proxy;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Demo {

    public static void main(String[] args) {
        IntegerFactory integerFactory = new IntegerFactory();
        Integer integer = integerFactory.createInstance(15);

        System.out.println(integer.integerAsString());
    }
}
