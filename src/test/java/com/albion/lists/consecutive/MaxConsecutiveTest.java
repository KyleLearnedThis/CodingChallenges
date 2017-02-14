package com.albion.lists.consecutive;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class MaxConsecutiveTest {
    @DataProvider(name = "dp01")
    public Object[][] provider() {
        int[] x1a = {1,1,0,1,1,1};
        int x1b = 3;
        int[] x2a = {1,0,1,1,0,1};
        int x2b = 2;
        int[] x3a = {1};
        int x3b = 1;
        return new Object[][] {
                {x1a, x1b},
                {x2a, x2b},
                {x3a, x3b}
        };
    }
    @Test(dataProvider = "dp01")
    public void testFindMaxConsecutiveOnes(int[]input, int expected) throws Exception {
        MaxConsecutive m = new MaxConsecutive();
        int actual = m.findMaxConsecutiveOnes(input);
        Assert.assertEquals(actual,expected);
    }

}