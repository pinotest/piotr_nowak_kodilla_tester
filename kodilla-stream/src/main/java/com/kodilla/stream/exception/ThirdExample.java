package com.kodilla.stream.exception;

public class ThirdExample {
    public static void main(String[] args) {
        AirportRepository airportRepository = new AirportRepository();
        boolean isViennainUse = false;
        try {
            isViennainUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: "+isViennainUse);

        } catch (AirportNotFoundException e) {
            System.out.println("No such port in Airpot repository");
        } finally {
            System.out.println("Thanks");

        }

    }
}
