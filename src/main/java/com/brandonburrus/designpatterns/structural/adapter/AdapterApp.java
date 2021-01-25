package com.brandonburrus.designpatterns.structural.adapter;

import java.io.File;

public class AdapterApp {

    public static void main(String[] args) {
        Chomper chomper = new Chomper();
        File file = new File("resource.txt");

        // Adapter allows a chomper to work on a file
        chomper.chomp(new FileChomperAdapater(file));
    }
}
