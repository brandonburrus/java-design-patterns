package com.brandonburrus.designpatterns.abstractfactory;

public class TrapDoor implements Door {

    private boolean isOpen;

    public TrapDoor(boolean isOpen) {
        this.isOpen = isOpen;
    }

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
