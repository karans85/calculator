package com.company.calculator.api;

import com.company.calculator.Formula;
import com.company.calculator.operation.Operation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DivideApiTest extends BaseApiTest {

    @ParameterizedTest
    @CsvSource({"20.0,2.0", "-88.88,-11.11"})
    public void getDivideApi(Double num1, Double num2) {
        Formula formula = new Formula(num1, num2, Operation.DIVIDE);
        Double expectedResult = calculator.calculate(formula);
        Double actualResult = apiCalculator.calculate(formula);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
