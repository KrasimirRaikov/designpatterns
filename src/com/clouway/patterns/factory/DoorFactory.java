package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class DoorFactory extends AbstractHousePart {
    public final static int METAL = 1;
    public final static int WOOD = 2;

    @Override
    public Door getDoor(int material, int width, int height) {
        if(material==METAL){
            return new AluminiumDoor(width, height);
        }else if(material==WOOD){
            return new WoodenDoor(width, height);
        }else{
            throw new IllegalArgumentException("Unknown material");
        }
    }

    @Override
    public Window getWindow(int material, int width, int height) {
        return null;
    }

    @Override
    public Floor getFloor(int material, int width, int length) {
        return null;
    }
}
