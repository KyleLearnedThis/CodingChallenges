package com.albion.number.complement;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberComplementTest {
    @DataProvider(name = "dp01")
    public Object[][] makeDataProvider() {
        /**
         * 9 --> 1001 ==> 0110 : 6
         */
        return new Object[][] {
                {5,2},
                {9,6}
        };
    }

    @Test(dataProvider = "dp01")
    public void testFindComplement(int input, int expected) throws Exception {
        NumberComplement n = new NumberComplement();
        int actual = n.findComplement(input);
        Assert.assertEquals(actual, expected);
    }

}