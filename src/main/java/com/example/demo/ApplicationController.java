package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ApplicationController {

    @Autowired
    private Environment environment;


    @GetMapping
    public String greet(){
        return environment.getProperty("myCustomVarTree.welcomeMsg");
    }
}
