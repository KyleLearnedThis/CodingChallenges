package com.albion.google.pathsum;

import com.albion.common.tree.node.BinarySearchTreeNode;

public class MaxPathSum {
    public int maxPathSum(BinarySearchTreeNode<Integer> root) {
        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;
        calculateSum(root, max);
        return max[0];
    }

    public int calculateSum(BinarySearchTreeNode<Integer> root, int[] max) {
        if (root == null) {
            return 0;
        }

        BinarySearchTreeNode<Integer> left = root.getLeft();
        BinarySearchTreeNode<Integer> right = root.getRight();
        int leftValue = calculateSum(left, max);
        int rightValue = calculateSum(right, max);
        int current = Math.max(root.value, Math.max(root.value + leftValue, root.value + rightValue));
        max[0] = Math.max(max[0], Math.max(current, leftValue + root.value + rightValue));
        return current;
    }
}
