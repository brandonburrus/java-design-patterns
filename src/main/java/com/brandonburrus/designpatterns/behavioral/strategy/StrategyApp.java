package com.brandonburrus.designpatterns.behavioral.strategy;

public class StrategyApp {

    public static void main(String[] args) {
        ArrayReverser<Integer> arr = new ArrayReverser<>(new Integer[] {1, 2, 3});
        System.out.println(arr);

        arr.reverse(new ListReversalStrategy<>());
        System.out.println(arr);

        arr.reverse(new InlineReversalStrategy<>());
        System.out.println(arr);
    }
}
