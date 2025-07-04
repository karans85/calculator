package com.company.calculator;

import com.company.calculator.calc.ProxyCalculator;
import com.company.calculator.exceptions.HistoryNotFoundException;
import com.company.calculator.operation.CustomOperation;
import com.company.calculator.operation.Operation;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class ProxyCalculatorTest {
    static ProxyCalculator proxyCalculator;

    @BeforeAll
    public static void prepTest(){
        proxyCalculator = new ProxyCalculator();
    }

    @Test
    void historyNotFoundException() {
        assertThrows(HistoryNotFoundException.class, () -> proxyCalculator.getLast(2));
    }

    @Test
    void unsupportedOperationReturnedNull() {
        assertNull(proxyCalculator.calculate(new Formula(2.0, 3.0, CustomOperation.DEMO_OPERATION)));
    }

    @Test
    void calculateFormula() {
        assertEquals(-2.0, proxyCalculator.calculate(new Formula(2.0, 4.0, Operation.MINUS)));
    }
}