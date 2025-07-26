package com.example.carProject.java_config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Suspension implements CarPart {
    private final String hinge;
    private final String differential;

    public Suspension(@Value("Hinge2") String hinge, @Value("Diff2") String differential) {
        this.hinge = hinge;
        this.differential = differential;
    }

    @Override
    public String getId() {
        return "Suspension";
    }

    @Override
    public String toString() {
        return "Suspension{hinge='" + hinge + "', differential='" + differential + "'}";
    }
}