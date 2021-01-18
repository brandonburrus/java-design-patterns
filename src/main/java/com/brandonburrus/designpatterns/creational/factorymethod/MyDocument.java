package com.brandonburrus.designpatterns.creational.factorymethod;

/**
 * The type My document.
 */
public class MyDocument extends AbstractDocument {

    private final String doc;

    /**
     * Instantiates a new My document.
     *
     * @param doc the doc
     */
    public MyDocument(String doc) {
        this.doc = doc;
    }

    @Override
    public String getDoc() {
        return doc;
    }
}
