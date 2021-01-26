package com.brandonburrus.designpatterns.structural.proxy;

public class ElementImpl implements Element {
    public ElementImpl() {
        System.out.println("Created element");
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
