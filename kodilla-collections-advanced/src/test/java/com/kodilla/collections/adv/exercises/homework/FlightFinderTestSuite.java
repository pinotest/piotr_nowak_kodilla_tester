package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.collections.adv.exercises.homework.FlightRepository.getFlightsTable;
import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {
    public FlightFinder flightFinder = new FlightFinder();

    @Test
    public void findFlightsFromWarsaw() {
        //given
       // FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> results = flightFinder.findFlightsFrom("Warsaw");
        List<Flight> expectedResults = new ArrayList<>();
        expectedResults.add(new Flight("Warsaw","Berlin"));
        expectedResults.add(new Flight("Warsaw","New York"));
        expectedResults.add(new Flight("Warsaw","Tokyo"));
        expectedResults.add(new Flight("Warsaw","Toronto"));
        //then
        assertEquals(expectedResults,results);
    }
    @Test
    public void findFlightsFromToronto() {
        //given
      //  FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> results = flightFinder.findFlightsFrom("Toronto");
        List<Flight> expectedResults = new ArrayList<>();
        //then
        assertEquals(expectedResults,results);
    }
    @Test
    public void findFlightsFromNewYork() {
        //given
     //   FlightFinder flightFinder = new FlightFinder();
        //when
        List<Flight> results = flightFinder.findFlightsFrom("New York");
        List<Flight> expectedResults = new ArrayList<>();
        expectedResults.add(new Flight("New York","Warsaw"));
        //then
        assertEquals(expectedResults,results);
    }

    @Test
    public void findFlightsTo_Toronto() {
        //given
        //when
        List<Flight> results = flightFinder.findFlightsTo("Toronto");
        List<Flight> expectedResults = new ArrayList<>();
        expectedResults.add(new Flight("Warsaw","Toronto"));
        //then
        assertEquals(expectedResults,results);
    }
    @Test
    public void findFlightsTo_LondonShouldGiveEmptyList() {
        //given
        //when
        List<Flight> results = flightFinder.findFlightsTo("London");
        List<Flight> expectedResults = new ArrayList<>();

        //then
        assertEquals(expectedResults,results);
    }

    @Test
    public void findFlightsTo_SaoPaolo_checkEquals(){
        //given
        //when
        List<Flight> results = flightFinder.findFlightsTo("Paolo");
        List<Flight> expectedResults = new ArrayList<>();

        //then
        assertEquals(expectedResults,results);

    }
}