package com.zulfu.sb.app.firstSpringBootApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class firstRestController {

    @Value("${property.name}")
    private String propertyName;

    @GetMapping("/")
    public String sayHelloMethod () {
        return "Hello World from: "+propertyName;
    }

    @GetMapping("/menu")
    public String getDailyWorkout (){
        return "merci soup and watermelon :)";
    }

    @GetMapping("/future")
    public String fortuneMethod (){
        return "java developer";
    }
}
