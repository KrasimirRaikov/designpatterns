package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class MetalWindow implements Window {
    private final int width;
    private final int height;

    public MetalWindow(int width, int height) {
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
        System.out.println("Opening metal window");
    }

    @Override
    public void closeWindow() {
        System.out.println("Closing metal window");
    }
}
