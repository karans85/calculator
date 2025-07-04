package com.company.calculator.writer;

import java.io.*;
import java.util.List;

public class WriterImpl implements Writer {
    BufferedWriter bw = null;

    @Override
    public void write(String fileName, List<Object> objects) {
        try {
            File fOut = new File(fileName);
            FileOutputStream fos = new FileOutputStream(fOut);
            bw = new BufferedWriter(new OutputStreamWriter(fos));
            for (int i = 0; i < objects.size(); i++) {
                bw.write(objects.get(i).toString());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
