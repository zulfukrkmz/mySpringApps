package com.zulfu.springCore.rest;

import com.zulfu.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutDemoController {
    //dependency ihtiyacı olan bir private değişken
    private Coach myCoach;

    //dependency injection olan bir constructor
    @Autowired
    public WorkoutDemoController (Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
