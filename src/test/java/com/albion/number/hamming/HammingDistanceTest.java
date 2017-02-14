package com.albion.number.hamming;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HammingDistanceTest {
    @DataProvider(name = "dp01")
    public Object[][] makeDataProvider() {
        return new Object[][] {
                {4,2,2},  {4,1,2}
        };
    }
    @Test(dataProvider = "dp01")
    public void testHammingDistance(int x, int y, int expected) throws Exception {
        HammingDistance h = new HammingDistance();
        int actual = h.hammingDistance(x,y);
        Assert.assertEquals(actual, expected);
    }

}