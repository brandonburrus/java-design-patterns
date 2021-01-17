package com.brandonburrus.designpatterns.builder;

public class BuilderApp {

    public static void main(String[] args) {
        Converter myConverter = new ConverterBuilder()
            .configuration(100)
            .toggle(true)
            .build();
        System.out.println("My converter value is " + myConverter.convert());
    }
}
