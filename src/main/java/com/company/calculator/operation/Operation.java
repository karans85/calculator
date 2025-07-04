package com.company.calculator.operation;

import java.util.Arrays;

public enum Operation implements IOperation {
    PLUS("+"),
    DIVIDE("/"),
    MINUS("-"),
    MODULUS("%"),
    MULTIPLY("*");

    private final String value;

    Operation(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static Operation get(String value) {
        return Arrays.stream(Operation.values()).filter(env -> env.value.equals(value)).findFirst().orElse(null);
    }

}
