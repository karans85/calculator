package com.company.calculator;

import com.company.calculator.operation.Operation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormulaTest {
    public Formula formula = new Formula(5.1, 6.2, Operation.MINUS);

    @Test
    void checkDescription() {
        assertEquals("MINUS: Result for values 5.1 and 6.2 are: ", formula.getDescription());
    }
}