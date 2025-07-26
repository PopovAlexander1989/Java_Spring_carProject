package com.example.carProject.xml_annotation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine implements CarPart {
    private final String starter;
    private final String sparkPlug;

    public Engine(@Value("Starter2") String starter, @Value("sparkPlug2") String sparkPlug) {
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