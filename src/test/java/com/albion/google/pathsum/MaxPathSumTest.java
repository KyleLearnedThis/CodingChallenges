package com.albion.google.pathsum;

import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.node.BinarySearchTreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxPathSumTest {

    @Test
    public void testMaxPathSumV2() throws Exception {
        BinarySearchTreeNode<Integer> root = new BinarySearchTreeNode<>(10);
        root.left = new BinarySearchTreeNode<>(2);
        root.right = new BinarySearchTreeNode<>(10);
        root.left.left = new BinarySearchTreeNode<>(20);
        root.left.right = new BinarySearchTreeNode<>(1);
        root.right.right = new BinarySearchTreeNode<>(-25);
        root.right.right.left = new BinarySearchTreeNode<>(3);
        root.right.right.right = new BinarySearchTreeNode<>(4);

        BinaryTreePrinter.printNode(root);

        MaxPathSum ms = new MaxPathSum();
        int expected = 42;
        int actual = ms.maxPathSum(root);

        System.out.println("maximum path sums is : " + actual);
        Assert.assertEquals(actual,expected);
    }
}