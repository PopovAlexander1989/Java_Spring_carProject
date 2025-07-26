package com.example.carProject.xml_annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Accumulator implements CarPart {
    private final String id;

    public Accumulator(@Value("Accu2") String id) {
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