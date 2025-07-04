package com.company.calculator.constants;

import com.company.calculator.operator.Operator;
import com.company.calculator.operator.api.*;
import com.company.calculator.operator.defaultoperator.*;
import com.company.calculator.operator.selenium.*;

public enum Operators implements Operator {
    PLUS(new PlusOperator()),
    MINUS(new MinusOperator()),
    MULTIPLY(new MultiplyOperator()),
    DIVIDE(new DivideOperator()),
    MODULUS(new ModulusOperator()),

    API_PLUS(new ApiPlusOperator()),
    API_MINUS(new ApiMinusOperator()),
    API_MULTIPLY(new ApiMultiplyOperator()),
    API_DIVIDE(new ApiDivideOperator()),
    API_MODULUS(new ApiModulusOperator()),

    WEB_DRIVER_PLUS(new SeleniumPlusOperator()),
    WEB_DRIVER_MINUS(new SeleniumMinusOperator()),
    WEB_DRIVER_MULTIPLY(new SeleniumMultiplyOperator()),
    WEB_DRIVER_DIVIDE(new SeleniumDivideOperator()),
    WEB_DRIVER_MODULUS(new SeleniumModulusOperator());

    private final Operator operator;

    Operators(Operator operator) {
        this.operator=operator;
    }

    @Override
    public Double operate(Double num1, Double num2) {
        return this.operator.operate(num1,num2);
    }
}