package com.albion.google.mindepth;

import com.albion.common.tree.node.BinarySearchTreeNode;

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree
 */
public class MinDepth {
   public int minDepth(BinarySearchTreeNode<Integer> root) {
       if(root == null) {
           return 0;
       }
       BinarySearchTreeNode<Integer> left = root.getLeft();
       BinarySearchTreeNode<Integer> right = root.getRight();
       int l = minDepth(left);
       int r = minDepth(right);

       return (l == 0 || r == 0) ? l + r + 1: Math.min(l,r) + 1;
   }
}
