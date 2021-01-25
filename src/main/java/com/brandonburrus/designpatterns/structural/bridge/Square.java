package com.brandonburrus.designpatterns.structural.bridge;

public class Square implements Shape {

    private Color color;
    private double length;
    private double width;

    public Square(Color color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    @Override
    public Color getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }
}
