package com.brandonburrus.designpatterns.behavioral.strategy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReversalStrategy<T> implements ReverseStrategy<T> {
    @Override
    public T[] reverse(T[] arr) {
        List<T> array = Arrays.asList(arr);
        Collections.reverse(array);
        return (T[]) array.toArray();
    }
}
