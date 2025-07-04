package com.company.calculator.operator;


import com.company.calculator.operator.defaultoperator.MinusOperator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class MinusOperatorTest {
    public static MinusOperator minusOperator;

    @BeforeAll
    public static void prepTest(){
        minusOperator = new MinusOperator();
    }

    @ParameterizedTest
    @CsvSource({"20.0,2.0,18.0","10.0,20.0,-10.0","8.0,0.0,8.0"})
    @DisplayName("Minus operation with negative and 0 values")
    void minus(Double num1, Double num2, Double expected) {
        assertEquals(expected, minusOperator.operate(num1, num2));
    }
}

