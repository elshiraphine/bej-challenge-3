package org.binar.utility;

import org.binar.model.Value;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reader {
    public List<Value> readFile(String filepath) {
        List<Value> listToCompute = new ArrayList<>();

        try {
            File file = new File(filepath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            List<String> data = new ArrayList<>();
            String line;

            while ((line = br.readLine()) != null) {
                data.add(line);
            }

            for (String datum : data) {
                Value val = new Value();
                List<String> list = new ArrayList<>(Arrays.asList(datum.split(";")));
                List<Integer> score = new ArrayList<>();

                for (int i = 0; i < list.size(); i++) {
                    if (i == 0) val.setClassName(list.get(i));
                    else score.add(Integer.valueOf(list.get(i)));
                }
                val.setScore(score);
                listToCompute.add(val);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return listToCompute;
    }
}
