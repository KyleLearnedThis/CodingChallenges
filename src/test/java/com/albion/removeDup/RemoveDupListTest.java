package com.albion.removeDup;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.ListNode;
import com.albion.core.Utils;

public class RemoveDupListTest {

	@DataProvider(name = "data01")
	public Object[][] data() {
		
//		Integer[] i1 = {1,1,1,2};
//		Integer[] i1 = {1,2,3};
		Integer[] i1 = {1,2};
		ListNode l1 = Utils.generateList(i1);


		return new Object[][] {  {l1} };
	}
  //@Test(dataProvider = "data01")
  public void deleteDuplicatesTest1(ListNode head) {
	  Solution s = new Solution();
	  ListNode h = s.deleteDuplicates(head);
	  Utils.print(h);
  }
  
  @Test(dataProvider = "data01")
  public void deleteDuplicatesTest2(ListNode head) {
	  Solution2 s = new Solution2();
	  ListNode h = s.deleteDuplicates(head);
	  Utils.print(h);
  }
}
