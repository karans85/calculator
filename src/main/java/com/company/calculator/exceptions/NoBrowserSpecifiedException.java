package com.company.calculator.exceptions;

public class NoBrowserSpecifiedException extends Exception{
    public NoBrowserSpecifiedException(){
        super("Custom exception: Browser not specified!!!");
    }
}
