package com.clouway.patterns.factory;

/**
 * @author Krasimir Raikov(raikov.krasimir@gmail.com)
 */
public class Demo extends HousePartProducer {
    public static void main(String[] args) {
        AbstractHousePart floorFactory= HousePartProducer.getFactory(HousePartProducer.FLOOR);
        Floor tileFloor = floorFactory.getFloor(FloorFactory.TILE, 25, 25);
        tileFloor.washFloor();

        AbstractHousePart windowFactory = HousePartProducer.getFactory(HousePartProducer.WINDOW);
        Window woodenWindow = windowFactory.getWindow(WindowFactory.WOOD, 50, 50);
        woodenWindow.openWindow();

        AbstractHousePart doorFactory = HousePartProducer.getFactory(HousePartProducer.DOOR);
        Door woodenDoor = doorFactory.getDoor(DoorFactory.WOOD, 100, 220);
        woodenDoor.openDoor();
    }
}
