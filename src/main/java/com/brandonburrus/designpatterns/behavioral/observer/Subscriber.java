package com.brandonburrus.designpatterns.behavioral.observer;

@FunctionalInterface
public interface Subscriber<T> {

    void onNext(T value);
}
