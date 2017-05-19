package com.albion.java;

public class SystemExit {
    public static void main(String[] args){
        System.out.println("System.exit() on catch block, finally block won't be executed");
        try{
            System.out.println("try");
        } catch(Exception e) {
            System.out.println("Catch");
            System.exit(0);
        } finally {
            System.out.println("Exit");
        }
    }
}
