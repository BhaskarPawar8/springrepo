package com.bhaskar.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Spring");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Vehicle vehObj = (Vehicle) applicationContext.getBean("vehicle");
        vehObj.drive();

    }
}
