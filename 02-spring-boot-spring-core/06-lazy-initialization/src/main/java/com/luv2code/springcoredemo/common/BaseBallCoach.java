package com.luv2code.springcoredemo.common;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{
    public BaseBallCoach() {
        System.out.println("Constructor invoked "+ getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice Base Ball";
    }
}
