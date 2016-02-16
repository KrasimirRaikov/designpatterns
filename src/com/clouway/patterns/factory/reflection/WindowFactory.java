package com.clouway.patterns.factory.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
            try {
                Constructor metalWindowConstructor= MetalWindow.class.getDeclaredConstructor(int.class, int.class);
                return (MetalWindow) metalWindowConstructor.newInstance(width, height);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }else if(material.equalsIgnoreCase("WOOD")){
            try {
                Constructor woodenWindowConstructor= WoodenWindow.class.getDeclaredConstructor(int.class, int.class);
                return (WoodenWindow) woodenWindowConstructor.newInstance(width, height);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } throw new IllegalArgumentException("There is no such material for windows");
    }

    @Override
    public Floor getFloor(String material, int width, int length) {
        return null;
    }
}
