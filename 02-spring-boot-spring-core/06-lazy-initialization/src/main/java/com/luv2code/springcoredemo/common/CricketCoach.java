package com.luv2code.springcoredemo.common;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("Constructor invoked " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "CricketCoach: Practice fast bowling for 15 minutes everyday";
    }
}
