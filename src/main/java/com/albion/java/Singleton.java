package com.albion.java;


public class Singleton {
    private static volatile Singleton instance;
    private Singleton() {}

    synchronized private static void newInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
    }

    public static Singleton get() {
        if(instance == null) {
            newInstance();
        }
        return instance;
    }
}

