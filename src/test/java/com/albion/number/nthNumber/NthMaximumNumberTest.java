package com.albion.number.nthNumber;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class NthMaximumNumberTest {
    @Test
    public void testLargest() throws Exception {
        int[] input = {9,8,7,5,6,1,2,4,3};
        NthMaximumNumber n = new NthMaximumNumber();
        int[] actual = n.largest(input, 3);
        int[] expected = {7,8,9};
        boolean result = Arrays.equals(actual,expected);
        Assert.assertTrue(result);
    }

    @DataProvider(name = "d01")
    public Object[][] makeDataProvider() {
        int[] x1 = {2,3,1};
        int y1 = 1;
        int[] x2 = {1,2};
        int y2 = 2;
        int[] x3 = {2, 2, 3, 1};
        int y3 = 1;
        return new Object[][] {
                {x1, y1},
                {x2, y2},
                {x3, y3}
        };
    }
    @Test(dataProvider = "d01")
    public void testThirdMax(int[] input, int expected) throws Exception {
        NthMaximumNumber n = new NthMaximumNumber();
        int actual = n.thirdMax(input);
        Assert.assertEquals(actual, expected);
    }

}