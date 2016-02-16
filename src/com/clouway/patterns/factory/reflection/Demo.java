package com.clouway.patterns.factory.reflection;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Demo extends HousePartProducer {
    public static void main(String[] args) {
        AbstractHousePart floorFactory= HousePartProducer.getFactory("floor");
        Floor tileFloor = floorFactory.getFloor("tile", 250, 250);
        tileFloor.washFloor();

        AbstractHousePart doorFactory = HousePartProducer.getFactory("door");
        Door woodenDoor =  doorFactory.getDoor("wood", 100, 220);
        woodenDoor.openDoor();

        AbstractHousePart windowFactory = HousePartProducer.getFactory("window");
        Window woodenWindow = windowFactory.getWindow("wood", 50, 100);
        woodenWindow.openWindow();
    }
}
