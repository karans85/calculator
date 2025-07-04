package com.company.calculator.operator.defaultoperator;

import com.company.calculator.operator.Operator;

public class DivideOperator implements Operator {

    @Override
    public Double operate(Double x, Double y) {
        System.out.println("NON-API DIVIDE WAS CALLED!!");
        return x / y;
    }
}
