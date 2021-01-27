package com.brandonburrus.designpatterns.behavioral.interpreter;

public class AdditionNode implements MathNode {

    private final MathNode leftNode;
    private final MathNode rightNode;

    public AdditionNode(MathNode leftNode, MathNode rightNode) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    @Override
    public double evaluate() {
        return leftNode.evaluate() + rightNode.evaluate();
    }
}
