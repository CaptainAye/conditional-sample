package com.example.conditionalsample.service;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(DoThing1Condition.class)
public class DoThing1Service implements DoThingInterface{
    @Override
    public void doThing() {
        System.out.println("Do thing 1");
    }
}
