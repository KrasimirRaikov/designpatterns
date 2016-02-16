package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class WindowFactory extends AbstractHousePart {
    public final static int METAL = 1;
    public final static int WOOD = 2;


    @Override
    public Door getDoor(int material, int width, int height) {
        return null;
    }

    @Override
    public Window getWindow(int material, int width, int height) {
        if (material==METAL){
            return new MetalWindow(width, height);
        }else if(material==WOOD){
            return new WoodenWindow(width, height);
        }else throw new IllegalArgumentException("There is no such material for windows");
    }

    @Override
    public Floor getFloor(int material, int width, int length) {
        return null;
    }
}
