package com.brandonburrus.designpatterns.behavioral.visitor;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public int getNumberOfLegs() {
        return 4;
    }

    @Override
    public String getName() {
        return name;
    }

    public void rename(String newName) {
        this.name = newName;
    }
}
