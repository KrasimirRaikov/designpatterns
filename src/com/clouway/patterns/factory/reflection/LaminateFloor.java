package com.clouway.patterns.factory.reflection;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class LaminateFloor implements Floor {
    private final int width;
    private final int length;

    public LaminateFloor(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getLenght() {
        return length;
    }

    @Override
    public void washFloor() {
        System.out.println("Washing the laminate floor");
    }
}
