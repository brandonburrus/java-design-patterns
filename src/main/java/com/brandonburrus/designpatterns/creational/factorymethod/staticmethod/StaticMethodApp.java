package com.brandonburrus.designpatterns.creational.factorymethod.staticmethod;

public class StaticMethodApp {

    public static void main(String[] args) {
        Text myNumber = Text.fromInt(10);
        System.out.println("My number is " + myNumber);
    }
}
