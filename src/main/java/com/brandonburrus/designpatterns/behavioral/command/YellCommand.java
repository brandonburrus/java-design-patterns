package com.brandonburrus.designpatterns.behavioral.command;

public class YellCommand implements Command {
    @Override
    public void execute() {
        System.out.println("I AM YELLING AT YOU!");
    }
}
