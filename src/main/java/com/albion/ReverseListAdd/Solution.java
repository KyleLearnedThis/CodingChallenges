package com.albion.ReverseListAdd;

import com.albion.core.ListNode;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; next = null; } }
 */
/*
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * 342 + 465 = 807
 * 
 * 3000 + 21 = 3021
 */
public class Solution {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		int d1 = countDigits(l1);
		int d2 = countDigits(l2);
		ListNode result = null;
		ListNode src = null;

		if (d1 > d2) {
			result = clone(l1);
			src = l2;
		} else {
			result = clone(l2);
			src = l1;
		}

		ListNode x1 = src;
		ListNode cur = result;
		while (x1 != null) {

			addNode(cur, x1);
			x1 = x1.next;
			cur = cur.next;

		}

		return result;
	}

	public void addNode(ListNode cur, ListNode src) {

		cur.val = cur.val + src.val;
		if (cur.val >= 10) {
			carryOver(cur);
		}

	}

	public void carryOver(ListNode start) {
		if (start == null)
			return;

		ListNode cur = start;
		while (cur != null) {
			if (cur.val >= 10) {
				cur.val = cur.val % 10;

				if (cur.next != null) {
					cur.next.val = cur.next.val + 1;
					carryOver(cur.next);
				} else {
					cur.next = new ListNode(1);
				}
			}
			cur = cur.next;
		}
	}

	public int countDigits(ListNode n) {
		int digit = 0;
		if (n == null) {
			return 0;
		}
		if (n.next == null)
			return 1;

		ListNode cur = n;
		while (cur != null) {
			cur = cur.next;
			digit++;
		}
		return digit;
	}

	public ListNode clone(ListNode n) {
		ListNode copy = new ListNode(n.val);
		ListNode head = copy;
		ListNode cur = n.next;

		while (cur != null) {
			copy.next = new ListNode(cur.val);
			copy = copy.next;
			cur = cur.next;

		}
		return head;
	}

	public void print(ListNode head) {
		ListNode cur = head;
		while (cur != null) {
			System.out.print(cur.val);
			cur = cur.next;
		}
		System.out.println("");
	}
}