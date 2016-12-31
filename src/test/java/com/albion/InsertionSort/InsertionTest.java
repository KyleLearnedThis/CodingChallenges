package com.albion.InsertionSort;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.ListNode;
import com.albion.core.Utils;

public class InsertionTest {

	@DataProvider(name = "data01")
	public Object[][] data() {
		
		Integer[] i1 = {3,2,4};
		ListNode t1 = Utils.generateList(i1);

		Integer[] i2 = {3,2,4};
		ListNode a1 = Utils.generateList(i2);

		Integer[] i3 = {3,2,4};
		ListNode b1 = Utils.generateList(i3);
		

		return new Object[][] {  {t1}, { a1 } , {b1}};
	}

	@Test(dataProvider = "data01")
	public void insertionSortList(ListNode p) {
		Solution s = new Solution();
		ListNode c = s.insertionSortList(p);
		s.print(c);
	}
	
	
}
