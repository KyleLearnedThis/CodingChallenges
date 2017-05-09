package com.albion.classics.route;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AirportRouteTest {

    @Test
    public void testMakeRoute() throws Exception {
        String[][] shortTrips = {
                {"HNL", "SFO"},
                {"SFO", "SEA"},
                {"SEA", "BOS"},
                {"BOS", "JFK"}
        };

        String[] x = {"HNL", "SFO", "SEA", "BOS", "JFK"};
        List<String> expected = new ArrayList<>(Arrays.asList(x));

        AirportRoute airportRoute = new AirportRoute();
        List<String> actual = airportRoute.makeRoute(shortTrips);
        boolean result = actual.equals(expected);
        Assert.assertTrue(result);
    }

}