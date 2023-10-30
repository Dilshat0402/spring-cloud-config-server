package com.example.limits_microservice.controllers;

import com.example.limits_microservice.configuration.Configuration;
import com.example.limits_microservice.models.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    Configuration configuration;


    @GetMapping("/limits")
    public Limits getLimits(){
        return new Limits(configuration.getMinimum(),configuration.getMaximum());
    }
}
