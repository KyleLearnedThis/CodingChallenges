package com.albion.google.pathsum;

import com.albion.common.tree.node.BinarySearchTreeNode;

import java.util.ArrayList;

/**
 *
 * https://leetcode.com/problems/path-sum/
 */
public class BinaryTreePathSum {
	public ArrayList<ArrayList<Integer>> pathSum(BinarySearchTreeNode<Integer> root, int sum) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	    if(root == null) 
	        return result;
	 
	    ArrayList<Integer> l = new ArrayList<>();
	    l.add(root.value);
	    dfs(root, sum-root.value, result, l);
	    return result;
	}
	 
	public void dfs(BinarySearchTreeNode<Integer> t, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> l){
		BinarySearchTreeNode<Integer> left = t.getLeft();
		BinarySearchTreeNode<Integer> right = t.getRight();
		if(left==null && right==null && sum==0){
	        ArrayList<Integer> temp = new ArrayList<>();
	        temp.addAll(l);
	        result.add(temp);
	    }
	    //search path of left node
	    if(left != null){
	        l.add(left.value);
	        dfs(left, sum-left.value, result, l);
	        l.remove(l.size()-1);
	    }


	    //search path of right node
	    if(right!=null){
	        l.add(right.value);
	        dfs(right, sum-t.right.value, result, l);
	        l.remove(l.size()-1);
	    }
	}

	public boolean hasPathSum(BinarySearchTreeNode<Integer> root, int sum) {
		ArrayList<ArrayList<Integer>> lists = pathSum(root, sum);
		return lists.size() >= 1;
	}

	public boolean hasPathSumV2(BinarySearchTreeNode<Integer> root, int sum) {
		if(root == null) {
			return false;
		}
		BinarySearchTreeNode<Integer> left = root.getLeft();
		BinarySearchTreeNode<Integer> right = root.getRight();
		if(root.getLeft() == null && root.getRight() == null && sum - root.value == 0) {
			return true;
		}

		return hasPathSum(left, sum - root.value) || hasPathSum(right, sum - root.value);
	}

    public int maxPathSum(BinarySearchTreeNode<Integer> root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        calculateSum(root, max);
        return max[0];
    }

    public int calculateSum(BinarySearchTreeNode<Integer> root, int[] max) {
        if (root == null)
            return 0;

		BinarySearchTreeNode<Integer> left = root.getLeft();
		BinarySearchTreeNode<Integer> right = root.getRight();
        int leftValue = calculateSum(left, max);
        int rightValue = calculateSum(right, max);

        int current = Math.max(root.value, Math.max(root.value + leftValue, root.value + rightValue));

        max[0] = Math.max(max[0], Math.max(current, leftValue + root.value + rightValue));

        return current;
    }
}
