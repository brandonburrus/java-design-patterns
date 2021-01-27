package com.brandonburrus.designpatterns.behavioral.command;

public class WhisperCommand implements Command {
    @Override
    public void execute() {
        System.out.println("** hey it's kinda quiet in here **");
    }
}
