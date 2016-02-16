package com.clouway.patterns.factory.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
            try {
                Constructor tileFloorConstructor = TileFloor.class.getDeclaredConstructor(int.class, int.class);
                return (TileFloor) tileFloorConstructor.newInstance(width, length);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        } else if (material.equalsIgnoreCase("LAMINATE")) {
            try {
                Constructor laminateFloorConstructor = LaminateFloor.class.getDeclaredConstructor(int.class, int.class);
                return (LaminateFloor) laminateFloorConstructor.newInstance(width, length);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }
        throw new IllegalArgumentException("unknown floor material");
    }
}
