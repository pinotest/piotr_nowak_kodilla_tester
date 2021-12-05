package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalTime;
import java.util.Random;

@Configuration
public class CarFactory {

    private Car car;

    @Bean
    public Car carSeason(){
        Random random = new Random();
        int season =  random.nextInt(3);
        //0 - lato, 1 - zima, 2,3 wiosna, jesień
        if (season == 0) {
            car = new Cabrio();
        } else if (season == 1) {
            car = new SUV();
        } else {
            car = new Sedan();
        }
        car.getCarType();
        return car;
    }

    public boolean isLightsOn(){
        return car.hasHeadlightsTurnedOn();
    }

}
