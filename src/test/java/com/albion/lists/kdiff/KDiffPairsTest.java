package com.albion.lists.kdiff;

import com.albion.graphs.highway.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class KDiffPairsTest {

    @DataProvider(name = "dp01")
    public Object[][] makeData01(){
        int[] x1 = {3, 1, 4, 1, 5};
        int k1 = 2;
        int n1 = 2;

        int[] x2 = {1, 2, 3, 4, 5};
        int k2 = 1;
        int n2 = 4;
        return new Object[][] {
                {x1, k1, n1},
                {x2, k2, n2}
        };
    }

    @Test(dataProvider = "dp01")
    public void testFindPairs(int[] input, int k, int expected) throws Exception {
        KDiffPairs kdp = new KDiffPairs();
        int actual = kdp.findPairs(input, k);
        Assert.assertEquals(expected,actual);
    }
}