package com.company.calculator.calc;

import com.company.calculator.constants.OperatorsMapping;

public class LocalCalculator extends AbstractCalculator {
    public LocalCalculator(){
        super(OperatorsMapping.localOperators);
    }
}

