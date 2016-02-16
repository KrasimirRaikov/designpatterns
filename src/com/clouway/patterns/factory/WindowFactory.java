package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class WindowFactory extends AbstractHousePart {
    @Override
    public Door getDoor(String material, int width, int height) {
        return null;
    }

    @Override
    public Window getWindow(String material, int width, int height) {
        if (material.equalsIgnoreCase("METAL")){
            return new MetalWindow(width, height);
        }else if(material.equalsIgnoreCase("WOODEN")){
            return new WoodenWindow(width, height);
        }else throw new IllegalArgumentException("There is no such material for windows");
    }

    @Override
    public Floor getFloor(String material, int width, int length) {
        return null;
    }
}
