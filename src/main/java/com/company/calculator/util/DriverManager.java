package com.company.calculator.util;

import com.company.calculator.exceptions.NoBrowserSpecifiedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.time.Duration;
import java.util.logging.Logger;

public class DriverManager {
    public static EventFiringWebDriver driver;
    static Logger logger = LogUtil.getLogger(DriverManager.class.getName());

    public static void initializeDriverSpecifiedInProperties() {
        String browserValue = PropertyReader.getProperty("browser");
        if (driver == null) {
            switch (browserValue) {
                case "chrome":
                    String pathToChromedriverExe = PropertyReader.getProperty("chrome.driver.path");
                    System.setProperty("webdriver.chrome.driver", pathToChromedriverExe);
                    driver = new EventFiringWebDriver(new ChromeDriver());
                    break;
                case "edge":
                    String pathToEdgeDriverExe = PropertyReader.getProperty("msedge.driver.path");
                    System.setProperty("webdriver.edge.driver", pathToEdgeDriverExe);
                    driver = new EventFiringWebDriver(new EdgeDriver());
                    break;
                default:
                    try {
                        throw new NoBrowserSpecifiedException();
                    } catch (NoBrowserSpecifiedException e) {
                        e.printStackTrace();
                    }
            }
            driver.register(new EventHandler());
            driver.manage().timeouts().implicitlyWait(Duration.ZERO);
        }
    }

    public static void openUri(String uri) {
        logger.info("Open the webpage");
        getDriver().get(uri);
    }


    public static WebDriver getDriver() {
        return driver;
    }

    public static void destroyDriver() {
        driver.close();
        driver = null;
    }
}
