package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public interface Car {
    default boolean hasHeadlightsTurnedOn(){
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("H:mm");
        LocalTime localTime = LocalTime.now();
        LocalTime start = LocalTime.parse("20:00",formatter);
        LocalTime end = LocalTime.parse("6:00", formatter);
         if (localTime.isAfter(start) && localTime.isBefore(end)) {
            return true;
        }
        else {
            return false;
        }
    }

    String getCarType();
}
