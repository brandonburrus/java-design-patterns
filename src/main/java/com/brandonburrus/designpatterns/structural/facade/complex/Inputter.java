package com.brandonburrus.designpatterns.structural.facade.complex;

import java.util.Scanner;

public class Inputter {

    public String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
