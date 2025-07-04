package com.company.calculator.operator.api;

import com.company.calculator.service.MathJsService;
import com.company.calculator.operator.Operator;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.filters;

public class ApiMultiplyOperator implements Operator {

    public Double operate(Double x, Double y) {
        filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        System.out.println("API MULTIPLY WAS CALLED!!!!!========");
        String actualResult = MathJsService.sendGetRequest( x + "*" + y);
        Double actual = Double.parseDouble(actualResult);
        return actual;
    }
}
