package com.company.calculator.calc;

import com.company.calculator.Formula;
import com.company.calculator.operation.Operation;
import com.company.calculator.reader.ReaderImpl;
import com.company.calculator.util.LogUtil;
import com.company.calculator.writer.WriterImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileCalculator {
    Logger logger = LogUtil.getLogger(FileCalculator.class.getName());
    static final String INPUT_FILE_NAME = "Input.txt";
    static final String OUTPUT_FILE_NAME = "Output.txt";
    String path;

    public FileCalculator(String path) {
        this.path = path;
    }

    public void calculate(String inputFileName, String outputFileName) {
        if (inputFileName == null || outputFileName == null) {
            inputFileName = INPUT_FILE_NAME;
            outputFileName = OUTPUT_FILE_NAME;
            System.out.println("Use default file names");
        }
        List<Object> allResults = new ArrayList<>();
        ProxyCalculator calc = new ProxyCalculator();
        List<Object> readLines = new ReaderImpl().read(path + inputFileName);
        for (Object line : readLines) {
            String inputLine = (String) line;
            String regexpToSplitStringIn3Values = "(\\d*)(.)(\\d*)";
            Pattern pattern = Pattern.compile(regexpToSplitStringIn3Values);
            Matcher matcher = pattern.matcher(inputLine);
            String result = null;
            if (matcher.find()) {
                try {
                    Double val1 = Double.parseDouble(matcher.group(1));
                    Operation operation = Operation.get(matcher.group(2));
                    Double val2 = Double.parseDouble(matcher.group(3));
                    Double shortResult = calc.calculate(new Formula(val1, val2, operation));
                    result = inputLine + "=" + shortResult.toString();
                } catch (Exception e) {
                    logger.warning("Please use the correct value/operation");
                    continue;
                }
            } else {
                logger.info("NO MATCH");
            }
            allResults.add(result);
        }
        WriterImpl writer = new WriterImpl();
        writer.write(path + outputFileName, allResults);
    }
}
