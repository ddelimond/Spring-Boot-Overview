package com.darrendelimond.firstSpringApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @GetMapping("/")
    public String sayHello(){


        return "Hello Gabriel and Brenda";
    }
}
