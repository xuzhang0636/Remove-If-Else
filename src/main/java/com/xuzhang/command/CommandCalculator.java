package com.xuzhang.command;

public class CommandCalculator {
    Command command;

    public CommandCalculator(Command command) {
        this.command = command;
    }

    public int calculator() {
        return command.execute();
    }
}
