package com.albion.lists.shuffle;

import java.util.Random;

public class FisherYatesShuffle {
    /**
     * Fisher–Yates shuffle
     * @param ar
     */
    public void fisherYatesShuffle(int[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
//        Random rnd = ThreadLocalRandom.current();
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
//            int index = rnd.nextInt(i + 1);
            int index = rnd.nextInt(i+1);

            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
