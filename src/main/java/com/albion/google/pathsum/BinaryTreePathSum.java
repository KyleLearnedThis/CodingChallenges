package com.albion.google.pathsum;

import com.albion.common.tree.node.BinarySearchTreeNode;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/path-sum/
 */
public class BinaryTreePathSum {
	public ArrayList<ArrayList<Integer>> pathSum(BinarySearchTreeNode<Integer> root, int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if(root == null){
			return result;
		}

		ArrayList<Integer> list = new ArrayList<>();
		list.add(root.value);
		dfs(root, sum - root.value, result, list);
		return result;
	}

	public void dfs(BinarySearchTreeNode<Integer> t, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list){
		BinarySearchTreeNode<Integer> left = t.getLeft();
		BinarySearchTreeNode<Integer> right = t.getRight();

		if(left == null && right == null && sum == 0){
			ArrayList<Integer> temp = new ArrayList<>(list);
			result.add(temp);
		}

		//search path of left node
		if(left != null){
			ArrayList<Integer> leftList = new ArrayList<>(list);
			leftList.add(left.value);
			dfs(left, sum - left.value, result, leftList);
		}

		//search path of right node
		if(right != null){
			ArrayList<Integer> rightList = new ArrayList<>(list);
			rightList.add(right.value);
			dfs(right, sum - t.right.value, result, rightList);
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
		if(left == null && right == null && (sum - root.value == 0)) {
			return true;
		}

		return hasPathSum(left, sum - root.value) || hasPathSum(right, sum - root.value);
	}

	public void printAllPaths(ArrayList<ArrayList<Integer>> lists){
		for(ArrayList<Integer> list : lists){
			for(Integer i : list){
				System.out.print(" " + i);
			}
			System.out.println("");
		}
	}
}
