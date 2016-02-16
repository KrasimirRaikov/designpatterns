package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class WoodenWindow implements Window {
    private final int width;
    private final int height;

    public WoodenWindow(int width, int height) {
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
    public void openWindow() {
        System.out.println("Opening wooden window");
    }

    @Override
    public void closeWindow() {
        System.out.println("Closing wooden window");
    }
}
