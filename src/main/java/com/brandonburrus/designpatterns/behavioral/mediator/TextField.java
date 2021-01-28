package com.brandonburrus.designpatterns.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TextField {

    private final List<Consumer<String>> handlers;
    private String textContent;
    private boolean isDisabled;

    public TextField(String initialContent, boolean isDisabled) {
        this.handlers = new ArrayList<>();
        this.textContent = initialContent;
        this.isDisabled = isDisabled;
    }

    public TextField(String initialContent) {
        this(initialContent, false);
    }

    public TextField() {
        this("", false);
    }

    public TextField addInputChangedHandler(Consumer<String> handler) {
        this.handlers.add(handler);
        return this;
    }

    public String getTextContent() {
        return textContent;
    }

    public TextField setTextContent(String textContent) {
        if (!isDisabled) {
            this.textContent = textContent;
            for (Consumer<String> handler : handlers) {
                handler.accept(this.textContent);
            }
        }
        return this;
    }

    public TextField addToTextContent(String additionalContent) {
        if (!isDisabled) {
            this.textContent += additionalContent;
            for (Consumer<String> handler : handlers) {
                handler.accept(this.textContent);
            }
        }
        return this;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public TextField setDisabled(boolean disabled) {
        isDisabled = disabled;
        return this;
    }
}
