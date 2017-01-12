package com.albion.maxdepth;

import com.albion.common.tree.TreeNode;

import java.util.Stack;

/**
 * http://www.programcreek.com/2014/05/leetcode-maximum-depth-of-binary-tree-java/
 */
public class MaxDepth {

	public int maxDepth(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public int maxDepthV3(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftLevel = maxDepth(root.left);
		int rightLevel = maxDepth(root.right);
		if( leftLevel >= rightLevel) {
			return leftLevel + 1;
		} else {
			return rightLevel + 1;
		}

	}
	
	public int maxDepthV2(TreeNode<Integer> r) {
		int depth = 0;
		Stack<TreeNode<Integer>> wq = new Stack<TreeNode<Integer>>();
		Stack<TreeNode<Integer>> path = new Stack<TreeNode<Integer>>();

		wq.push(r);
		while (!wq.empty()) {
			r = wq.peek();
			if (!path.empty() && r == path.peek()) {
				if (path.size() > depth)
					depth = path.size();
				path.pop();
				wq.pop();
			} else {
				path.push(r);
				if (r.right != null)
					wq.push(r.right);
				if (r.left != null)
					wq.push(r.left);
			}
		}

		return depth;
	}
}
