package com.clouway.patterns.singleton;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        Singleton singleton= Singleton.getInstance();
        Singleton.getInstance();
    }
}
