package com.albion.anagram;

import java.util.Arrays;

class MyClass {
    public static void check_anagrams(String[] firstWords, String[] secondWords) {
        // Write your code here
        // To print results to the standard output you can use System.out.println()
        // Example: System.out.println("Hello world!");

    	
    	
    	//must at least have same char count
    	for(int i = 0; i < firstWords.length; i++)
    	{
    		if(firstWords[i] == null && firstWords[i] == secondWords[i]){
    			System.out.println("1");
    		}
    		
    		if(firstWords[i].length() == secondWords[i].length())
    		{
    			char[] firstSortedCharArr = firstWords[i].toCharArray();
    			Arrays.sort(firstSortedCharArr);
    			char[] secondSortedCharArr = secondWords[i].toCharArray();
    			Arrays.sort(secondSortedCharArr);
    			String sorted1stStr = new String(firstSortedCharArr);
    			String sorted2ndStr = new String(secondSortedCharArr);
    			if(sorted1stStr.equals(sorted2ndStr))
    			{
    				System.out.println("1");
    			}
    			else{
    				System.out.println("0");
    			}
    		}
    		else{
    			System.out.println("0");
    		}
    	}
    }
}