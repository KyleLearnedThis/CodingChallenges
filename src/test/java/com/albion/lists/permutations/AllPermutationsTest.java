package com.albion.lists.permutations;

import org.testng.annotations.Test;

public class AllPermutationsTest {
    @Test
    public void testAllPairs() throws Exception {
        int[] input = {1,2,3,4,5,6,7,8};
        AllPermutations allPairs = new AllPermutations();
        allPairs.allPairs(input);
    }
}