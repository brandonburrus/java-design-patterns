package com.brandonburrus.designpatterns.structural.decorator;

public class SmileyFace implements Drawable {
    @Override
    public void draw() {
        System.out.print(":)");
    }
}
