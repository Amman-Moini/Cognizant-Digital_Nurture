package com.example;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {
    private List<String> data;

    public DataProcessor() {
        this.data = new ArrayList<>();
    }

    public void add(String item) {
        this.data.add(item);
    }

    public void clear() {
        this.data.clear();
    }

    public int getSize() {
        return this.data.size();
    }
}