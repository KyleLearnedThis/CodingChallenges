package com.albion.tree.kth;

import com.albion.common.tree.BinarySearchTree;
import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.node.BinarySearchTreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BSTKthSmallestTest {
    @Test
    public void testKthSmallest() throws Exception {
        int[] nums = {5,4,3,1,6};
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        for (int i = 0; i < nums.length; i++) {
            tree.insert(nums[i]);
        }
        BinarySearchTreeNode<Integer> root = tree.getRoot();
        BinaryTreePrinter.printNode(root);

        BSTKthSmallest kst = new BSTKthSmallest();
        int actual = kst.kthSmallest(root, 3);
        Assert.assertEquals(actual, 4);
    }

}