package com.albion.lists.shuffle;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class FisherYatesShuffle {
    /**
     * Fisher–Yates shuffle
     * @param ar
     */
    public void fisherYatesShuffle(int[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
