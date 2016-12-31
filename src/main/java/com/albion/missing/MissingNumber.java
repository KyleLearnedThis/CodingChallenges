package com.albion.missing;

import java.util.Arrays;

public class MissingNumber {
	
	//0, 1, 2, 3 ... N
	//0 + 1 + 2 + 3 = 6
    public int missingNumber(int[] nums) {
    	
    	Arrays.sort(nums);
    	int size = nums.length;
    	if(nums[0] == 0){
    		int expectedSize = size + 1;
    		int expectedSum = 0;
    		for(int i = 0; i < expectedSize; i++){
    			expectedSum = expectedSum + i;
    		}
    		
    		int actualSum = 0;
    		for(int j = 0; j < size; j++){
    			actualSum = actualSum + nums[j];
    		}
    		return expectedSum - actualSum;
    	} else {
    		return 0;
    	}
    }
}
