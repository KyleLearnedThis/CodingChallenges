package com.albion.sort.tcolors;

public class ThreeColorSort {
	/**
	 * You have an array of size n which contains balls of 3 colors 
	 * Red, Black and White. Write a function that will arrange the array such that all the red balls are on the left, all the white balls are in the middle and all the black balls are on the right.
	 * Input = {b,[w],r,r,w,b,b,[w],r}
	 * Output = {r,r,r,w,w,w,b,b,b}
	 * In O(N) in-place.
	 */
	
	public String[] sort(String[] input) {
		int low = 0;
		int high = input.length - 1;
		int mid = 0;
		String temp = "";
		while(mid <= high){
			if("r".equals(input[mid])){
				temp = input[low];
				input[low] = input[mid];
				input[mid] = temp;
				low++;
				mid++;
			} else if("b".equals(input[mid])) {
				temp = input[mid];
				input[mid] = input[high];
				input[high] = temp;
				high--;
			} else {
				mid++;
			}
		}
		return input;
	}
}
