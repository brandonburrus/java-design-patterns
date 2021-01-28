package com.brandonburrus.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class Button {

    private final List<EventHandler> handlers;
    private String label;
    private boolean isDisabled;

    public Button(String label, boolean isDisabled) {
        handlers = new ArrayList<>();
        this.label = label;
        this.isDisabled = isDisabled;
    }

    public Button(String label) {
        this(label, false);
    }

    public Button() {
        this("", false);
    }

    public Button addEventHandler(EventHandler handler) {
        handlers.add(handler);
        return this;
    }

    public void click() {
        if (!isDisabled) {
            for (EventHandler handler : handlers) {
                handler.handle();
            }
        }
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public Button setDisabled(boolean disabled) {
        isDisabled = disabled;
        return this;
    }

    public String getLabel() {
        return label;
    }

    public Button setLabel(String label) {
        this.label = label;
        return this;
    }
}

