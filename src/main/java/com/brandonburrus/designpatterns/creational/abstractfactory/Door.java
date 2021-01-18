package com.brandonburrus.designpatterns.creational.abstractfactory;

public interface Door {
    void open();
    void close();
    void toggleOpenOrClosed();
    boolean isOpen();
    OpenableDirection getOpenableDirection();
}
