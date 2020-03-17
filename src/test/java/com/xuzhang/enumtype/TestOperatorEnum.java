package com.xuzhang.enumtype;

import org.junit.Assert;
import org.junit.Test;

public class TestOperatorEnum {
    @Test
    public void testAdd() {
        Assert.assertEquals(3, OperatorEnum.valueOf("add").operator(1, 2));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2, OperatorEnum.valueOf("divide").operator(6, 3));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(6, OperatorEnum.valueOf("multiply").operator(2, 3));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(1, OperatorEnum.valueOf("subtract").operator(3, 2));
    }
}
