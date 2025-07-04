package com.company.calculator.operator;

import com.company.calculator.operator.defaultoperator.ModulusOperator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ModulusOperatorTest {
    static public ModulusOperator modulusOperator;

    @BeforeAll
    public static void prepTest(){
        modulusOperator = new ModulusOperator();
    }

    @ParameterizedTest
    @CsvSource({"37.0,6.0,1.0","4.0,2.0,0.0"})
    @DisplayName("Simple modulus operation")
    void modulus(Double num1, Double num2, Double expected) {
        assertEquals(expected, modulusOperator.operate(num1, num2));
    }
}
