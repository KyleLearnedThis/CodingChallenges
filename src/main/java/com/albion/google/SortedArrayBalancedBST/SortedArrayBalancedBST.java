package com.albion.google.SortedArrayBalancedBST;

import com.albion.core.TreeNode;

/*
 * http://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class SortedArrayBalancedBST {

	public TreeNode sortedArrayToBST(int[] arr, int start, int end) {
		TreeNode root = null;
		if (start > end) {
			return null;
		}

		int mid = (start + end) / 2;
		root = new TreeNode(arr[mid]);
		root.left = sortedArrayToBST(arr, start, mid - 1);
		root.right = sortedArrayToBST(arr, mid + 1, end);
		return root;
	}
}
