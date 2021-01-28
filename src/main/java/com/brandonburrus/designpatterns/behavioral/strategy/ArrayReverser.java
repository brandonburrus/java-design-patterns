package com.brandonburrus.designpatterns.behavioral.strategy;

import java.util.Arrays;

import static com.google.common.base.MoreObjects.toStringHelper;

public class ArrayReverser<T> {

    private T[] internalArray;

    public ArrayReverser(T[] internalArray) {
        this.internalArray = internalArray;
    }

    void reverse(ReverseStrategy<T> strategy) {
        internalArray = strategy.reverse(internalArray);
    }

    public T[] getInternalArray() {
        return internalArray;
    }

    @Override
    public String toString() {
        return toStringHelper(this)
            .add("array", Arrays.toString(internalArray))
            .toString();
    }
}
