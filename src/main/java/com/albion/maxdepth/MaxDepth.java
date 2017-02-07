package com.albion.maxdepth;


import com.albion.common.tree.node.BinarySearchTreeNode;

import java.util.Stack;

/**
 * http://www.programcreek.com/2014/05/leetcode-maximum-depth-of-binary-tree-java/
 */
public class MaxDepth {

	public int maxDepth(BinarySearchTreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(maxDepth(root.getLeft()), maxDepth(root.getRight()));
	}

	public int maxDepthV3(BinarySearchTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftLevel = maxDepth(root.getLeft());
		int rightLevel = maxDepth(root.getRight());
		if( leftLevel >= rightLevel) {
			return leftLevel + 1;
		} else {
			return rightLevel + 1;
		}

	}
	
	public int maxDepthV2(BinarySearchTreeNode<Integer> r) {
		int depth = 0;
		Stack<BinarySearchTreeNode<Integer>> wq = new Stack<>();
		Stack<BinarySearchTreeNode<Integer>> path = new Stack<>();

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
				if (r.getRight() != null)
					wq.push(r.getRight());
				if (r.left != null)
					wq.push(r.getLeft());
			}
		}

		return depth;
	}
}
