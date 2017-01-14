package com.albion.google.pathsum;

import com.albion.common.tree.TreeNode;

import java.util.ArrayList;

/**
 *
 * https://leetcode.com/problems/path-sum/
 */
public class BinaryTreePathSum {
	public ArrayList<ArrayList<Integer>> pathSum(TreeNode<Integer> root, int sum) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
	    if(root == null) 
	        return result;
	 
	    ArrayList<Integer> l = new ArrayList<>();
	    l.add(root.value);
	    dfs(root, sum-root.value, result, l);
	    return result;
	}
	 
	public void dfs(TreeNode<Integer> t, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> l){
	    if(t.left==null && t.right==null && sum==0){
	        ArrayList<Integer> temp = new ArrayList<>();
	        temp.addAll(l);
	        result.add(temp);
	    }
	 
	    //search path of left node
	    if(t.left != null){
	        l.add(t.left.value);
	        dfs(t.left, sum-t.left.value, result, l);
	        l.remove(l.size()-1);
	    }
	 
	    //search path of right node
	    if(t.right!=null){
	        l.add(t.right.value);
	        dfs(t.right, sum-t.right.value, result, l);
	        l.remove(l.size()-1);
	    }
	}

	public boolean hasPathSum(TreeNode<Integer> root, int sum) {
		ArrayList<ArrayList<Integer>> lists = pathSum(root, sum);
		return lists.size() >= 1;
	}

	public boolean hasPathSumV2(TreeNode<Integer> root, int sum) {
		if(root == null) {
			return false;
		}

		if(root.left == null && root.right == null && sum - root.value == 0) {
			return true;
		}

		return hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value);
	}

    public int maxPathSum(TreeNode<Integer> root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        calculateSum(root, max);
        return max[0];
    }

    public int calculateSum(TreeNode<Integer> root, int[] max) {
        if (root == null)
            return 0;

        int left = calculateSum(root.left, max);
        int right = calculateSum(root.right, max);

        int current = Math.max(root.value, Math.max(root.value + left, root.value + right));

        max[0] = Math.max(max[0], Math.max(current, left + root.value + right));

        return current;
    }
}
