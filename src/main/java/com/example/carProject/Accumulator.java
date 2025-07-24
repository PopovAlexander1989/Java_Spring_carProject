package com.example.carProject;

public class Accumulator implements CarPart {
    private final String id;

    public Accumulator(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Accumulator{id='" + id + "'}";
    }
}
