package com.brandonburrus.designpatterns.behavioral.observer;

import java.util.Optional;

public class Subject<T> extends AbstractSubscribable<T> {

    private T value;

    public Optional<T> getValue() {
        return Optional.of(value);
    }

    @Override
    protected void next(T value) {
        super.next(value);
        this.value = value;
    }
}
