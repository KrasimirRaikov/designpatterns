package com.clouway.patterns.factory.reflection;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public abstract class AbstractHousePart {

    abstract public Door getDoor(String material, int width, int height);

    abstract public Window getWindow(String material, int width, int height);

    abstract public Floor getFloor(String material, int width, int length);
}
