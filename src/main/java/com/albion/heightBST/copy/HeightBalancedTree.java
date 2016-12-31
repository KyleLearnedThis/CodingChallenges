package com.albion.heightBST.copy;

import com.albion.common.tree.TreeNode;

public class HeightBalancedTree {
	public TreeNode<Integer> sortedArrayToBST(int[] nums) {
		if (nums.length == 0)
			return null;
 
		return sortedArrayToBST(nums, 0, nums.length - 1);
	}
	
	public TreeNode<Integer> sortedArrayToBST(int[] nums, int low, int high) {
		if(low > high) {
			return null;
		}
		
		int mid = (high + low)/2;
		TreeNode<Integer> cur = new TreeNode<Integer>(nums[mid]);
		cur.left = sortedArrayToBST(nums, low, mid - 1);
		cur.right = sortedArrayToBST(nums, mid + 1, high);
		return cur;
	}
}
