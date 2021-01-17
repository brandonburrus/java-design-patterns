package com.brandonburrus.designpatterns.abstractfactory;

public class DoorFactory implements Factory<Door> {

    private static final DoorFactory instance;

    static {
        instance = new DoorFactory();
    }

    private DoorFactory() {}

    public static DoorFactory getInstance() {
        return instance;
    }

    @Override
    public Door create() {
        return new WoodenDoor();
    }

    public Door create(OpenableDirection openableDirection) {
        return switch (openableDirection) {
            case VERTICAL -> new TrapDoor();
            case HORIZONTAL -> new WoodenDoor();
        };
    }
}
