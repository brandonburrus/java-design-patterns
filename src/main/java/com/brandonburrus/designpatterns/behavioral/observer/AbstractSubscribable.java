package com.brandonburrus.designpatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractSubscribable<T> implements Subscribable<T> {

    private final Set<Subscription<T>> subscriptions;

    protected AbstractSubscribable() {
        subscriptions = new HashSet<>();
    }

    @Override
    public Subscription<T> subscribe(Subscriber<T> subscriber) {
        Subscription<T> subscription = new Subscription<>() {
            @Override
            public void unsubscribe() {
                subscriptions.remove(this);
            }

            @Override
            public Subscriber<T> getSubscriber() {
                return subscriber;
            }
        };

        subscriptions.add(subscription);
        return subscription;
    }

    protected void next(T value) {
        subscriptions.forEach(subscription -> subscription.getSubscriber().onNext(value));
    }
}
