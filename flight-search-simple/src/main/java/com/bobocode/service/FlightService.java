package com.bobocode.service;

import java.util.List;

/**
 * {@link FlightService} provides an API that allows to manage flight numbers
 */
public class FlightService {

    /**
     * Adds a new flight number
     *
     * @param flightNumber a flight number to add
     * @return {@code true} if a flight number was added, {@code false} otherwise
     */
    public boolean registerFlight(String flightNumber) {
        throw new UnsupportedOperationException();// todo: implement this method
    }

    /**
     * Returns all flight numbers that contains a provided key.
     *
     * @param query a search query
     * @return a list of found flight numbers
     */
    public List<String> searchFlights(String query) {
        throw new UnsupportedOperationException();// todo: implement this method
    }
}
