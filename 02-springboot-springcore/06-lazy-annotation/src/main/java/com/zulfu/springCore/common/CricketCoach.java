package com.zulfu.springCore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("Cricket constructor worked.");
    }

    @Override
    public String getDailyWorkout() {
        return "Do 20 minute run. :)";
    }
}
