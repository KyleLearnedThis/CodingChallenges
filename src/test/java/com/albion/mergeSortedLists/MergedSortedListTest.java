package com.albion.mergeSortedLists;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.ListNode;
import com.albion.core.Utils;

public class MergedSortedListTest {

	@DataProvider(name = "data01")
	public Object[][] data() {

		Integer[] i1 = {1,2,3,5};
		Integer[] i2 = {3,4,5};
		Integer[] i3 = {1,2,3,3,4,5,5};
		
		ListNode l1 = Utils.generateList(i1);
		ListNode l2 = Utils.generateList(i2);
		ListNode l3 = Utils.generateList(i3);
		
		Object[][] ret = new Object[][] {
				
				{i1, i2, i3}
		};
		return ret;

	}
	
  //@Test(dataProvider = "data01")
  public void mergeTwoLists(ListNode l1, ListNode l2, ListNode expected) {
	  Solution s = new Solution();
	  ListNode result = s.mergeTwoLists(l1, l2);
	  
	  Integer[] actual = Utils.convertList(result);
	  Assert.assertEquals(actual, expected);
	  
  }
  
  
}
