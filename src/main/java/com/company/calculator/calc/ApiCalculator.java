package com.company.calculator.calc;

import com.company.calculator.constants.OperatorsMapping;

public class ApiCalculator extends AbstractCalculator {

    public ApiCalculator() {
        super(OperatorsMapping.apiOperators);
    }
}

