package com.company.calculator;

import com.company.calculator.operation.IOperation;

import java.util.Objects;

public class Formula {

    public Double num1, num2;
    public IOperation operation;

    public Formula(Double num1, Double num2, IOperation operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    public String getDescription() {
        return operation.toString() + ": Result for values " + num1.toString() + " and " + num2.toString() + " are: ";
    }

    public String print(){
        return num1 + operation.getValue() + num2;
    }

    @Override
    public String toString() {
        return "Formula{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", operation=" + operation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Formula formula = (Formula) o;
        return Objects.equals(num1, formula.num1) && Objects.equals(num2, formula.num2) && operation == formula.operation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2, operation);
    }
}
