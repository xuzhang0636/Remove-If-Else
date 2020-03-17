package com.xuzhang.map;

import org.junit.Assert;
import org.junit.Test;

public class TestMapCalculator {
    @Test
    public void testAdd() {
        Assert.assertEquals(3, OperatorFactory.operator(1, 2, "add"));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(1, OperatorFactory.operator(2, 1, "subtract"));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(6, OperatorFactory.operator(2, 3, "multiply"));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2, OperatorFactory.operator(6, 3, "divide"));
    }

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        OperatorFactory.operator(2, 3, "test");
    }
}
