package com.brandonburrus.designpatterns.behavioral.interpreter;

public class NegativeNode implements MathNode {

    private final MathNode node;

    public NegativeNode(double value) {
        this.node = new NumberNode(value);
    }

    public NegativeNode(MathNode node) {
        this.node = node;
    }

    @Override
    public double evaluate() {
        return -node.evaluate();
    }
}
