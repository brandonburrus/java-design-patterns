package com.brandonburrus.designpatterns.structural.adapter;

public class Chomper {

    public void chomp(ChompableResource resource) {
        System.out.println("Chomping down on: " + resource.getChompableResource());
    }
}
