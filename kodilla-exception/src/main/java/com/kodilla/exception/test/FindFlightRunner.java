package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlightRunner {

    public static void main(String[] args) {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("London", true);
        flightMap.put("New York", false);

        FlightFinder flightFinder = new FlightFinder(flightMap);

        try {
            flightFinder.findFlight("Sydney");
        } catch (RouteNotFoundException e) {
            System.out.println("Route not found. Please try again!");
        }

    }
}
