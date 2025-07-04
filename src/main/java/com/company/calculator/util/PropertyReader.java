package com.company.calculator.util;

import com.company.calculator.service.InstaCalcService;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {
    static InputStream input = InstaCalcService.class.getClassLoader().getResourceAsStream("configuration.properties");
    static Properties prop = new Properties();

    public static String getProperty(String propertyName) {
        if (input == null) {
            System.out.println("Sorry, unable to find config.properties");
        }
        try {
            prop.load(input);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        System.out.println("Value of " + propertyName + " is " + prop.getProperty(propertyName));
        return prop.getProperty(propertyName);
    }
}
