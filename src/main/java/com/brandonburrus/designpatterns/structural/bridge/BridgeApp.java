package com.brandonburrus.designpatterns.structural.bridge;

// Bridge: prefer abstract interface structures first, and then add bridge impls
public class BridgeApp {

    public static void main(String[] args) {
        Shape redSquare = new Square(new RedColor(), 2, 4);
        Shape blueCircle = new Circle(new BlueColor(), 10);

        System.out.println("Squares color is " + redSquare.getColor().getName());
        System.out.println("Circles color is " + blueCircle.getColor().getName());
    }
}
