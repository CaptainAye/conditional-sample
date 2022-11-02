package com.example.conditionalsample.service;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(DoThing2Condition.class)
public class DoThing2Service implements DoThingInterface{
    @Override
    public void doThing() {
        System.out.println("Do thing 2");
    }
}
