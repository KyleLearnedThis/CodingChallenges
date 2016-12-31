package com.albion.ReorderList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.ListNode;

public class ReorderListTest {

	public ListNode generateNode(Integer[] input) {
		ListNode head = new ListNode(input[0]);
		ListNode cur = head;
	
		for (int i = 1; i < input.length; i++) {
			cur.next = new ListNode(input[i]);
			cur = cur.next;
		}
		return head;
	}

	public void print(ListNode n)
	{
		ListNode cur = n;
		while(cur != null)
		{
			System.out.print(cur.val+"-");
			cur = cur.next;
			
		}
		System.out.println("");
	}
	
	@DataProvider(name = "data01")
	public Object[][] data() {
		Integer[] a1 = {1,2,3,4,5,6,7,8};
		Integer[] a2 = {1,2,3,4,5,6,7};
		Integer[] a3 = {1,2,3};
		
//		ListNode l1 = generateNode(a1);
//		ListNode l2 = generateNode(a2);
		ListNode l3 = generateNode(a3);
		Object[][] ret = new Object[][]{ {l3}};
		
		return ret;
	}

	@Test(dataProvider="data01")
	public void reorderList(ListNode head) {
		
//		print(head);
		Solution s = new Solution();
		s.reorderList(head);
		System.out.println("====================");
		System.out.println("here::::");
		print(head);
	}

}
