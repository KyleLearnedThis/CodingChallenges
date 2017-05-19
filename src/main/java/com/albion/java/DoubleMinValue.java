package com.albion.java;

public class DoubleMinValue {
    public static void main(String[] args){
        System.out.println("Which is smaller Integer.MIN_VALUE or 0?");
        System.out.println(Math.min(Integer.MIN_VALUE, 0));
        System.out.println("Which is smaller Double.MIN_VALUE or 0.0?");
        System.out.println(Math.min(Double.MIN_VALUE, 0.0));
    }
}
