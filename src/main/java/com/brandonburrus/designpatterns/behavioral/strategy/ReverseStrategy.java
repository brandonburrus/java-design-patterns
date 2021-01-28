package com.brandonburrus.designpatterns.behavioral.strategy;

@FunctionalInterface
public interface ReverseStrategy<T> {

    T[] reverse(T[] arr);
}
