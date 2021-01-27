package com.brandonburrus.designpatterns.behavioral.interpreter;

public class SubtractionNode implements MathNode {

    private final MathNode leftNode;
    private final MathNode rightNode;

    public SubtractionNode(MathNode leftNode, MathNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public double evaluate() {
        return leftNode.evaluate() - rightNode.evaluate();
    }
}
