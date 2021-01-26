package com.brandonburrus.designpatterns.structural.proxy;

public class ExpensiveElementProxy implements Element {

    private Element underlyingElement = null;

    public ExpensiveElementProxy() {
        System.out.println("Expensive element proxy was created");
    }

    @Override
    public String getName() {
        System.out.println("Accessing expensive element name");
        if (underlyingElement == null) {
            underlyingElement = new ExpensiveElement();
        }
        return underlyingElement.getName();
    }
}
