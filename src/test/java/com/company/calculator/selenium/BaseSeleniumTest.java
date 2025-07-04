package com.company.calculator.selenium;

import com.company.calculator.util.DriverManager;
import com.company.calculator.calc.LocalCalculator;
import com.company.calculator.calc.UiCalculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseSeleniumTest {

    protected static LocalCalculator calculator;
    protected static UiCalculator uiCalculator;

    @BeforeAll
    protected static void prepTest(){
        calculator = new LocalCalculator();
        uiCalculator = new UiCalculator();
    }

    @AfterAll
    protected static void tearDownTest(){
        DriverManager.destroyDriver();
    }
}
