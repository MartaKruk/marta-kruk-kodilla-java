package com.kodilla.exception.test;

import java.util.Map;

public class FlightFinder {

    private final Map<String, Boolean> flightMap;

    public FlightFinder(Map<String, Boolean> flightMap) {
        this.flightMap = flightMap;
    }

    public void findFlight(String airport) throws RouteNotFoundException {

        if (flightMap.get(airport) != null && airport != null) {
            if (flightMap.get(airport)) {
                System.out.println("Success! Route to " + airport + " found!");
            } else {
                System.out.println("Sorry! Route to " + airport + " not found!");
            }
        } else {
            throw new RouteNotFoundException("Airport is null or does not exist.");
        }
    }

}
