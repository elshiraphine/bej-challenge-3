package org.binar.service;

import org.binar.model.Value;

import java.util.List;

public abstract class DataService<T> {
    List<Value> value;

    public DataService(List<Value> value) {
        this.value = value;
    }

    public List<Value> getValue() {
        return value;
    }

    public void setValue(List<Value> value) {
        this.value = value;
    }

    public abstract T getResult();
}
