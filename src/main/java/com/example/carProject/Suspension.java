package com.example.carProject;

public class Suspension implements CarPart {
    private final String hinge;
    private final String differential;

    public Suspension(String hinge, String differential) {
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
