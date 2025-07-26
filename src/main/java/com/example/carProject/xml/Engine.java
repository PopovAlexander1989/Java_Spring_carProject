package com.example.carProject.xml;

import com.example.carProject.xml_annotation.CarPart;
import org.springframework.stereotype.Component;

@Component
public class Engine implements CarPart {
    private final String starter;
    private final String sparkPlug;

    public Engine(String starter, String sparkPlug) {
        this.starter = starter;
        this.sparkPlug = sparkPlug;
    }

    @Override
    public String getId() {
        return "Engine";
    }

    @Override
    public String toString() {
        return "Engine{starter='" + starter + "', sparkPlug='" + sparkPlug + "'}";
    }
}