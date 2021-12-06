package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Random;

@Component
@Scope("prototype")
public class Clock {
    public Clock(){
        LocalTime localTime = LocalTime.now();
        Random random = new Random();
        System.out.println("Random Number: "+random.nextInt(100));
        System.out.println("Actual time: "+ localTime);
    }
}
