package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public abstract class AluminiumDoor extends AbstractHousePart implements Door {
    private final int width;
    private final int height;

    public AluminiumDoor(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void openDoor() {
        System.out.println("Opening the aluminium door.");
    }

    @Override
    public void closeDoor() {
        System.out.println("Closing the aluminium door");
    }
}
