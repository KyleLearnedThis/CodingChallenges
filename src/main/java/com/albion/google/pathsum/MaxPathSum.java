package com.albion.google.pathsum;

import com.albion.common.tree.node.BinarySearchTreeNode;

public class MaxPathSum {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(BinarySearchTreeNode<Integer> root) {
        calculateSum(root);
        return max;
    }

    public int calculateSum(BinarySearchTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        BinarySearchTreeNode<Integer> left = root.getLeft();
        BinarySearchTreeNode<Integer> right = root.getRight();
        int leftValue = calculateSum(left);
        int rightValue = calculateSum(right);
        int current = Math.max(root.value, Math.max(root.value + leftValue, root.value + rightValue));
        max = Math.max(max, Math.max(current, leftValue + root.value + rightValue));
        return current;
    }
}
