package com.company.calculator.service;

import com.company.calculator.constants.Uri;
import com.company.calculator.pages.InstaCalcHomePage;
import com.company.calculator.util.DriverManager;

public class InstaCalcService {

    public static String sendKeysToFirstField(String expression) {
        DriverManager.initializeDriverSpecifiedInProperties();
        DriverManager.openUri(Uri.INSTA_CALC);
        InstaCalcHomePage page = new InstaCalcHomePage(DriverManager.getDriver());
        page.clearInputField();
        page.inputExpression(expression);
        return page.getResult();
    }
}
