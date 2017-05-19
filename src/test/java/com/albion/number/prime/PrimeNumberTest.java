package com.albion.number.prime;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PrimeNumberTest {
    PrimeNumber primeNumber;

    @BeforeClass
    public void setUp() {
        primeNumber = new PrimeNumber();
        primeNumber.fillSieve();
    }

    @DataProvider(name = "dp01")
    public Object[][] makeData() {
        int x1 = 7919;
        boolean e1 = true;
        int x2 = 7918;
        boolean e2 = false;
        int x3 = 11;
        boolean e3 = true;
        return new Object[][] {
                {x1, e1},
                {x2, e2},
                {x3, e3}
        };
    }

    @Test(dataProvider = "dp01")
    public void testIsPrime(int input, boolean expected) throws Exception {
        boolean actual = primeNumber.isPrime(input);
        Assert.assertEquals(actual, expected);
    }
}