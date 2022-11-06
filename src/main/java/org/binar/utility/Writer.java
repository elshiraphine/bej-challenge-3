package org.binar.utility;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Writer {
    public void generateTxtFile(String title, StringBuilder message, String fileName, String filepath) throws
            FileNotFoundException, UnsupportedEncodingException {
        try (PrintWriter w = new PrintWriter(filepath + fileName + ".txt" + "UTF-8")) {
            w.println(title);
            w.println();
            w.println(message);
        }
    }
}
