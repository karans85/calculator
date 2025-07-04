package com.company.calculator;

import com.company.calculator.calc.FileCalculator;
import com.company.calculator.calc.ProxyCalculator;
import com.company.calculator.exceptions.HistoryNotFoundException;
import com.company.calculator.operation.CustomOperation;
import com.company.calculator.operation.Operation;
import com.company.calculator.operator.Operator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProxyCalculator calc = new ProxyCalculator();
        List<Formula> list = new ArrayList<>() {{
            add(new Formula(5.1, 6.2, Operation.MINUS));
            add(new Formula(2.3, 4.5, Operation.PLUS));
            add(new Formula(9.9, 2.3, Operation.MULTIPLY));
            add(new Formula(3.2, 1.2, Operation.DIVIDE));
            add(new Formula(3.2, 1.2, Operation.MODULUS));
        }};
        for (Formula formula : list) {
            System.out.print(formula.getDescription());
            System.out.println(calc.calculate(formula));
        }
        Operator pow = new Operator() {
            @Override
            public Double operate(Double num1, Double num2) {
                return Math.pow(num1, num2);
            }
        };

        //DEMO: When operation is found in cache
        Formula repeatedCalculation = new Formula(9.9, 2.3, Operation.MULTIPLY);
        System.out.print(repeatedCalculation.getDescription());
        System.out.println(calc.calculate(repeatedCalculation));

        //DEMO: When custom operation is added
        calc.addOperator(CustomOperation.POW, pow);
        System.out.println("Result of Custom Operation is: " + calc.calculate(new Formula(2.0, 3.0, CustomOperation.POW)));

        //DEMO: When index is out of bound in the history
        try {
            System.out.println("Result is not printed because of Exception thrown" + calc.getLast(10).getDescription());
        } catch (HistoryNotFoundException e) {
            System.out.println("History not found exception is caught");
        }

        //DEMO: Unsupported operation
        System.out.println("Result of unsupported operation: " + calc.calculate(new Formula(2.0, 3.0, CustomOperation.DEMO_OPERATION)));

        //DEMO: Calculate reading from and writing to File
        String inputName = null;
        String outputName = null;
        try {
            inputName = args[0];
            outputName = args[1];
        } catch (IndexOutOfBoundsException ignored) {
            System.out.println("Please set the command line parameters!");
        }
        FileCalculator util = new FileCalculator("src/main/java/com/company/calculator/iofiles/");
        util.calculate(inputName, outputName);
    }
}
