package com.company.calculator.operator.defaultoperator;

import com.company.calculator.operator.Operator;

public class MinusOperator implements Operator {
    public Double operate(Double x, Double y) {
        System.out.println("NON-API MINUS WAS CALLED!!");
        return x - y;
    }
}
