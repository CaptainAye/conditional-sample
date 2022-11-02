package com.example.conditionalsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConditionalSampleApplication {

    public static void main(String[] args) {
        System.setProperty("DO_THING", "1");
        SpringApplication.run(ConditionalSampleApplication.class, args);
    }

}
