package com.albion.number.missing;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MissingNumberTest {

    @Test
    public void testMissingNumber() {
        int[] x = {0,1,2,4,5,6,7};
        MissingNumber mn = new MissingNumber();
        int actual = mn.missingNumber(x);
        Assert.assertEquals(actual, 3);
    }
}