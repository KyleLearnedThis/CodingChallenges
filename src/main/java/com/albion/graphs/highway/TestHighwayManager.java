package com.albion.graphs.highway;


import org.testng.annotations.Test;

public class TestHighwayManager {

    /**
     * This test method is implemented for you
     */
    @Test
    public void testClosestCity() throws AssertException {
        System.out.println("running testClosestCity()");

        HighwayManager highwayMgr = new HighwayManager();
        highwayMgr.buildHighway("San Francisco", "Oakland", 12);
        highwayMgr.buildHighway("San Francisco", "San Jose", 48);
        highwayMgr.buildHighway("San Jose", "Oakland", 41);

        String closestToSF = highwayMgr.getClosestCity("San Francisco");
        String closestToOAK = highwayMgr.getClosestCity("Oakland");
        String closestToSJ = highwayMgr.getClosestCity("San Jose");

        Assert.assertEquals("Oakland", closestToSF);
        Assert.assertEquals("San Francisco", closestToOAK);
        Assert.assertEquals("Oakland", closestToSJ);

        System.out.println("testClosestCity() passed successfully");
    }

    /**
     * This test method is implemented for you
     */
    @Test
    public void testClosestCityFull() throws AssertException {
        System.out.println("running testClosestCityFull()");

        HighwayManager highwayMgr = new HighwayManager();
        highwayMgr.buildHighway("San Francisco", "Oakland", 12);
        highwayMgr.buildHighway("San Francisco", "San Jose", 48);
        highwayMgr.buildHighway("San Jose", "Oakland", 41);

        highwayMgr.buildHighway("Sacramento", "Oakland", 87);
        highwayMgr.buildHighway("Sacramento", "Fresno", 171);
        highwayMgr.buildHighway("Fresno", "Bakersfield", 109);
        highwayMgr.buildHighway("Bakersfield", "San Luis Obispo", 130);
        highwayMgr.buildHighway("San Luis Obispo", "San Jose", 185);
        highwayMgr.buildHighway("San Luis Obispo", "Los Angeles", 189);
        highwayMgr.buildHighway("Los Angeles", "Bakersfield", 112);
        highwayMgr.buildHighway("Los Angeles", "San Bernardino", 60);
        highwayMgr.buildHighway("Los Angeles", "San Diego", 130);
        highwayMgr.buildHighway("San Diego", "San Bernardino", 108);

        String closestToSF = highwayMgr.getClosestCity("San Francisco");
        String closestToOAK = highwayMgr.getClosestCity("Oakland");
        String closestToSJ = highwayMgr.getClosestCity("San Jose");

        String closestToSAC = highwayMgr.getClosestCity("Sacramento");
        String closestToFRE = highwayMgr.getClosestCity("Fresno");
        String closestToBAK = highwayMgr.getClosestCity("Bakersfield");
        String closestToSLO = highwayMgr.getClosestCity("San Luis Obispo");
        String closestToLA = highwayMgr.getClosestCity("Los Angeles");
        String closestToSB = highwayMgr.getClosestCity("San Bernardino");
        String closestToSD = highwayMgr.getClosestCity("San Diego");

        Assert.assertEquals("Oakland", closestToSF);
        Assert.assertEquals("San Francisco", closestToOAK);
        Assert.assertEquals("Oakland", closestToSJ);

        Assert.assertEquals("Oakland", closestToSAC);
        Assert.assertEquals("Bakersfield", closestToFRE);
        Assert.assertEquals("Fresno", closestToBAK);
        Assert.assertEquals("Bakersfield", closestToSLO);
        Assert.assertEquals("San Bernardino", closestToLA);
        Assert.assertEquals("Los Angeles", closestToSB);
        Assert.assertEquals("San Bernardino", closestToSD);

        System.out.println("testClosestCityFull() passed successfully");
    }

    /**
     * This test method is implemented for you
     */
    @Test
    public void testDistanceBetweenCitiesShort() throws AssertException {
        System.out.println("running testDistanceBetweenCitiesShort()");

        HighwayManager highwayMgr = new HighwayManager();
        highwayMgr.buildHighway("San Francisco", "Oakland", 12);
        highwayMgr.buildHighway("San Francisco", "San Jose", 48);
        highwayMgr.buildHighway("San Jose", "Oakland", 41);
        highwayMgr.buildHighway("Sacramento", "Oakland", 87);

        int shortestRoute = highwayMgr.getShortestDistanceBetweenCities("San Jose", "Sacramento");

        Assert.assertEquals(128, shortestRoute);

        System.out.println("testDistanceBetweenCitiesShort() passed successfully");
    }

    /**
     * This test method is implemented for you
     */
    @Test
    public void testDistanceBetweenCitiesFull() throws AssertException {
        System.out.println("running testDistanceBetweenCitiesFull()");

        HighwayManager highwayMgr = new HighwayManager();
        highwayMgr.buildHighway("San Francisco", "Oakland", 12);
        highwayMgr.buildHighway("San Francisco", "San Jose", 48);
        highwayMgr.buildHighway("San Jose", "Oakland", 41);

        highwayMgr.buildHighway("Sacramento", "Oakland", 87);
        highwayMgr.buildHighway("Sacramento", "Fresno", 171);
        highwayMgr.buildHighway("Fresno", "Bakersfield", 109);
        highwayMgr.buildHighway("Bakersfield", "San Luis Obispo", 130);
        highwayMgr.buildHighway("San Luis Obispo", "San Jose", 185);
        highwayMgr.buildHighway("San Luis Obispo", "Los Angeles", 189);
        highwayMgr.buildHighway("Los Angeles", "Bakersfield", 112);
        highwayMgr.buildHighway("Los Angeles", "San Bernardino", 60);
        highwayMgr.buildHighway("Los Angeles", "San Diego", 130);
        highwayMgr.buildHighway("San Diego", "San Bernardino", 108);

        int SFtoLA = highwayMgr.getShortestDistanceBetweenCities("San Francisco", "Los Angeles");
        int SACtoSLO = highwayMgr.getShortestDistanceBetweenCities("Sacramento", "San Luis Obispo");
        int SDtoSAC = highwayMgr.getShortestDistanceBetweenCities("San Diego", "Sacramento");

        Assert.assertEquals(422, SFtoLA);
        Assert.assertEquals(313, SACtoSLO);
        Assert.assertEquals(522, SDtoSAC);
        System.out.println("testDistanceBetweenCitiesFull() passed successfully");
    }


    /**
     * Deleted route between San Jose to San Luis Obispo.
     */
    @Test
    public void testDistanceBetweenCitiesDeleted() throws AssertException {
        System.out.println("running testDistanceBetweenCitiesFull()");

        HighwayManager highwayMgr = new HighwayManager();
        highwayMgr.buildHighway("San Francisco", "Oakland", 12);
        highwayMgr.buildHighway("San Francisco", "San Jose", 48);
        highwayMgr.buildHighway("San Jose", "Oakland", 41);

        highwayMgr.buildHighway("Sacramento", "Oakland", 87);
        highwayMgr.buildHighway("Sacramento", "Fresno", 171);
        highwayMgr.buildHighway("Fresno", "Bakersfield", 109);
        highwayMgr.buildHighway("Bakersfield", "San Luis Obispo", 130);
        highwayMgr.buildHighway("San Luis Obispo", "San Jose", 185);
        highwayMgr.buildHighway("San Luis Obispo", "Los Angeles", 189);
        highwayMgr.buildHighway("Los Angeles", "Bakersfield", 112);
        highwayMgr.buildHighway("Los Angeles", "San Bernardino", 60);
        highwayMgr.buildHighway("Los Angeles", "San Diego", 130);
        highwayMgr.buildHighway("San Diego", "San Bernardino", 108);

        int SFtoLA = highwayMgr.getShortestDistanceBetweenCities("San Francisco", "Los Angeles");
        Assert.assertEquals(422, SFtoLA);

        highwayMgr.destroyHighway("San Jose", "San Luis Obispo");
        SFtoLA = highwayMgr.getShortestDistanceBetweenCities("San Francisco", "Los Angeles");
        Assert.assertEquals(491, SFtoLA);
        System.out.println("testDistanceBetweenCitiesFull() passed successfully");
    }
}
