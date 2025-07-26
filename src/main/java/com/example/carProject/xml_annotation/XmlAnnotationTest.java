package com.example.carProject.xml_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlAnnotationTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-xml-annotation.xml");
        Car car = context.getBean(Car.class);
        System.out.println(car);
    }
}
