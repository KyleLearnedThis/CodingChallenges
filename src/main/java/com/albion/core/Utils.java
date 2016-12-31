package com.albion.core;

import java.util.ArrayList;
import java.util.List;

public class Utils {

	public static ListNode generateList(Integer[] input) {
		ListNode head = new ListNode(input[0]);
		ListNode cur = head;

		for (int i = 1; i < input.length; i++) {
			cur.next = new ListNode(input[i]);
			cur = cur.next;
		}
		return head;
	}

	public static void print(ListNode node) {
		for (ListNode n = node; n != null; n = n.next) {
			if (n.next != null)
				System.out.print(n.val + "-");
			else
				System.out.print(n.val);
		}
		System.out.println("");
	}

	public static Integer[] convertList(ListNode head) {
		List<ListNode> list = new ArrayList<ListNode>();
		for (ListNode cur = head; cur != null; cur = cur.next) {
			list.add(cur);
		}

		Integer[] result = new Integer[list.size()];

		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i).val;
		}
		return result;
	}

	public static ListNode dupilcate(ListNode head) {
		ListNode newHead = null;
		ListNode newCur = null;
		if (head != null) {
			for (ListNode cur = head; cur != null; cur = cur.next) {

				if (cur == head) {
					newHead = new ListNode(head.val);
					newCur = newHead;
				} else {
					newCur.next = new ListNode(cur.val);
					newCur = newCur.next;
				}
				newCur = newCur.next;
			}

		}
		return newHead;

	}
}
