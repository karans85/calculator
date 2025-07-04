package com.company.calculator.util;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogUtil {
    static final String LOG_FILE_PATH = "src/main/java/com/company/calculator/iofiles/logfile.log";

    public static Logger getLogger(String className) {
        Logger logger = Logger.getLogger(className);
        FileHandler handler;
        System.setProperty("java.util.logging.SimpleFormatter.format", "[%1$tF %1$tT] [%4$-7s] %5$s %n");
        try {
            handler = new FileHandler(LOG_FILE_PATH, false);
        } catch (IOException e) {
            throw new RuntimeException("Problems with creating the log file, please check the path");
        }
        SimpleFormatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);
        logger.addHandler(handler);
        return logger;
    }

}
