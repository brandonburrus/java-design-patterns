package com.brandonburrus.designpatterns.behavioral.command;

public class Button {

    private final Command clickHandler;

    public Button(Command clickHandler) {
        this.clickHandler = clickHandler;
    }

    public void click() {
        clickHandler.execute();
    }
}
