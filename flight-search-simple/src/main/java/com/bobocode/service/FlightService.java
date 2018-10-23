package com.bobocode.service;

import java.util.List;

/**
 * {@link FlightService} provides an API that allows to manage flight numbers
 * <p>
 * todo: 1. Using {@link com.bobocode.data.FlightDao} implement method {@link FlightService#registerFlight(String)}
 * todo: 2. Using {@link com.bobocode.data.FlightDao} implement method {@link FlightService#searchFlights(String)}
 */
public class FlightService {

    /**
     * Adds a new flight number
     *
     * @param flightNumber a flight number to add
     * @return {@code true} if a flight number was added, {@code false} otherwise
     */
    public boolean registerFlight(String flightNumber) {
        throw new UnsupportedOperationException("It's your job to implement this method");
    }

    /**
     * Returns all flight numbers that contains a provided key.
     *
     * @param query a search query
     * @return a list of found flight numbers
     */
    public List<String> searchFlights(String query) {
        throw new UnsupportedOperationException("It's your job to implement this method");
    }
}
