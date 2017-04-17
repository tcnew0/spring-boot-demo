package com.springboot.start;

/**
 * Created by 15050886 on 2017/4/2.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by 15050886 on 2017/4/2.
 */
@SpringBootApplication
public class NormalMain {

    public static void main(String[] args) {
        SpringApplication.run(NormalMain.class , args);
    }

    @Bean
    public User getUser(){
        User user = new User();
        user.setId("100");
        user.setName("name");
        return user;
    }
}
