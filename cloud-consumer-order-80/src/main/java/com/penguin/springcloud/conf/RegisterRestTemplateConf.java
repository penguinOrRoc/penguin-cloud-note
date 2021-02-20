package com.penguin.springcloud.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RegisterRestTemplateConf {
    @Bean
    public RestTemplate getRestTemplate()
    {
        return new RestTemplate();
    }
    //applicationContext.xml <bean id="" class="">
}


