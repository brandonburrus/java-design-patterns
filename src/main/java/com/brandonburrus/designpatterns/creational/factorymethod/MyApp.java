package com.brandonburrus.designpatterns.creational.factorymethod;

public class MyApp extends AbstractApp {
    @Override
    public Document newDocument() {
        return new MyDocument("Empty document");
    }
}
