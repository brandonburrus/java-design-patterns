package com.brandonburrus.designpatterns.creational.abstractfactory;

/**
 * The type Door factory.
 */
public class DoorFactory implements Factory<Door> {

    private static final DoorFactory instance;

    static {
        instance = new DoorFactory();
    }

    private DoorFactory() {}

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static DoorFactory getInstance() {
        return instance;
    }

    @Override
    public Door create() {
        return new WoodenDoor();
    }

    /**
     * Create door.
     *
     * @param openableDirection the openable direction
     *
     * @return the door
     */
    public Door create(OpenableDirection openableDirection) {
        return switch (openableDirection) {
            case VERTICAL -> new TrapDoor();
            case HORIZONTAL -> new WoodenDoor();
        };
    }
}
