package com.clouway.patterns.singleton;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Singleton {
    private static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
        System.out.println("Singleton created");
    }
}
