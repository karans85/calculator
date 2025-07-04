package com.company.calculator;

import com.company.calculator.calc.LocalCalculator;
import com.company.calculator.constants.Operators;
import com.company.calculator.exceptions.OperationNotSupportedException;
import com.company.calculator.operation.CustomOperation;
import com.company.calculator.operation.Operation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class LocalCalculatorTest {
    static LocalCalculator calculator;

    @BeforeAll
    static void prepTest() {
        calculator = new LocalCalculator();
    }

    @Test
    void getOperator() throws OperationNotSupportedException {
        assertEquals(Operators.MINUS, calculator.getOperator(Operation.MINUS));
    }


    @ParameterizedTest
    @CsvSource({"2.0,4.0,8.0", "4.0,-1.0,-4.0","-3,-3,9"})
    void calculateFormula(Double num1, Double num2, Double expected) {
        assertEquals(expected, calculator.calculate(new Formula(num1, num2, Operation.MULTIPLY)));
    }

    @Test
    void unsupportedOperationReturnedNull() {
        assertNull(calculator.calculate(new Formula(2.5, 3.2, CustomOperation.SIGN)));
    }
}
