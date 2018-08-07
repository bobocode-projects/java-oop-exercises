package com.bobocode.data;

import com.bobocode.service.Flights;

import java.util.HashSet;
import java.util.Set;

public class FlightDao implements Flights {
    private Set<String> flights = new HashSet<>();

    /**
     * Stores a new flight number
     *
     * @param flightNumber a flight number to store
     * @return {@code true} if a flight number was stored, {@code false} otherwise
     */
    public boolean register(String flightNumber) {
        return flights.add(flightNumber);
    }

    /**
     * Returns all stored flight numbers
     *
     * @return a set of flight numbers
     */
    public Set<String> findAll() {
        return flights;
    }

}
