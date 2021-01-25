package com.brandonburrus.designpatterns.structural.facade.complex;

public class Printer {

    public void print(Object... input) {
        for (Object str : input) {
            System.out.println(str);
        }
    }
}
