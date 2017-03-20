package com.albion.lists.merge;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MergeSortedDataTest {

    @DataProvider(name = "dp01")
    public Object[][] makeData(){
        //Center overlap
        int[] a1 = {2,3,4,5};
        int[] b1 = {4,5,6,7,8};
        int[] r1 = {2,3,4,4,5,5,6,7,8};

        //No overlap;
        int[] a2 = {1,2,3,4};
        int[] b2 = {5,6,7,8};
        int[] r2 = {1,2,3,4,5,6,7,8};

        //b is in a
        int[] a3 = {1,2,3,4};
        int[] b3 = {2,3};
        int[] r3 = {1,2,2,3,3,4};

        return new Object[][]{
                {a1,b1,r1},
                {a2,b2,r2},
                {a3,b3,r3}
        };
    }

    @Test(dataProvider = "dp01")
    public void testMergeSortedArray(int[] a, int[] b, int[] expected) throws Exception {
        MergeSortedData m = new MergeSortedData();
        int[] actual = m.mergeSortedArray(a, b);
        boolean result = Arrays.equals(actual, expected);
        Assert.assertTrue(result);
    }
}