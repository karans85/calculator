package com.company.calculator.operator.defaultoperator;

import com.company.calculator.operator.Operator;

public class PlusOperator implements Operator {
    public Double operate(Double x, Double y) {
        System.out.println("NON-API PLUS WAS CALLED!!");
        return x + y;
    }
}
