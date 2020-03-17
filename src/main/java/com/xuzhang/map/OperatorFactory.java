package com.xuzhang.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OperatorFactory {
    static Map<String, Operator> operatorMap = new HashMap<String, Operator>();

    static {
        operatorMap.put("add", new AddOperator());
        operatorMap.put("subtract", new SubtractOperator());
        operatorMap.put("divide", new DivideOperator());
        operatorMap.put("multiply", new MultiplyOperator());
    }

    static int operator(int a, int b, String type) {
        Operator operator = operatorMap.get(type);
        if (!Objects.isNull(operator)) {
            return operator.operator(a, b);
        } else {
            throw new NullPointerException("operator is null");
        }
    }
}
