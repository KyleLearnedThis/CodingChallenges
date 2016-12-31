package com.albion.maxdepth;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.albion.common.tree.TreeNode;

public class MaxDepthTest {

	public TreeNode<Integer> makeTree() {
		TreeNode<Integer> root = new TreeNode<Integer>(5);
		TreeNode<Integer> t04a = new TreeNode<Integer>(4);
		TreeNode<Integer> t08 = new TreeNode<Integer>(8);
		TreeNode<Integer> t11 = new TreeNode<Integer>(11);
		TreeNode<Integer> t13 = new TreeNode<Integer>(13);
		TreeNode<Integer> t04b = new TreeNode<Integer>(4);
		TreeNode<Integer> t07 = new TreeNode<Integer>(7);
		TreeNode<Integer> t02 = new TreeNode<Integer>(2);
		TreeNode<Integer> t05 = new TreeNode<Integer>(5);
		TreeNode<Integer> t01 = new TreeNode<Integer>(1);
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
		TreeNode<Integer> root = makeTree();
		MaxDepth md = new MaxDepth();
		int actual = md.maxDepthV3(root);
		int expected = 4;
		System.out.println("level: " + actual);
		Assert.assertEquals(actual, expected);
	}
}
