package com.clouway.patterns.factory.reflection;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class WoodenDoor implements Door {
    private final int width;
    private final int height;

    public WoodenDoor(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void openDoor() {
        System.out.println("Wooden door opening");
    }

    @Override
    public void closeDoor() {
        System.out.println("Wooden door closing");
    }
}
