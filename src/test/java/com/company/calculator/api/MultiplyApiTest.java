package com.company.calculator.api;

import com.company.calculator.Formula;
import com.company.calculator.operation.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MultiplyApiTest extends BaseApiTest{

    @ParameterizedTest
    @CsvSource({"7.0,6.0","35.0,0.0","35.0,-1.0"})
    void getMultiplyApi(Double num1, Double num2) {
        Formula formula = new Formula(num1, num2, Operation.MULTIPLY);
        Double expectedResult = calculator.calculate(formula);
        Double actualResult = apiCalculator.calculate(formula);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
