package com.albion.tree.maxdepth;

import com.albion.common.tree.node.BinarySearchTreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MaxDepthTest {

	public BinarySearchTreeNode<Integer> makeTree() {
		BinarySearchTreeNode<Integer> root = new BinarySearchTreeNode<Integer>(5);
		BinarySearchTreeNode<Integer> t04a = new BinarySearchTreeNode<Integer>(4);
		BinarySearchTreeNode<Integer> t08 = new BinarySearchTreeNode<Integer>(8);
		BinarySearchTreeNode<Integer> t11 = new BinarySearchTreeNode<Integer>(11);
		BinarySearchTreeNode<Integer> t13 = new BinarySearchTreeNode<Integer>(13);
		BinarySearchTreeNode<Integer> t04b = new BinarySearchTreeNode<Integer>(4);
		BinarySearchTreeNode<Integer> t07 = new BinarySearchTreeNode<Integer>(7);
		BinarySearchTreeNode<Integer> t02 = new BinarySearchTreeNode<Integer>(2);
		BinarySearchTreeNode<Integer> t05 = new BinarySearchTreeNode<Integer>(5);
		BinarySearchTreeNode<Integer> t01 = new BinarySearchTreeNode<Integer>(1);
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
	public void testMaxDepth() {
		BinarySearchTreeNode<Integer> root = makeTree();
		MaxDepth md = new MaxDepth();
		int actual = md.maxDepthV3(root);
		int expected = 4;
		System.out.println("level: " + actual);
		Assert.assertEquals(actual, expected);
	}
}
