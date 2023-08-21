package com.zulfu.springCore.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Do 150 passes. 50 freekicks. :)";
    }
}
