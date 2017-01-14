package com.albion.google.SortedArrayBalancedBST;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.ListNode;
import com.albion.core.TreeNode;
import com.albion.core.Utils;

public class SortedArrayBalancedBSTTest {

	@DataProvider(name = "data01")
	public Object[][] data() {
		
		Integer[] x1 = {3,5,8};
			//{1,2,3};

		ListNode i1 = Utils.generateList(x1);

		Object[][] ret = { 
				{i1}
		};
		
		return ret;
	}	
	
  @Test(dataProvider = "data01")
  public void sortedListToBST(ListNode n) {
	  SortedArrayBalancedBST s = new SortedArrayBalancedBST();
	  s = new SortedArrayBalancedBST();
	  TreeNode root = s.sortedListToBST(n);
  }
}
