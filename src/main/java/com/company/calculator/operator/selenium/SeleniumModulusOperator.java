package com.company.calculator.operator.selenium;

import com.company.calculator.service.InstaCalcService;
import com.company.calculator.operator.Operator;

public class SeleniumModulusOperator implements Operator {
    @Override
    public Double operate(Double x, Double y) {
        System.out.println("Selenium MODULUS WAS CALLED!!!!!========");
        String actualResult = InstaCalcService.sendKeysToFirstField(x + "%" + y);
        Double actual = Double.parseDouble(actualResult);
        return actual;
    }
}
