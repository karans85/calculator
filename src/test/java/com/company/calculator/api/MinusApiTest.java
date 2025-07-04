package com.company.calculator.api;

import com.company.calculator.Formula;
import com.company.calculator.operation.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MinusApiTest extends BaseApiTest {

    @ParameterizedTest
    @CsvSource({"20.0,2.0","10.0,20.0","8.0,0.0"})
    void getMinusApi(Double num1, Double num2) {
        Formula formula = new Formula(num1, num2, Operation.MINUS);
        Double expectedResult = calculator.calculate(formula);
        Double actualResult = apiCalculator.calculate(formula);
        Assertions.assertEquals(expectedResult, actualResult);
    }

}

