package com.company.calculator.operator;

import com.company.calculator.operator.defaultoperator.PlusOperator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlusOperatorTest {
    static public PlusOperator plusOperator;

    @BeforeAll
    public static void prepTest(){
        plusOperator = new PlusOperator();
    }

    @ParameterizedTest
    @CsvSource({"7.0,6.0,13.0","35.0,-1.0,34.0","-35.0,-1.0,-36.0"})
    @DisplayName("Plus operation with one and multiple negative values")
    void plus(Double num1, Double num2, Double expected) {
        assertEquals(expected, plusOperator.operate(num1,num2));
    }
}
