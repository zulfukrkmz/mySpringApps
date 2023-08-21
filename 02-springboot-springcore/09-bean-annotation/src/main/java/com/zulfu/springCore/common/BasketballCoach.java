package com.zulfu.springCore.common;

import org.springframework.stereotype.Component;

@Component

public class BasketballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Do 100 cross over and 100 3ple shoot.";
    }
}
