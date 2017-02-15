package com.albion.text.split;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CountSegmentsTest {
    @DataProvider(name = "dp01")
    public Object[][] makeDataProvider() {
        String s1 = ", , , ,        a, eaefa";
        int i1 = 6;
        String s2 = "    foo    bar";
        int i2 = 2;
        String s3 = "                ";
        int i3 = 0;
        return new Object[][]{
                {s1, i1},
                {s2, i2},
                {s3, i3}
        };
    }

    @Test(dataProvider = "dp01")
    public void testCountSegments(String input, int expected) throws Exception {
        CountSegments c = new CountSegments();
        int actual = c.countSegments(input);
        Assert.assertEquals(actual, expected);
    }

}