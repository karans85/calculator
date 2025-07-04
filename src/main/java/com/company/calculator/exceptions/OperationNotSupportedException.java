package com.company.calculator.exceptions;

public class OperationNotSupportedException extends Exception {
    public OperationNotSupportedException() {
        super("Custom exception: Operation not supported!!!");
    }

    public OperationNotSupportedException(String msg) {
        super(msg);
    }
}
