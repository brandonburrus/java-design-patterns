package com.brandonburrus.designpatterns.creational.builder;

/**
 * The type Builder app.
 */
public class BuilderApp {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Converter myConverter = new ConverterBuilder()
            .configuration(100)
            .toggle(true)
            .build();
        System.out.println("My converter value is " + myConverter.convert());
    }
}
