package com.brandonburrus.designpatterns.behavioral.command;

public class CommandApp {

    public static void main(String[] args) {
        Command cmd = new MacroCommand(new YellCommand())
            .addCommand(new WhisperCommand())
            .addCommand(new YellCommand());

        Button btn = new Button(cmd);

        btn.click();
    }
}
