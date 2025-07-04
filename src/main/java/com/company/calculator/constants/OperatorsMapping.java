package com.company.calculator.constants;

import com.company.calculator.operation.*;
import com.company.calculator.operator.Operator;

import java.util.HashMap;

public class OperatorsMapping {

    public final static HashMap<IOperation, Operator> localOperators = new HashMap<>() {{
        put(Operation.PLUS, Operators.PLUS);
        put(Operation.MINUS, Operators.MINUS);
        put(Operation.MODULUS, Operators.MODULUS);
        put(Operation.MULTIPLY, Operators.MULTIPLY);
        put(Operation.DIVIDE, Operators.DIVIDE);

    }};

    public final static HashMap<IOperation, Operator> apiOperators = new HashMap<>() {{
        put(Operation.PLUS, Operators.API_PLUS);
        put(Operation.MINUS, Operators.API_MINUS);
        put(Operation.MODULUS, Operators.API_MODULUS);
        put(Operation.MULTIPLY, Operators.API_MULTIPLY);
        put(Operation.DIVIDE, Operators.API_DIVIDE);
    }};

    public final static HashMap<IOperation, Operator> uiOperators = new HashMap<>() {{
        put(Operation.PLUS, Operators.WEB_DRIVER_PLUS);
        put(Operation.MINUS, Operators.WEB_DRIVER_MINUS);
        put(Operation.MODULUS, Operators.WEB_DRIVER_MODULUS);
        put(Operation.MULTIPLY, Operators.WEB_DRIVER_MULTIPLY);
        put(Operation.DIVIDE, Operators.WEB_DRIVER_DIVIDE);
    }};
}
