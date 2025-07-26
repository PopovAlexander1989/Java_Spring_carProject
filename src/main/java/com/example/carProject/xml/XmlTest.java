package com.example.carProject.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-xml.xml");
        Car car = context.getBean("car", Car.class);
        System.out.println(car);
    }
}