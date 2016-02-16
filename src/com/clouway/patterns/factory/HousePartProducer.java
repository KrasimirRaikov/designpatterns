package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class HousePartProducer {
    public final static int DOOR = 1;
    public final static int WINDOW = 2;
    public final static int FLOOR = 3;

    public static AbstractHousePart getFactory(int factoryChoice){
        if(factoryChoice== DOOR){
            return new DoorFactory();
        }else if(factoryChoice==WINDOW){
            return new WindowFactory();
        }else if(factoryChoice==FLOOR){
            return new FloorFactory();
        }else throw new IllegalArgumentException("Such factory does not exist: "+factoryChoice);
    }
}
