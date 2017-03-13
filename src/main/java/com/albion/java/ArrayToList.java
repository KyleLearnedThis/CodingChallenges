package com.albion.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args){
        Integer[] x = {8,7,6,9};

        List<Integer> list = Arrays.asList(x);
        System.out.println("BEFORE...");
        print(list);
        Collections.sort(list);
        System.out.println("AFTER...");
        print(list);
    }

    public static void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }
        System.out.println("");
    }
}
