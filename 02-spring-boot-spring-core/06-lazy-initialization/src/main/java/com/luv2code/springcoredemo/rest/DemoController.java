package com.luv2code.springcoredemo.rest;


import com.luv2code.springcoredemo.common.Coach;
import com.luv2code.springcoredemo.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
    private final Coach coach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach coach) {  //@Qualifier has higher priority than @Primary so here CricketCoach will be injected even though TrackCoach has @Primary
        System.out.println("Constructor invoked "+ getClass().getSimpleName());
        this.coach = coach;
    }

    @GetMapping("/dailyworkout")
    public  String getDailyWorkou(){
        return  coach.getDailyWorkout();
    }

}
