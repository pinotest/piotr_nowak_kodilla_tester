package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure){
        List <Flight> departureFlights = new ArrayList<>();
        List <Flight> actualFlightRepository = FlightRepository.getFlightsTable();
        for (Flight flight: actualFlightRepository
             ) { if (flight.getDeparture().equals(departure))
                 departureFlights.add(flight);
        }
        return departureFlights;
    }
    public List<Flight> findFlightsTo(String arrival){
        List <Flight> arrivalFlights = new ArrayList<>();
        List <Flight> actualFlightRepository = FlightRepository.getFlightsTable();
        for (Flight flight: actualFlightRepository
        ) { if (flight.getArrival().equals(arrival))
            arrivalFlights.add(flight);
        }
        return arrivalFlights;

    }
}
