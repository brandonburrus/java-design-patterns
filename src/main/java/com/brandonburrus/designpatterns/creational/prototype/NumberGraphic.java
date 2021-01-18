package com.brandonburrus.designpatterns.creational.prototype;

public class NumberGraphic implements Graphic {

    private final Number number;

    public NumberGraphic(Number number) {
        this.number = number;
    }


    @Override
    public String render() {
        return number.toString();
    }

    @Override
    public Graphic clone() {
        return new NumberGraphic(number);
    }
}
