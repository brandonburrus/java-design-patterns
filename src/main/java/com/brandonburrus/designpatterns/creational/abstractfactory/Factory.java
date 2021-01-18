package com.brandonburrus.designpatterns.creational.abstractfactory;

/**
 * The interface Factory.
 *
 * @param <T> the type parameter
 */
public interface Factory<T> {
    /**
     * Create t.
     *
     * @return the t
     */
    T create();
}
