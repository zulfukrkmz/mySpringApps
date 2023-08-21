package com.zulfu.springCore.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Do 20 minute run. :)";
    }
}
