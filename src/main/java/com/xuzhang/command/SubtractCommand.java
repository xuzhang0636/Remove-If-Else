package com.xuzhang.command;

public class SubtractCommand implements Command {

    private int a;
    private int b;

    public SubtractCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int execute() {
        return a - b;
    }
}
