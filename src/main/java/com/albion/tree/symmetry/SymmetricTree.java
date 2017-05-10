package com.albion.tree.symmetry;

import com.albion.core.TreeNode;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSymmetricWork(root.left, root.right);
    }

    private boolean isSymmetricWork(TreeNode left, TreeNode right){
        if(left == null || right == null)
            return left == right;
        if(left.val != right.val){
            return false;
        }
        return isSymmetricWork(left.left, right.right) && isSymmetricWork(left.right, right.left);
    }
}
