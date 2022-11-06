package org.binar.service;

import org.binar.model.GroupingValue;
import org.binar.model.Value;
import org.binar.utility.Compute;

import java.util.ArrayList;
import java.util.List;

public class Service extends DataService{
    public Service (List<Value> value) {
        super(value);
    }

    @Override
    public List<GroupingValue> getResult() {
        List<GroupingValue> res = new ArrayList<>();
        Compute com = new Compute();

        List<Value> values = (List<Value>) value;
        values.stream().map((val) -> {
            GroupingValue groupingValue = new GroupingValue();
            groupingValue.setClassName(val.getClassName());
            groupingValue.setMean(com.getAverage(val.getScore()));
            groupingValue.setMedian(com.getMedian(val.getScore()));
            groupingValue.setMode(com.getMode(val.getScore()));
            return groupingValue;
        }).forEachOrdered(res::add);
        return res;
    }
}
