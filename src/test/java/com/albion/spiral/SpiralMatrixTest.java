package com.albion.spiral;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class SpiralMatrixTest {
    @Test
    public void testSpiralOrder() throws Exception {
        int[][] input = {
                {1,2,3,},
                {8,9,4},
                {7,6,5}
        };
        SpiralMatrix s = new SpiralMatrix();
        List<Integer> actual = s.spiralOrder(input);
        List<Integer> expected = new ArrayList<>();
        IntStream.rangeClosed(1, 9).forEach(i->expected.add(i));
        Assert.assertEquals(actual.size(), expected.size());
        Assert.assertTrue(expected.containsAll(actual) && actual.containsAll(expected));
    }

}