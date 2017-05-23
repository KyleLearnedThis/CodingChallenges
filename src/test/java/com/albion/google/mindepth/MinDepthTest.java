package com.albion.google.mindepth;

import com.albion.common.tree.node.BinarySearchTreeNode;
import com.albion.common.tree.utils.BinaryTreePrinter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MinDepthTest {

    private BinarySearchTreeNode<Integer> makeTree() {
        BinarySearchTreeNode<Integer> root = new BinarySearchTreeNode<>(5);
        BinarySearchTreeNode<Integer> t04a = new BinarySearchTreeNode<>(4);
        BinarySearchTreeNode<Integer> t08 = new BinarySearchTreeNode<>(8);
        BinarySearchTreeNode<Integer> t11 = new BinarySearchTreeNode<>(11);
        BinarySearchTreeNode<Integer> t13 = new BinarySearchTreeNode<>(13);
        BinarySearchTreeNode<Integer> t04b = new BinarySearchTreeNode<>(4);
        BinarySearchTreeNode<Integer> t07 = new BinarySearchTreeNode<>(7);
        BinarySearchTreeNode<Integer> t02 = new BinarySearchTreeNode<>(2);
        BinarySearchTreeNode<Integer> t05 = new BinarySearchTreeNode<>(5);
        BinarySearchTreeNode<Integer> t01 = new BinarySearchTreeNode<>(1);
		/*
		 *    5
			 / \
			4   8
		   /   / \
		  11  13  4
		 /  \    / \
		7    2  5   1
		 */
        root.left = t04a;
        root.right = t08;

        t04a.left = t11;
        t08.left = t13;
        t08.right = t04b;

        t11.left = t07;
        t11.right = t02;

        t04b.left = t05;
        t04b.right = t01;
        return root;
    }

    @Test
    public void testMinPathSum() throws Exception {
        BinarySearchTreeNode<Integer> root = makeTree();
        BinaryTreePrinter.printNode(root);
        int expected = 3;
        MinDepth m = new MinDepth();
        int actual = m.minDepth(root);
        Assert.assertEquals(actual, expected);
    }
}