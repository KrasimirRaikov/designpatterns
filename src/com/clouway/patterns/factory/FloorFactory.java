package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class FloorFactory extends AbstractHousePart {
    @Override
    public Door getDoor(String material, int width, int height) {
        return null;
    }

    @Override
    public Window getWindow(String material, int width, int height) {
        return null;
    }

    @Override
    public Floor getFloor(String material, int width, int length) {
        if (material.equalsIgnoreCase("TILE")) {
            return new TileFloor(width, length);
        } else if (material.equalsIgnoreCase("LAMINATE")) {
            return new LaminateFloor(width, length);
        } else throw new IllegalArgumentException("unknown floor material");
    }
}
