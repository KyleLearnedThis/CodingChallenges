package com.albion.InsertionSort;

import com.albion.core.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 * 
 * P N 9, 1, 3, 4, 5, 7, 12
 * 
 */
public class Solution {
	public ListNode insertionSortList(ListNode head) {
		ListNode current = head;
		ListNode tail = null;
		while (current != null && tail != head) {
			ListNode next = current;
			for (; next.next != tail; next = next.next) {
				if (next.val >= next.next.val) {
					int temp = next.val;
					next.val = next.next.val;
					next.next.val = temp;
				}
			}
			tail = next;
			current = head;

		}
		return head;


	}



	public void print(ListNode head) {
		for (ListNode c = head; c != null; c = c.next) {
			System.out.print(c.val + "->");
		}
		System.out.println(" ");
	}
}