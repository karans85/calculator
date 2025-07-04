package com.company.calculator.calc;

import com.company.calculator.Formula;
import com.company.calculator.operation.IOperation;
import com.company.calculator.operator.Operator;

public interface Calculator {
    Double calculate(Formula formula) throws Exception;

    void addOperator(IOperation operation, Operator operator);
}
