package com.brandonburrus.designpatterns.behavioral.strategy;

public class InlineReversalStrategy<T> implements ReverseStrategy<T> {
    @Override
    public T[] reverse(T[] arr) {
        Object[] reversed = new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[arr.length - 1 - i] = arr[i];
        }
        return (T[]) reversed;
    }
}
