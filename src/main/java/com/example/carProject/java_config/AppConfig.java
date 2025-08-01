package com.example.carProject.java_config;

import com.example.carProject.xml_annotation.Accumulator;
import com.example.carProject.xml_annotation.Car;
import com.example.carProject.xml_annotation.Engine;
import com.example.carProject.xml_annotation.Suspension;
import com.example.carProject.xml_annotation.Wheel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Wheel wheel() {
        return new Wheel("Wheel3");
    }

    @Bean
    public Engine engine() {
        return new Engine("Starter3", "SparkPlug3");
    }

    @Bean
    public Accumulator accumulator() {
        return new Accumulator("Accu3");
    }

    @Bean
    public Suspension suspension() {
        return new Suspension("Hinge3", "Diff3");
    }

    @Bean
    public Car car(Wheel wheel, Engine engine, Accumulator accumulator, Suspension suspension) {
        return new Car(wheel, engine, accumulator, suspension);
    }
}
