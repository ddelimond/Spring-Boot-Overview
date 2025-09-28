package com.darrendelimond.firstSpringApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teaminfo")

    public String getTeamInfo(){

        return  coachName + " plays for "+ teamName;
    }


    @GetMapping("/")
    public String sayHello(){


        return "Hello Gabriel and Brenda";
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return "Run a hard 5k";
    }


}
