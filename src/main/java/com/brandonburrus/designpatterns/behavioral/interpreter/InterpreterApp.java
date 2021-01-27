package com.brandonburrus.designpatterns.behavioral.interpreter;

public class InterpreterApp {

    public static void main(String[] args) {

        MathNode mathAST = new AdditionNode(
            new SubtractionNode(
                new NumberNode(30),
                new NumberNode(15)
            ),
            new NegativeNode(
                new NumberNode(10)
            )
        );

        System.out.println(mathAST.evaluate());

    }
}
