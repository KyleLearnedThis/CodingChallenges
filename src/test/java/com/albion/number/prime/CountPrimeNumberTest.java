package com.albion.number.prime;

import com.albion.graphs.highway.Assert;
import org.testng.annotations.Test;

public class CountPrimeNumberTest {
    @Test
    public void testCountPrimes() throws Exception {
        int input = 8;
        int expected = 4;
        CountPrimeNumber cpn = new CountPrimeNumber();
        int actual = cpn.countPrimes(input);
        Assert.assertEquals(expected,actual);
    }

}