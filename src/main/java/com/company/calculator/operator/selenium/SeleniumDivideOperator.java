package com.company.calculator.operator.selenium;

import com.company.calculator.service.InstaCalcService;
import com.company.calculator.operator.Operator;

public class SeleniumDivideOperator implements Operator {
    @Override
    public Double operate(Double x, Double y) {
        System.out.println("Selenium DIVIDE WAS CALLED!!!!!========");
        String actualResult = InstaCalcService.sendKeysToFirstField(x + "/" + y);
        Double actual = Double.parseDouble(actualResult);
        return actual;
    }
}
