package com.brandonburrus.designpatterns.structural.composite;

public class CompositeApp {

    public static void main(String[] args) {
        Component componentTree = new Container(
            new RedComponent(),
            new Container(
                new BlueComponent()
            )
        );
        System.out.println(componentTree.toString());
    }
}
