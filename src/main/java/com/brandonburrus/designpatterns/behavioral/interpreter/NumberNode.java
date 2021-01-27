package com.brandonburrus.designpatterns.behavioral.interpreter;

public class NumberNode implements MathNode {

    private final double value;

    public NumberNode(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
