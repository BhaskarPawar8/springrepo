package com.bhaskar.annotationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static void main(String[] args) {
        System.out.println("Hello Spring");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

/*        Vehicle vehObj = (Vehicle) applicationContext.getBean("bike");
        vehObj.drive();
                Tyre t = (Tyre) applicationContext.getBean("tyre");
        System.out.println(t);
        */

        Car carObj = (Car) applicationContext.getBean("car");
        carObj.drive();

    }
}
