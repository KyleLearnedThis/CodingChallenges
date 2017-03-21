package com.albion.google.pathsum;

import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.node.BinarySearchTreeNode;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class BinaryTreePathSumTest {

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

	@DataProvider(name = "data")
	public Object[][] makeDataProvider() {
		BinarySearchTreeNode<Integer> root = makeTree();
		int[][] x = {{5,4,11,2}, {5,8,4,5}};
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		for(int i = 0; i < x.length; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			for(int j = 0; j < x[0].length; j++) {
				list.add(x[i][j]);
			}
			result.add(list);
		}

		return new Object[][] {
				{root,22, result}
		};
	}
	
	@Test(dataProvider = "data")
	public void testMatchingSum(BinarySearchTreeNode<Integer> root, int sum, ArrayList<ArrayList> expected) {

		BinaryTreePrinter.printNode(root);
		BinaryTreePathSum ps = new BinaryTreePathSum();
		ArrayList<ArrayList<Integer>> actual = ps.pathSum(root, sum);

		Assert.assertEquals(expected.size(), actual.size());
		ps.printAllPaths(actual);

		for (int i = 0; i < expected.size(); i++) {
			ArrayList<Integer> x = expected.get(i);
			ArrayList<Integer> y = actual.get(i);
			boolean result = x.containsAll(y) && y.containsAll(x);
			Assert.assertTrue(result);
		}
	}
}
