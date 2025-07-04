package com.company.calculator.operator.api;

import com.company.calculator.service.MathJsService;
import com.company.calculator.operator.Operator;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;

import static io.restassured.RestAssured.filters;

public class ApiDivideOperator implements Operator {

    public Double operate(Double x, Double y) {
        filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        System.out.println("API DIVIDE WAS CALLED USING POST!!!!!========");
        String actualResult = MathJsService.sendPostRequest(x + "/" + y);
        Double actual = Double.parseDouble(actualResult);
        return actual;
    }
}
