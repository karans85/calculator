package com.company.calculator.calc;

import com.company.calculator.Formula;
import com.company.calculator.constants.OperatorsMapping;
import com.company.calculator.exceptions.OperationNotSupportedException;
import com.company.calculator.operation.IOperation;
import com.company.calculator.operator.Operator;
import com.company.calculator.util.LogUtil;

import java.util.HashMap;
import java.util.logging.Logger;

public class AbstractCalculator implements Calculator {

    Logger logger = LogUtil.getLogger(AbstractCalculator.class.getName());
    HashMap<IOperation, Operator> operatorsMap;

    public AbstractCalculator() {
        operatorsMap = OperatorsMapping.localOperators;
    }

    protected AbstractCalculator(HashMap<IOperation, Operator> operatorsMapping) {
        operatorsMap = operatorsMapping;
    }

    @Override
    public Double calculate(Formula formula) {
        Double num1 = formula.num1;
        Double num2 = formula.num2;
        IOperation operation = formula.operation;
        try {
            Operator chosenOperator = getOperator(operation);
            return chosenOperator.operate(num1, num2);
        } catch (OperationNotSupportedException e) {
            logger.warning("Unsupported operation is caught");
        }
        return null;
    }

    @Override
    public void addOperator(IOperation operation, Operator operator) {
        operatorsMap.put(operation, operator);
    }

    public Operator getOperator(IOperation op) throws OperationNotSupportedException {
        Operator result = operatorsMap.get(op);
        if (result == null) {
            throw new OperationNotSupportedException();
        }
        return result;
    }
}
