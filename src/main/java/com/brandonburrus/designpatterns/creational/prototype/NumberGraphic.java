package com.brandonburrus.designpatterns.creational.prototype;

/**
 * The type Number graphic.
 */
public class NumberGraphic implements Graphic {

    private final Number number;

    /**
     * Instantiates a new Number graphic.
     *
     * @param number the number
     */
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
