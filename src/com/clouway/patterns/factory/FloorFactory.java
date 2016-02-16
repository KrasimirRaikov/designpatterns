package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class FloorFactory extends AbstractHousePart {
    public final static int TILE = 1;
    public final static int LAMINATE= 2;
    @Override
    public Door getDoor(int material, int width, int height) {
        return null;
    }

    @Override
    public Window getWindow(int material, int width, int height) {
        return null;
    }

    @Override
    public Floor getFloor(int material, int width, int length) {
        if (material==TILE) {
            return new TileFloor(width, length);
        } else if (material==LAMINATE) {
            return new LaminateFloor(width, length);
        } else throw new IllegalArgumentException("unknown floor material");
    }
}
