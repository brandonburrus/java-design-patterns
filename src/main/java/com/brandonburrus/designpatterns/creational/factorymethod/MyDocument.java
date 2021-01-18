package com.brandonburrus.designpatterns.creational.factorymethod;

public class MyDocument extends AbstractDocument {

    private final String doc;

    public MyDocument(String doc) {
        this.doc = doc;
    }

    @Override
    public String getDoc() {
        return doc;
    }
}
