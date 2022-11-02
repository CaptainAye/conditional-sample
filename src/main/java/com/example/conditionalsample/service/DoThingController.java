package com.example.conditionalsample.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "dothing")
public class DoThingController {

    private final DoThingInterface doThing;

    public DoThingController(DoThingInterface doThing) {
        this.doThing = doThing;
    }

    @GetMapping
    public void doThing() {
        doThing.doThing();

    }
}
