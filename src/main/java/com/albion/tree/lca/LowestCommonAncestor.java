package com.albion.tree.lca;

import com.albion.core.TreeNode;

/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestorIterative(TreeNode root, TreeNode p, TreeNode q) {
        while ((root.val - p.val) * (root.val - q.val) > 0)
            root = p.val < root.val ? root.left : root.right;
        return root;
    }

    public TreeNode lowestCommonAncestorRecusive(TreeNode root, TreeNode p, TreeNode q) {
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestorRecusive(root.left, p, q);
        } else if(root.val < p.val && root.val < q.val) {
            return lowestCommonAncestorRecusive(root.right, p, q);
        } else {
            return root;
        }
    }
}
