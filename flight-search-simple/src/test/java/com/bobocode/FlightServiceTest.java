package com.bobocode;

import com.bobocode.service.FlightService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class FlightServiceTest {

    private FlightService flightService = new FlightService();

    @Test
    public void testRegisterFlight() {
        boolean registered = flightService.registerFlight("PR344");

        assertTrue(registered);
    }

    @Test
    public void testRegisterSameFlightTwice() {
        flightService.registerFlight("RB122");

        boolean registeredSecondTime = flightService.registerFlight("RB122");

        assertFalse(registeredSecondTime);
    }

    @Test
    public void testSearchExistingFlightByFullNumber() {
        flightService.registerFlight("OL234");
        flightService.registerFlight("KM23234");
        flightService.registerFlight("LTE114");
        flightService.registerFlight("BRT14");


        List<String> foundFlights = flightService.searchFlights("LTE114");

        assertEquals(1, foundFlights.size());
        assertEquals("LTE114", foundFlights.get(0));
    }

    @Test
    public void testSearchNonExistingFlight() {
        List<String> foundFlights = flightService.searchFlights("XXX");

        assertNotNull(foundFlights);
    }

    @Test
    public void testSearchFlights() {
        flightService.registerFlight("OR1214");
        flightService.registerFlight("BTR14");
        flightService.registerFlight("BMK198");
        flightService.registerFlight("RLR198");

        List<String> foundFlights = flightService.searchFlights("R1");

        assertTrue(foundFlights.contains("OR1214"));
        assertTrue(foundFlights.contains("BTR14"));
        assertTrue(foundFlights.contains("RLR198"));
        assertEquals(3, foundFlights.size());

    }


}
