package com.xuzhang;

public class Calculator {
    public int calculator(int a, int b, String operator) {
        int result = 0;
        if ("add".equals(operator)) {
            result += a + b;
        } else if ("multiply".equals(operator)) {
            result += a * b;
        } else if ("subtract".equals(operator)) {
            result += a - b;
        } else if ("divide".equals(operator)) {
            result += a / b;
        }
        return result;
    }
}
