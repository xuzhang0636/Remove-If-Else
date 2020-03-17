package com.xuzhang.command;

import org.junit.Assert;
import org.junit.Test;

public class TestCommand {
    @Test
    public void testAdd() {
        Assert.assertEquals(2, new CommandCalculator(new AddCommand(1, 1)).calculator());
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(1, new CommandCalculator(new SubtractCommand(2, 1)).calculator());
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(6, new CommandCalculator(new MultiplyCommand(2, 3)).calculator());
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(3, new CommandCalculator(new DivideCommand(6, 2)).calculator());
    }
}
