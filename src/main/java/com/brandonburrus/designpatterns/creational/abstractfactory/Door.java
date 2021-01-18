package com.brandonburrus.designpatterns.creational.abstractfactory;

/**
 * The interface Door.
 */
public interface Door {
    /**
     * Open.
     */
    void open();

    /**
     * Close.
     */
    void close();

    /**
     * Toggle open or closed.
     */
    void toggleOpenOrClosed();

    /**
     * Is open boolean.
     *
     * @return the boolean
     */
    boolean isOpen();

    /**
     * Gets openable direction.
     *
     * @return the openable direction
     */
    OpenableDirection getOpenableDirection();
}
