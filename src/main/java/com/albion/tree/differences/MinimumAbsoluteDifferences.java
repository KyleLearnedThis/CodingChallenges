package com.albion.tree.differences;

import com.albion.core.TreeNode;

public class MinimumAbsoluteDifferences {
    int minDiff = Integer.MAX_VALUE;
    TreeNode prev;

    public int getMinimumDifference(TreeNode root) {
        inOrder(root);
        return minDiff;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);

        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev.val);
        }
        prev = root;
        
        inOrder(root.right);
    }
}
