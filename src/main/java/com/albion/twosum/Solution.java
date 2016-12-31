package com.albion.twosum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
    	int result[] = new int[2];
    	Integer[] x = new Integer[numbers.length];
    	for(int i = 0; i < x.length; i++)
    	{
    		x[i] = new Integer(numbers[i]);
    	}

    	List<Integer> list = new ArrayList<Integer>(Arrays.asList(x));

    	for(int i = 0; i < list.size(); i++)
    	{
    		List<Integer> cloneList = new ArrayList<Integer>(list);
    		Integer current = cloneList.remove(i);
    		for(int j = 0; j < cloneList.size(); j++)
    		{
    			Integer foo = cloneList.get(j);
    			if(i+j == target)
    			{
    				result[0] = i;
    				result[1] = j;
    				return result;
    			}
    		}

    	}
    	
    	
    	return result;
    }
}
