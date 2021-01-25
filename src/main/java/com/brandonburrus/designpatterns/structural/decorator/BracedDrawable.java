package com.brandonburrus.designpatterns.structural.decorator;

public class BracedDrawable implements Drawable {

    private final Drawable wrappedDrawable;

    public BracedDrawable(Drawable wrappedDrawable) {
        this.wrappedDrawable = wrappedDrawable;
    }

    @Override
    public void draw() {
        System.out.print("{ ");
        wrappedDrawable.draw();
        System.out.println(" }");
    }

    public Drawable getWrappedDrawable() {
        return wrappedDrawable;
    }
}
