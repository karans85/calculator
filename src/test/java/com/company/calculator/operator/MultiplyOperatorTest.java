package com.company.calculator.operator;

import com.company.calculator.operator.defaultoperator.MultiplyOperator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MultiplyOperatorTest {
    static public MultiplyOperator multiplyOperator;

    @BeforeAll
    public static void prepTest(){
        multiplyOperator = new MultiplyOperator();
    }

    @ParameterizedTest
    @CsvSource({"7.0,6.0,42.0","35.0,0.0,0.0","35.0,-1.0,-35.0"})
    @DisplayName("Multiply operation with zero and negative values")
    void multiply(Double num1, Double num2, Double expected) {
        assertEquals(expected, multiplyOperator.operate(num1, num2));
    }
}
