package com.brandonburrus.designpatterns.creational.abstractfactory;

/**
 * The type Abstract factory app.
 */
public class AbstractFactoryApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Door myDoor = DoorFactory.getInstance().create(OpenableDirection.VERTICAL);
        System.out.println(myDoor.getClass().getSimpleName());
    }
}
