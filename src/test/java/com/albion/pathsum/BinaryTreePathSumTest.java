package com.albion.pathsum;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.TreeNode;


public class BinaryTreePathSumTest {

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
	public void testMatchingSum() {
		int expectedSum = 22;
		TreeNode<Integer> root = makeTree();
		BinaryTreePrinter.printNode(root);
		BinaryTreePathSum btps = new BinaryTreePathSum();
		List<ArrayList<Integer>> results = btps.pathSum(root, expectedSum);
		
		
		for(ArrayList<Integer> list : results) {
			System.out.println("=======");
			for(Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("=======");
		}
	}
}
