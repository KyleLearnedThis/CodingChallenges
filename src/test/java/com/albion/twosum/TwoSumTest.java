package com.albion.twosum;

import java.util.Arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoSumTest {

	@DataProvider(name = "twoSumData")
	Object[][] twoSumData()
	{
		int[] d1 = {2, 7, 11, 15};
		int t1 = 9;
		int[] r1 = {1,2};
		
		Object[][] ret = new Object[][] {
				{d1, t1, r1}
		};
		
		return ret;
	}
  @Test(dataProvider="twoSumData")
  public void twoSum(int[] numbers, int target, int[] result) {
	  Solution sol = new Solution();
	  int[] actual = sol.twoSum(numbers, target);
	  Arrays.equals(actual, result);
  }
}
