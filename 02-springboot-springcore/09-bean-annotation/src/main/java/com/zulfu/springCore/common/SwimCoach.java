package com.zulfu.springCore.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("SwimCoach constructor worked.");
    }
    @Override
    public String getDailyWorkout() {
        return "swim 2km today !";
    }
}
