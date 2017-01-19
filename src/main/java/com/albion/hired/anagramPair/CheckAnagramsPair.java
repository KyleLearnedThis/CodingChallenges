package com.albion.hired.anagramPair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://github.com/sofrlowi/hired-challenges/blob/master/hired_challenge_1.png
 *
 */
public class CheckAnagramsPair {

    public List<Integer> anagramPairs(String[] p1, String[] p2) {
        List<Integer> list = new ArrayList<>();

        if(p1.length != p2.length) {
            return list;
        }
        for (int i = 0; i < p1.length; i++) {
            String r1 = sortCharacters(p1[i]);
            String r2 = sortCharacters(p2[i]);
            if(r1.equals(r2)) {
                list.add(1);
            } else {
                list.add(0);
            }
        }
        return list;
    }

    private String sortCharacters(String input) {
        char[] x = input.toCharArray();
        Arrays.sort(x);
        return new String(x);
    }
}
