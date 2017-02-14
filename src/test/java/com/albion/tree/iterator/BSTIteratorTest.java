package com.albion.tree.iterator;

import com.albion.common.tree.BinarySearchTree;
import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.node.BinarySearchTreeNode;
import org.testng.annotations.Test;

public class BSTIteratorTest {
    @Test
    public void testNext() throws Exception {
        int[] nums = {5,4,3,1,6};
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (int i = 0; i < nums.length; i++) {
            tree.insert(nums[i]);
        }
        BinarySearchTreeNode<Integer> root = tree.getRoot();
        BinaryTreePrinter.printNode(root);

        BSTIterator iterator = new BSTIterator(root);
        while(iterator.hasNext()){
            int val = iterator.next();
            System.out.println("val: " + val);
        }
    }

}