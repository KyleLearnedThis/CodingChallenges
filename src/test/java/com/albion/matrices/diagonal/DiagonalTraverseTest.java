package com.albion.matrices.diagonal;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class DiagonalTraverseTest {
    @Test
    public void testFindDiagonalOrder() throws Exception {
        int[][] input = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] expected = {1,2,4,7,5,3,6,8,9};
        DiagonalTraverse d = new DiagonalTraverse();
        int[] actual = d.findDiagonalOrder(input);
        boolean isEqual = Arrays.equals(expected, actual);
        Assert.assertTrue(isEqual);
    }
}