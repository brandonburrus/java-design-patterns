package com.brandonburrus.designpatterns.structural.adapter;

import java.io.File;

public class AdapterApp {

    public static void main(String[] args) {
        Chomper chomper = new Chomper();

        File file = new File("resource.txt");
        ChompableResource chompableResource = new FileChomperObjectAdapater(file);
        // Use an object to adapt the interface of one object to the expected
        // interface of another.
        chomper.chomp(chompableResource);


        ChompableResource adapatedFile = new FileChomperClassAdapter("resource.txt");
        // Or use a class adapter that can be used in place of the adaptee
        chomper.chomp(adapatedFile);
    }
}
