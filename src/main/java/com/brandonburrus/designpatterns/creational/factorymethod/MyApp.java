package com.brandonburrus.designpatterns.creational.factorymethod;

/**
 * The type My app.
 */
public class MyApp extends AbstractApp {
    @Override
    public Document newDocument() {
        return new MyDocument("Empty document");
    }
}
