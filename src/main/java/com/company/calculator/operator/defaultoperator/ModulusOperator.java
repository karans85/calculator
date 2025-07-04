package com.company.calculator.operator.defaultoperator;

import com.company.calculator.operator.Operator;

public class ModulusOperator implements Operator {
    public Double operate(Double x, Double y) {
        System.out.println("NON-API MODULUS WAS CALLED!!");
        return x % y;
    }
}
