package com.albion.tree.kth;

import com.albion.common.tree.node.BinarySearchTreeNode;

import java.util.Stack;

public class BSTKthSmallest {
    public int kthSmallest(BinarySearchTreeNode<Integer> root, int k) {
        Stack<BinarySearchTreeNode<Integer>> stack = new Stack<>();

        BinarySearchTreeNode<Integer> p = root;
        int result = 0;

        while(!stack.isEmpty() || p!=null){
            if(p!=null){
                stack.push(p);
                p = p.getLeft();
            }else{
                BinarySearchTreeNode<Integer> t = stack.pop();
                k--;
                if(k==0)
                    result = t.getValue();
                p = t.getRight();
            }
        }

        return result;
    }
}
