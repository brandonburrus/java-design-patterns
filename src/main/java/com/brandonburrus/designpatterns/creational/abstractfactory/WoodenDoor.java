package com.brandonburrus.designpatterns.creational.abstractfactory;

/**
 * The type Wooden door.
 */
public class WoodenDoor implements Door {

    private boolean isOpen;

    /**
     * Instantiates a new Wooden door.
     *
     * @param isOpen the is open
     */
    public WoodenDoor(boolean isOpen) {
        this.isOpen = isOpen;
    }

    /**
     * Instantiates a new Wooden door.
     */
    public WoodenDoor() {
        this(false);
    }

    @Override
    public void open() {
        isOpen = true;
    }

    @Override
    public void close() {
        isOpen = false;
    }

    @Override
    public void toggleOpenOrClosed() {
        isOpen = !isOpen;
    }

    @Override
    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public OpenableDirection getOpenableDirection() {
        return OpenableDirection.HORIZONTAL;
    }

}
