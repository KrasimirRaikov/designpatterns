package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class DoorFactory extends AbstractHousePart {

    @Override
    public Door getDoor(String material, int width, int height) {
        if(material.equalsIgnoreCase("METAl")){
            return new AluminiumDoor(width, height);
        }else if(material.equalsIgnoreCase("WOOD")){
            return new WoodenDoor(width, height);
        }else{
            throw new IllegalArgumentException("Unknown material");
        }
    }

    @Override
    public Window getWindow(String material, int width, int height) {
        return null;
    }

    @Override
    public Floor getFloor(String material, int width, int length) {
        return null;
    }
}
