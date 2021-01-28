package com.brandonburrus.designpatterns.behavioral.observer;

public interface Subscription<T> {

    void unsubscribe();
    Subscriber<T> getSubscriber();
}
