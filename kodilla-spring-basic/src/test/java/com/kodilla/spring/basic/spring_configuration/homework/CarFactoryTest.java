package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.util.Arrays;
import java.util.List;


@SpringBootTest
class CarFactoryTest {

    @Test
    void shouldCreateCar() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("carSeason");
        //When
        String carType = car.getCarType();
        System.out.println("carType: "+carType);
        //Then
        List<String> possibleCars = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleCars.contains(carType));
    }

    @Test
    void isLightsOn() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car  = (Car) context.getBean("carSeason");
        //When0
        Boolean lightsAreOn = car.hasHeadlightsTurnedOn();
        //Then
        Assertions.assertFalse(lightsAreOn);
    }
}