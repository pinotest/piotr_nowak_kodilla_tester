package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

public class Sedan implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn() {
        return Car.super.hasHeadlightsTurnedOn();
    }
    @Override
    public String getCarType() {
        return "Sedan";
    }
}
