package com.brandonburrus.designpatterns.creational.factorymethod.staticmethod;

/**
 * The type Static method app.
 */
public class StaticMethodApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Text myNumber = Text.fromInt(10);
        System.out.println("My number is " + myNumber);
    }
}
