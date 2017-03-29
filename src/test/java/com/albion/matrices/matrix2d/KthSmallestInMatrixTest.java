package com.albion.matrices.matrix2d;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KthSmallestInMatrixTest {
    @Test
    public void testKthSmallest() throws Exception {
        int[][] input = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;
        int expected = 13;
        KthSmallestInMatrix km = new KthSmallestInMatrix();
        int actual = km.kthSmallest(input, k);
        Assert.assertEquals(actual,expected);
    }
}