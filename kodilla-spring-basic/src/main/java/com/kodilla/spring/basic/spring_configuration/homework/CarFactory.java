package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;

@Configuration
public class CarFactory {

    @Bean
    public Car carSeason(String season, LocalTime localTime){
        Car car;

        if (season == "lato") {
            car = new Cabrio();
        } else if (season == "zima") {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        return car;
    }

}
