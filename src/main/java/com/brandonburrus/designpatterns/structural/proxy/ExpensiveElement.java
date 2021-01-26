package com.brandonburrus.designpatterns.structural.proxy;

public class ExpensiveElement implements Element {
    public ExpensiveElement() {
        System.out.println("Expensive element was created");
    }

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
}
