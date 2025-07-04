package com.company.calculator.exceptions;

public class HistoryNotFoundException extends RuntimeException {
    public HistoryNotFoundException() {
        super("Custom exception: Please use correct index!!!");
    }
}
