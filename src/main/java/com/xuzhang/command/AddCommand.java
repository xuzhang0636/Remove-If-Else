package com.xuzhang.command;

public class AddCommand implements Command {
    private int a;
    private int b;

    public AddCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int execute() {
        return a + b;
    }
}
