package com.company.calculator.calc;

import com.company.calculator.Formula;
import com.company.calculator.exceptions.HistoryNotFoundException;
import com.company.calculator.operation.IOperation;
import com.company.calculator.operator.Operator;
import com.company.calculator.util.LogUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

public class ProxyCalculator implements Calculator, History {
    Logger logger = LogUtil.getLogger(ProxyCalculator.class.getName());

    private final LocalCalculator localCalculator;
    private final List<Formula> history;
    private final HashMap<Formula, Double> cache;

    public ProxyCalculator() {
        localCalculator = new LocalCalculator();
        history = new ArrayList<>();
        cache = new HashMap<>();
    }

    @Override
    public Double calculate(Formula formula) {
        history.add(formula);
        Double cachedResult = cache.get(formula);
        if (cachedResult == null) {
            Double resultFromCalculator = localCalculator.calculate(formula);
            cache.put(formula, resultFromCalculator);
            return resultFromCalculator;
        } else {
            logger.warning("Operation Found in Cache!!! ");
            return cachedResult;
        }
    }

    @Override
    public void addOperator(IOperation operation, Operator operator) {
        localCalculator.addOperator(operation, operator);
    }

    @Override
    public Formula getLast(int index) {
        Formula result = null;
        try {
            int lastElementIndex = history.size() - 1;
            result = history.get(lastElementIndex - index);
        } catch (IndexOutOfBoundsException e) {
            throw new HistoryNotFoundException();
        }
        return result;
    }
}
