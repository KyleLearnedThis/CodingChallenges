package com.albion.tcolors;

import org.testng.annotations.Test;

public class ThreeColorSortTest {

	/**
	 * You have an array of size n which contains balls of 3 colors 
	 * -Red, Black and White. Write a function that will arrange the array such that all the red balls are on the left, all the white balls are in the middle and all the black balls are on the right.
	 * Input = {b,w,r,r,w,b,b,w,r}
	 * Output = {r,r,r,w,w,w,b,b,b}
	 * In O(N) in-place.
	 */
	
	
  @Test
  public void testSort() {
     String[] input = {"b", "w", "r", "r", "w", "b", "b", "w", "r"};
     ThreeColorSort tcs = new ThreeColorSort();
     tcs.sort(input);
  }
}
