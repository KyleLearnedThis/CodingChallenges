package com.albion.PostOrderIterative;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.albion.core.TreeNode;

public class Solution {

	public ArrayList<Integer> postorderTraversal(TreeNode root) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		this.postorderTraversalWork(root, result);
		return result;
	}

	public void postorderTraversalWork(TreeNode node, ArrayList<Integer> result) {

		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode prev = null;
		while (!stack.isEmpty() || node != null) {
			if (node != null) {
				stack.push(node);
				node = node.left;
			} else {
				TreeNode peekNode = stack.peek();
				if (peekNode.right != null && prev != peekNode.right) {

					/*
					 * if right child exists AND traversing node from left
					 * child, move right
					 */
					node = peekNode.right;
				} else {
			        stack.pop();
					 //System.out.print(peekNode.val+"-");
					 result.add(peekNode.val);
			        prev = peekNode;
				}
			}
		}

	}

	public ArrayList<Integer> postorderTraversal2(TreeNode root,
			ArrayList<Integer> resultRecursion) {
		if (root == null) {
			return null;
		}
		postorderTraversal2Work(root, resultRecursion);
		return resultRecursion;
	}

	public void postorderTraversal2Work(TreeNode node, ArrayList<Integer> result) {
		if (node == null)
			return;

		postorderTraversal2Work(node.left, result);
		postorderTraversal2Work(node.right, result);
		result.add(node.val);
		System.out.println(node.val + "->");

	}
}
