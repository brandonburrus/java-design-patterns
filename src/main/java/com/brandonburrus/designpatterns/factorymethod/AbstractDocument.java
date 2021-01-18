package com.brandonburrus.designpatterns.factorymethod;

public abstract class AbstractDocument implements Document {

    @Override
    public void save() {
        System.out.println("Saved document contents: " + getDoc());
    }
}
