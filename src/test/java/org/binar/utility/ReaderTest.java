package org.binar.utility;

import org.binar.model.Value;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {
    private static final String FILE_PATH = "D:\\Workspace\\";
    private static final String FILE = "data_sekolah.csv";
    private static List<Value> sampleData;
    private static List<Value> emptySampleData;
    private static List<Integer> sampleValue;



    @BeforeAll
    public static void setUp() {
        sampleData = new ArrayList();
        sampleValue = new ArrayList<>(Arrays.asList(7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 7, 7, 10));
        Value v = new Value();
         v.setClassName("Binar Academy");
         v.setScore(sampleValue);
         sampleData.add(v);
    }

    @Test
    @DisplayName("Testing Read File")
    public void testReadFile() {
        Reader r = new Reader();
        List<Value> res = r.readFile(FILE_PATH+FILE);
        assertTrue(res.size() > 0);
    }
}