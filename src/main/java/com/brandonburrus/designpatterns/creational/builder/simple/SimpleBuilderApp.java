package com.brandonburrus.designpatterns.creational.builder.simple;

/**
 * The type Simple builder app.
 */
public class SimpleBuilderApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SimplePojo myPojo = SimplePojoBuilder.simplePojo()
            .valueA(1)
            .valueB(42)
            .valueD(false)
            .build();
        System.out.println("My pojo: " + myPojo.toString());
    }
}
