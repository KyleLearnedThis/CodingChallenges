package com.albion.dynamic.fibonnaci;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FibonacciTest {
    @DataProvider(name = "dp01")
    public Object[][] dataProvider() {
        return new Object[][] {
                {0,0},
                {1,1},
                {2,1},
                {10, 55},
                {17, 1597},
                {46, 1836311903}
        };
    }

    @Test(dataProvider = "dp01")
    public void testV1(int input, int expected) throws Exception {
        Fibonacci fn = new Fibonacci();
        int actual = fn.v1(input);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dp01")
    public void testV2(int input, int expected) throws Exception {
        Fibonacci fn = new Fibonacci();
        int actual = fn.v2(input);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dp01")
    public void testV3(int input, int expected) throws Exception {
        Fibonacci fn = new Fibonacci();
        int actual = fn.v3(input);
        Assert.assertEquals(actual, expected);
    }
}