package com.company.calculator.calc;

import com.company.calculator.Formula;
import com.company.calculator.exceptions.HistoryNotFoundException;

public interface History {
    Formula getLast(int number) throws HistoryNotFoundException;
}
