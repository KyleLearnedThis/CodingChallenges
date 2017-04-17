package com.albion.classics.pascal;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]
 */
public class Triangle {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {

		ArrayList<ArrayList<Integer>> result = new ArrayList<> ();
		for(int i = 0; i < numRows; i++) {
			if (i == 0) {
				ArrayList<Integer> x1 = new ArrayList<>(Arrays.asList(new Integer[]{1}));
				result.add(x1);
			} else if (i == 1) {
				ArrayList<Integer> x2 = new ArrayList<>(Arrays.asList(new Integer[]{1, 1}));
				result.add(x2);
			} else {
				ArrayList<Integer> x3 = new ArrayList<>();

				for (int j = 0; j < i + 1; j++) {
					if (j == 0 || j == i) {
						x3.add(1);
					} else {
						int leftIndex = j - 1;
						int rightIndex = j;
						int left = result.get(i - 1).get(leftIndex);
						int right = result.get(i - 1).get(rightIndex);
						x3.add(left + right);
					}
				}
				result.add(x3);
			}
		}
		return result;
	}
	
	public void print(ArrayList<ArrayList<Integer>> result) {
		System.out.println("[");
		
		for(ArrayList<Integer> row: result) {
			for(Integer j: row) {
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
		System.out.println("]");
	}
}
