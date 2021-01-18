package com.brandonburrus.designpatterns.creational.prototype;

/**
 * The interface Graphic.
 */
public interface Graphic {

    /**
     * Render string.
     *
     * @return the string
     */
    String render();
    Graphic clone();

}
