package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public interface Car {
    default boolean hasHeadlightsTurnedOn(){
        DateTimeFormatter formatter =DateTimeFormatter.ofPattern("H:mm");
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime start = LocalTime.parse("20:00",formatter);
        LocalTime end = LocalTime.parse("10:00", formatter);
        System.out.println("LoghtsON?: "+(localTime.isAfter(start) && localTime.isBefore(end)));
        return (localTime.isAfter(start) || localTime.isBefore(end)) ;
    }

    String getCarType();
}
