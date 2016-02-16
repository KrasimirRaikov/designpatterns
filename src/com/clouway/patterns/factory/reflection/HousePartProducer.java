package com.clouway.patterns.factory.reflection;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class HousePartProducer {

    public static AbstractHousePart getFactory(String factoryChoice){
        if(factoryChoice.equalsIgnoreCase("DOOR")){
            return new DoorFactory();
        }else if(factoryChoice.equalsIgnoreCase("WINDOW")){
            return new WindowFactory();
        }else if(factoryChoice.equalsIgnoreCase("FLOOR")){
            return new FloorFactory();
        }else throw new IllegalArgumentException("Such factory does not exist: "+factoryChoice);
    }
}
