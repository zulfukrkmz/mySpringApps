package com.zulfu.springCore.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BasketballCoach implements Coach{

    public BasketballCoach(){
        System.out.println("Basketball constructor worked.");
    }
    @Override
    public String getDailyWorkout() {
        return "Do 100 cross over and 100 3ple shoot.";
    }
}
