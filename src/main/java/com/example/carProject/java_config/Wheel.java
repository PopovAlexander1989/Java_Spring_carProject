package com.example.carProject.java_config;

import com.example.carProject.xml_annotation.CarPart;

public class Wheel implements CarPart {
    private final String id;

    public Wheel(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Wheel{id='" + id + "'}";
    }
}