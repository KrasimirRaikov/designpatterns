package com.clouway.patterns.factory.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class DoorFactory extends AbstractHousePart {

    @Override
    public Door getDoor(String material, int width, int height) {
        if (material.equalsIgnoreCase("METAl")) {
            try {
                Constructor alumDoorConstructor = AluminiumDoor.class.getDeclaredConstructor(int.class, int.class);
                return (AluminiumDoor) alumDoorConstructor.newInstance(width, height);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } else if (material.equalsIgnoreCase("WOOD")) {
            try {
                Constructor woodenDoorConstructor = WoodenDoor.class.getDeclaredConstructor(int.class, int.class);
                return (WoodenDoor) woodenDoorConstructor.newInstance(width, height);
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
        throw new IllegalArgumentException("Unknown material");

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
