package com.brandonburrus.designpatterns.structural.facade.complex;

// Wrap a group of complex objects together and provide convenience methods to use them
public class Complex {

    private static final Printer printer;
    private static final Inputter inputter;

    static {
        printer = new Printer();
        inputter = new Inputter();
    }

    private Complex() {}

    public static void handleUserAction() {
        printer.print("Enter your name: ");
        String name = inputter.getInput();
        printer.print("You have a nice name, " + name);
    }
}
