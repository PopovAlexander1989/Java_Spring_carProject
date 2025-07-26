package com.example.carProject.java_config;

import com.example.carProject.xml_annotation.Accumulator;
import com.example.carProject.xml_annotation.Engine;
import com.example.carProject.xml_annotation.Suspension;
import com.example.carProject.xml_annotation.Wheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private final Wheel wheel;
    private final Engine engine;
    private final Accumulator accumulator;
    private final Suspension suspension;

    @Autowired
    public Car(Wheel wheel, Engine engine, Accumulator accumulator, Suspension suspension) {
        this.wheel = wheel;
        this.engine = engine;
        this.accumulator = accumulator;
        this.suspension = suspension;
    }

    @Override
    public String toString() {
        return "Car{wheel=" + wheel + ", engine=" + engine + ", accumulator=" + accumulator + ", suspension=" + suspension + "}";
    }
}