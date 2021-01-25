package com.brandonburrus.designpatterns.structural.bridge;

public class Circle implements Shape {

    private Color color;
    private double radius;

    public Circle(Color color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
