package com.brandonburrus.designpatterns.creational.abstractfactory;

public class WoodenDoor implements Door {

    private boolean isOpen;

    public WoodenDoor(boolean isOpen) {
        this.isOpen = isOpen;
    }

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
