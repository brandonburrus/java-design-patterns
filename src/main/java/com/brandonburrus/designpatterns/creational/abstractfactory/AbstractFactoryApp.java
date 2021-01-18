package com.brandonburrus.designpatterns.creational.abstractfactory;

public class AbstractFactoryApp {

    public static void main(String[] args) {
        Door myDoor = DoorFactory.getInstance().create(OpenableDirection.VERTICAL);
        System.out.println(myDoor.getClass().getSimpleName());
    }
}
