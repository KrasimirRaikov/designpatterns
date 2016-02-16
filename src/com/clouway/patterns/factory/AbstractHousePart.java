package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public abstract class AbstractHousePart {

    abstract public Door getDoor(int material, int width, int height);

    abstract public Window getWindow(int material, int width, int height);

    abstract public Floor getFloor(int material, int width, int length);
}
