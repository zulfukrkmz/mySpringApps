package com.zulfu.springCore.rest;

import com.zulfu.springCore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutDemoController {
    //dependency ihtiyacı olan bir private değişken
    private Coach myCoach;
    private Coach anotherCoach;

    //dependency injection olan bir constructor
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }


    //constructor silip set metodu yazdık
    @Autowired
    public void WorkoutDemoController (@Qualifier("cricketCoach") Coach theCoach, @Qualifier("cricketCoach") Coach theAnotherCoach) {
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
    }

    @GetMapping("/check")
    public String check(){
        return "Is there 1 instance for beans? answer = " + (myCoach == anotherCoach);
    }


}
