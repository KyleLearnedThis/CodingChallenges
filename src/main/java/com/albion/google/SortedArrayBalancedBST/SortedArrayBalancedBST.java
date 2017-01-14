package com.albion.google.SortedArrayBalancedBST;

import com.albion.core.ListNode;
import com.albion.core.TreeNode;

import java.util.ArrayList;

/*
 * http://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
 */
public class SortedArrayBalancedBST {
	public TreeNode sortedListToBST(ListNode head) {
		TreeNode root = null;
		ArrayList<ListNode> list = new ArrayList<ListNode>();
		for (ListNode c1 = head; c1 != null; c1 = c1.next) {
			list.add(c1);
		}
		
		if (list.size() == 1) {
			return new TreeNode(list.get(0).val);
		} else if (list.size() == 2) {
			root = new TreeNode(list.get(0).val);
			if (list.get(1).val > list.get(0).val)
				root.right = new TreeNode(list.get(1).val);
			else
				root.left = new TreeNode(list.get(1).val);

			return root;
		}

		int[] myArray = new int[list.size()];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = list.get(i).val;
		}

		int offset = myArray.length / 2;
		root = sortedListToBSTWork(myArray, 0, myArray.length - 1);

		return root;

	}

	public TreeNode sortedListToBSTWork(int[] arr, int start, int end) {
		TreeNode root = null;
		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;
		root = new TreeNode(arr[mid]);

		root.left = sortedListToBSTWork(arr, start, mid - 1);
		root.right = sortedListToBSTWork(arr, mid + 1, end);

		return root;
	}
}
