package com.brandonburrus.designpatterns.behavioral.observer;

public interface Subscribable<T> {

    Subscription<T> subscribe(Subscriber<T> subscriber);
}
