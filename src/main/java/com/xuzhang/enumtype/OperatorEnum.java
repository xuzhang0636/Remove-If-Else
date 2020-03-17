package com.xuzhang.enumtype;

public enum OperatorEnum {
    add {
        @Override
        int operator(int a, int b) {
            return a + b;
        }
    },
    subtract {
        @Override
        int operator(int a, int b) {
            return a - b;
        }
    },
    multiply {
        @Override
        int operator(int a, int b) {
            return a * b;
        }
    },
    divide {
        @Override
        int operator(int a, int b) {
            return a / b;
        }
    };

    abstract int operator(int a, int b);
}
