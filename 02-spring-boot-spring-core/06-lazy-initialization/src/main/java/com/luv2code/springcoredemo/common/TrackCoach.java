package com.luv2code.springcoredemo.common;


import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements  Coach{
    public TrackCoach() {
        System.out.println("Constructor invoked " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Track Coach : Run a Hard 5K!";
    }
}
