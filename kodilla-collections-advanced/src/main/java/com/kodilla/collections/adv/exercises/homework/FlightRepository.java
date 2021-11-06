package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {
    static List<Flight> flightRepository = new ArrayList<>();

    public static void setFlightRepository() {
        flightRepository.clear();
        flightRepository.add(new Flight("Warsaw","Berlin"));
        flightRepository.add(new Flight("Warsaw","New York"));
        flightRepository.add(new Flight("Warsaw","Tokyo"));
        flightRepository.add(new Flight("Warsaw","Toronto"));
        flightRepository.add(new Flight("London","Warsaw"));
        flightRepository.add(new Flight("London","New York"));
        flightRepository.add(new Flight("New York","Warsaw"));

    }

    public static List<Flight> getFlightsTable(){
        setFlightRepository();
        return flightRepository;
    }

}
