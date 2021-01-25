package com.brandonburrus.designpatterns.structural.decorator;

public class DecoratorApp {

    public static void main(String[] args) {
        Drawable bracedSmiley = new BracedDrawable(new SmileyFace());
        bracedSmiley.draw();
        System.out.println();
    }
}
