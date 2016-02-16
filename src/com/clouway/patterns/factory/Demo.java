package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Demo extends HousePartProducer {
    public static void main(String[] args) {
        AbstractHousePart floorFactory= HousePartProducer.getFactory("floor");
        Floor tileFloor = floorFactory.getFloor("tile", 25, 25);
        tileFloor.washFloor();
    }
}
