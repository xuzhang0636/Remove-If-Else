package com.xuzhang.command;

public class DivideCommand implements Command {
    private int a;
    private int b;

    public DivideCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }


    @Override
    public int execute() {
        return a / b;
    }
}
