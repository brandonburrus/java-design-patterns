package com.brandonburrus.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class MacroCommand implements Command {

    private final List<Command> commands;

    public MacroCommand(Command... initialCommands) {
        this.commands = new ArrayList<>();

        for (Command initialCommand : initialCommands) {
            addCommand(initialCommand);
        }
    }

    public MacroCommand addCommand(Command command) {
        commands.add(command);
        return this;
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
