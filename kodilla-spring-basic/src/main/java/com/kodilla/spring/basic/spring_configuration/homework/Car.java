package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public interface Car {
    default boolean hasHeadlightsTurnedOn(){
        LocalTime localTime = LocalTime.now();
        LocalTime start = LocalTime.parse("20:00");
        LocalTime end = LocalTime.parse("6:00");

        if (localTime.isAfter(start) && localTime.isBefore(end)) {
            return true;
        }
        else {
            return false;
        }
    }

    String getCarType();
}
