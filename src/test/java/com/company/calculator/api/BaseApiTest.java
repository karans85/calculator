package com.company.calculator.api;

import com.company.calculator.calc.ApiCalculator;
import com.company.calculator.calc.LocalCalculator;
import org.junit.jupiter.api.BeforeAll;

public class BaseApiTest {

    protected static LocalCalculator calculator;
    protected static ApiCalculator apiCalculator;

    @BeforeAll
    protected static void prepTest(){
        calculator = new LocalCalculator();
        apiCalculator = new ApiCalculator();
    }
}
