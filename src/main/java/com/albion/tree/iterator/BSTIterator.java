package com.albion.tree.iterator;

import com.albion.common.tree.node.BinarySearchTreeNode;

import java.util.Stack;

public class BSTIterator {
    private Stack<BinarySearchTreeNode<Integer>> stack;

    public BSTIterator(Stack<BinarySearchTreeNode<Integer>> stack) {
        this.stack = stack;
    }

    public BSTIterator(BinarySearchTreeNode<Integer> root) {
        stack = new Stack<>();
        while (root != null) {
            stack.push(root);
            root = root.getLeft();
        }
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /**
     *
     * @return smallest element in BST in O(1)
     */
    public int next() {
        BinarySearchTreeNode<Integer> node = stack.pop();
        int result = node.getValue();
        BinarySearchTreeNode<Integer> child = node.getRight();
        while (child != null) {
            stack.push(child);
            child = child.getLeft();
        }
        return result;
    }
}
