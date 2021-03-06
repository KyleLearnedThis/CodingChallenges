package com.albion.sort.topK.v1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TopKElementsTest {
    @Test
    public void testTopKFrequent() throws Exception {
        int[] input = {1,2,2,3,3,3,4,4,4,4,5,5,5,5,5};
        int k = 3;
        int expected = 3;
        TopKElements t = new TopKElements();
        int actual = t.topKFrequent(input, k);
        Assert.assertEquals(actual, expected);
    }
}