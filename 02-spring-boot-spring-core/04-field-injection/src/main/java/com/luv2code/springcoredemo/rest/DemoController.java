package com.luv2code.springcoredemo.rest;


import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @Autowired
    private Coach coach;

   // no need of constructor or setter

    @GetMapping("/dailyworkout")
    public  String getDailyWorkou(){
        return  coach.getDailyWorkout();
    }

}
