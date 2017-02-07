package com.albion.salesforce.highway;

public class Main {

    public static void main(String[] args) throws AssertException {
        TestHighwayManager test = new TestHighwayManager();
        test.testClosestCity();
        test.testClosestCityFull();
        test.testDistanceBetweenCitiesShort();
        test.testDistanceBetweenCitiesFull();
    }
}
