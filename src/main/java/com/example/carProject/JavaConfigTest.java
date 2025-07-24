package com.example.carProject;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car car = context.getBean(Car.class);
        System.out.println(car);
    }
}
