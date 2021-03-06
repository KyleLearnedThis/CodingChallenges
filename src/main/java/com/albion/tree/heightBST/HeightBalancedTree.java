package com.albion.tree.heightBST;

import com.albion.common.tree.node.BinarySearchTreeNode;

public class HeightBalancedTree {
	public BinarySearchTreeNode<Integer> sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}
	
	public BinarySearchTreeNode<Integer> sortedArrayToBST(int[] nums, int low, int high) {
		if(low > high) {
			return null;
		}
		
		int mid = (high + low)/2;
		BinarySearchTreeNode<Integer> cur = new BinarySearchTreeNode<>(nums[mid]);
		cur.left = sortedArrayToBST(nums, low, mid - 1);
		cur.right = sortedArrayToBST(nums, mid + 1, high);
		return cur;
	}
}
