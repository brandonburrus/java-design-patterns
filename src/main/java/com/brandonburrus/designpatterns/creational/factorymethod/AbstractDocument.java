package com.brandonburrus.designpatterns.creational.factorymethod;

/**
 * The type Abstract document.
 */
public abstract class AbstractDocument implements Document {

    @Override
    public void save() {
        System.out.println("Saved document contents: " + getDoc());
    }
}
