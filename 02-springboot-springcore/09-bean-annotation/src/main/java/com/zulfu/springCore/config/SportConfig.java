package com.zulfu.springCore.config;

import com.zulfu.springCore.common.Coach;
import com.zulfu.springCore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
