package com.albion.lists.shuffle;

import org.testng.annotations.Test;

public class ShuffleTest {
    @Test
    public void testShuffleArray() throws Exception {
        int[] input = {1,2,3,4,5,6,7,8,9,10};
        FisherYatesShuffle sh = new FisherYatesShuffle();
        sh.fisherYatesShuffle(input);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
    }

}