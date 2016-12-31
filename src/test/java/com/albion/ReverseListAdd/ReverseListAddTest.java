package com.albion.ReverseListAdd;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.ListNode;
import com.albion.core.Utils;

/*
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class ReverseListAddTest {

	@DataProvider(name = "data01")
	public Object[][] data() {
		
		Integer[] x1 = {2,4,3};
		Integer[] x2 = {5,6,4};
		ListNode i1 = Utils.generateList(x1);
		ListNode i2 = Utils.generateList(x2);
		
		Integer[] a1= {9};
		Integer[] a2 = {9};
		ListNode b1 = Utils.generateList(a1);
		ListNode b2 = Utils.generateList(a2);		
		
		Integer[] c1= {1};
		Integer[] c2 = {9,9};
		ListNode d1 = Utils.generateList(c1);
		ListNode d2 = Utils.generateList(c2);	
		
		Object[][] ret = { 
				{d1,d2}
//		, {b1,b2} 
		
		};
		
		return ret;
	}

	@Test(dataProvider = "data01")
	public void addTwoNumbers(ListNode i1, ListNode i2) {
		Solution s = new Solution();
		ListNode i3 = s.addTwoNumbers(i1, i2);
		s.print(i3);
	}
}
