package com.brandonburrus.designpatterns.abstractfactory;

public interface Door {
    void open();
    void close();
    void toggleOpenOrClosed();
    boolean isOpen();
    OpenableDirection getOpenableDirection();
}
