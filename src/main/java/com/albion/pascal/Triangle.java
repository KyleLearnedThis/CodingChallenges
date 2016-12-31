package com.albion.pascal;

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

		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
		for(int i = 0; i < numRows; i++)
		{
			if(i == 0){
				ArrayList<Integer> x1 = new ArrayList<Integer>(Arrays.asList( new Integer[] {1}));
				result.add(x1);
			}
			else  if( i == 1){
				ArrayList<Integer> x2= new ArrayList<Integer>(Arrays.asList( new Integer[] {1,1}));
				result.add(x2);
			}
			else{
				ArrayList<Integer> x3 = new ArrayList<Integer>();
				
				for(int j = 0; j < i+1; j++)
				{

					if(j == 0 || j == i ){
						x3.add(1);
					}
					else{
						int mom_idx = j -1;
						int dad_idx = j;
						int mom = result.get(i-1).get(mom_idx);
						int dad = result.get(i-1).get(dad_idx);
						x3.add(mom+dad);
						
					}
				}
				result.add(x3);
			}
		}
		
		return result;
	}
	
	public void print(ArrayList<ArrayList<Integer>> result)
	{
		System.out.println("[");
		
		for(ArrayList<Integer> row: result)
		{
//			ArrayList<Integer> i = row;
			for(Integer j: row)
			{
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
		System.out.println("]");
	}
}
