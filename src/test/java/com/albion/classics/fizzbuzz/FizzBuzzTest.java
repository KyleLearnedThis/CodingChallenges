package com.albion.classics.fizzbuzz;

import junit.framework.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FizzBuzzTest {
    @Test
    public void testFizzBuzz() {
        String[] expected = {"1", "2", "Fizz", "4", "Buzz"};
        FizzBuzz fz = new FizzBuzz();
        List<String> actual = fz.fizzBuzz(5);
        Assert.assertTrue(expected.length == actual.size());
        for (int i = 0; i < expected.length; i++) {
            String x = expected[i];
            String y = actual.get(i);
            Assert.assertEquals(x, y);
        }
    }
}