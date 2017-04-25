package com.albion.tree.tilt;

import com.albion.core.TreeNode;

public class BinaryTreeTilt {

    int result = 0;

    public int findTilt(TreeNode root) {
        postOrder(root);
        return result;
    }

    private int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftSum = postOrder(root.left);
        int rightSum = postOrder(root.right);
        result += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }
}
