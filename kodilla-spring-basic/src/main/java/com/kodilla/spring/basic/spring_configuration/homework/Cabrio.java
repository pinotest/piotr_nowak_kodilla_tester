package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;


public class Cabrio implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return Car.super.hasHeadlightsTurnedOn();
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}
