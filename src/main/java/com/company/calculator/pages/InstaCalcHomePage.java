package com.company.calculator.pages;

import com.company.calculator.util.DriverManager;
import com.company.calculator.service.InstaCalcService;
import com.company.calculator.util.LogUtil;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Logger;

public class InstaCalcHomePage extends PageFactory {
    private final WebDriverWait wait;
    static Logger logger = LogUtil.getLogger(InstaCalcService.class.getName());

    @FindBy(how = How.XPATH, using = "(//div[@id='calc']//input)[1]")
    public WebElement inputField;

    @FindBy(how = How.XPATH, using = "(//div[@id='calc']//result)[1]")
    public WebElement outputField;

    public InstaCalcHomePage(WebDriver driver) {
        wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        initElements(driver, this);
    }

    public void clearInputField() {
        inputField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
    }

    public void inputExpression(String inputExpression) {
        logger.info("Enter the expression: " + inputExpression);
        waitForInputField();
        inputField.sendKeys(inputExpression);
    }

    public String getResult() {
        waitForOutputField();
        String outputFieldText = outputField.getText();
        logger.info("Output from InstaCalc is: " + outputFieldText);
        return outputFieldText;
    }

    private void waitForInputField() {
        wait.until(ExpectedConditions.visibilityOf(inputField));
    }

    private void waitForOutputField() {
        wait.until(ExpectedConditions.visibilityOf(outputField));
    }
}
