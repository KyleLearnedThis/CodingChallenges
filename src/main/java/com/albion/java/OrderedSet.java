package com.albion.java;

import java.util.Set;
import java.util.TreeSet;

public class OrderedSet {
    public static void main(String[] args){
        int[] x = {9,8,7,5,6,4,1,2,3};
        Set<Integer> set = makeSet(x);

        print(set);
    }

    public static Set<Integer> makeSet(int[] input){
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
        }
        return set;
    }

    public static void print(Set<Integer> set){
        for(Integer i : set){
            System.out.print(" " + i);
        }
        System.out.println("");
    }
}
