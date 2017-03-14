package com.albion.java;

import com.albion.lists.shuffle.FisherYatesShuffle;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Exercise in java 1.8
 * 1. to generate Integer array
 * 2. convert that into int[]
 * 3. Sort reverse order of Integer[]
 */
public class SortUtils {
    public static void main(String[] args){
        Integer[] i1 = getData(1, 10);
        int[] i2 = convert(i1);

        FisherYatesShuffle shuffle = new FisherYatesShuffle();
        shuffle.fisherYatesShuffle(i2);

        Arrays.sort(i2);
        print(i2);

        Arrays.sort(i1, Collections.reverseOrder());
        i2 = convert(i1);
        System.out.println("AFTER...");
        print(i2);
    }

    public static Integer[] getData(int low, int high) {
        Integer[] i1 = IntStream.rangeClosed(low,high).boxed().toArray(Integer[]::new);
        return i1;
    }

    public static int[] convert(Integer[] i1) {
        int[] i2 = Stream.of(i1).mapToInt(Integer::intValue).toArray();
        return i2;
    }

    public static void print(int[] i2){
        for (int i = 0; i < i2.length; i++) {
            System.out.print(" " + i2[i]);
        }
        System.out.println("");
    }
}
