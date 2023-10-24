package com.bhaskar.annotationBased;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("bhaag rhai hai.. ");
    }
}
