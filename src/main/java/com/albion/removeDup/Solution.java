package com.albion.removeDup;

import com.albion.core.ListNode;

/*
 * 		//1,1,1,1, 2,3,3,4
 */

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode cur = head;
		while (cur != null) {
			ListNode nextNonDup = this.findNextNonDup(cur);
			// if(nextNonDup != null){
			// if (cur == head) {

			if (nextNonDup == null) {
				if (cur == head) {
					head = nextNonDup;
					return null;
				}
				else{
					ListNode prev = this.findPriorNode(head, cur);
					prev.next = nextNonDup;
					return head;
				}
			} else {
				if (nextNonDup != cur.next) {
					ListNode prior = this.findPriorNode(head, cur);
					if (prior != null) {
						prior.next = nextNonDup;
						cur = nextNonDup;
					} else {
						head = nextNonDup;
						return null;
					}

				}
			}

			cur = nextNonDup;

			// } else {
			// ListNode prior = this.findPriorNode(head, cur);
			// prior.next = nextNonDup;
			// cur = nextNonDup;
			// }

		}	

		return head;
	}

	/*
	 * {1,1,1,1, 2,3,3,4} if 1 at head is the node, 2 should be returned;
	 */

	public ListNode findNextNonDup(ListNode node) {
		ListNode last = node;

		if (node == null)
			return null;
		else if (node.next == null)
			return null;
		else {
			last = node.next;
			while (last != null && node.val == last.val) {
				last = last.next;
			}
			return last;

		}

	}

	// {A,B,C,D,E,F,G,H}
	// {1,1,1,1,2,3,3,4}
	public ListNode findPriorNode(ListNode head, ListNode node) {
		if (node == null || node == head)
			return null;
		else {
			ListNode cur = head;
			while (cur != null) {
				if (cur.next == node)
					return cur;
				else
					cur = cur.next;
			}
			return cur;
		}
	}
}