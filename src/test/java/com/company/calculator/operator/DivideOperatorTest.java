package com.company.calculator.operator;

import static org.junit.jupiter.api.Assertions.*;

import com.company.calculator.operator.defaultoperator.DivideOperator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class DivideOperatorTest {
    public static DivideOperator divideOperator;

    @BeforeAll
    public static void prepTest(){
        divideOperator = new DivideOperator();
    }

    @ParameterizedTest
    @CsvSource({"20.0,2.0,10.0","-88.88,-11.11,8"})
    @DisplayName("Simple divide operation")
    void divide(Double num1, Double num2, Double expected) {
        assertEquals(expected, divideOperator.operate(num1, num2));
    }

    @Test
    @DisplayName("Divide double number by 0.0")
    void divideByZero() {
        assertEquals(Double.POSITIVE_INFINITY, divideOperator.operate(10.0, 0.0));
    }
}