package com.brandonburrus.designpatterns.creational.abstractfactory;

/**
 * The type Trap door.
 */
public class TrapDoor implements Door {

    private boolean isOpen;

    /**
     * Instantiates a new Trap door.
     *
     * @param isOpen the is open
     */
    public TrapDoor(boolean isOpen) {
        this.isOpen = isOpen;
    }

    /**
     * Instantiates a new Trap door.
     */
    public TrapDoor() {
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
        return OpenableDirection.VERTICAL;
    }
}
