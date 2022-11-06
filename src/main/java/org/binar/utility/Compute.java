package org.binar.utility;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compute {
    public <T> T getMode(List<T> list) {
        Map<T, Integer> map = new HashMap<>();

        for (T t: list) {
            Integer val = map.get(t);
            map.put(t, val == null ? 1 : val + 1);
        }

        Map.Entry<T, Integer> max = null;
        for (Map.Entry<T, Integer> e : map.entrySet()) {
            if (max == null || e.getValue() > max.getValue()) {
                max = e;
            }
        }

        assert max != null;
        return max.getKey();
    }

    public double getMedian(List<Integer> list) {
        Collections.sort(list);
        double median = 0;

        if (list.size() % 2 == 1) {
            median = list.get((list.size() + 1) / 2);
        } else {
            double upper = list.get((list.size() / 2) + 1);
            double lower = list.get((list.size() / 2));

            median = (upper + lower) / 2;
        }

        return median;
    }

    public double getAverage (List<Integer> list) {
        return list.stream().mapToDouble(d -> d).average().orElse(0.0);
    }

}
