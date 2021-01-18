package com.brandonburrus.designpatterns.creational.builder.simple;

public class SimpleBuilderApp {

    public static void main(String[] args) {
        SimplePojo myPojo = SimplePojoBuilder.simplePojo()
            .valueA(1)
            .valueB(42)
            .valueD(false)
            .build();
        System.out.println("My pojo: " + myPojo.toString());
    }
}
