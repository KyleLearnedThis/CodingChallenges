package com.albion.lists.ranks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RelativeRanksTest {
    @Test
    public void testFindRelativeRanks() throws Exception {
        int[] input = {5, 4, 3, 2, 1};
        String[] expected = {"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"};
        RelativeRanks g = new RelativeRanks();
        String[] actual = g.findRelativeRanks(input);
        Assert.assertEquals(actual.length, expected.length);
        for (int i = 0; i < actual.length; i++) {
            Assert.assertEquals(actual[i], expected[i]);
        }
    }

}