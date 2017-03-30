package com.albion.tree.PostOrderIterative;

import com.albion.core.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderIterative {

	public ArrayList<Integer> postOrderTraversal(TreeNode root) {

		ArrayList<Integer> result = new ArrayList<>();
		this.postOrderTraversalWork(root, result);
		return result;
	}

	public void postOrderTraversalWork(TreeNode node, ArrayList<Integer> result) {

		Stack<TreeNode> stack = new Stack<>();
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

	public ArrayList<Integer> postOrderTraversalV2(TreeNode root, ArrayList<Integer> resultRecursion) {
		if (root == null) {
			return null;
		}
		postOrderTraversalV2Work(root, resultRecursion);
		return resultRecursion;
	}

	public void postOrderTraversalV2Work(TreeNode node, ArrayList<Integer> result) {
		if (node == null) {
			return;
		}

		postOrderTraversalV2Work(node.left, result);
		postOrderTraversalV2Work(node.right, result);
		result.add(node.val);
		System.out.println(node.val + "->");
	}
}
