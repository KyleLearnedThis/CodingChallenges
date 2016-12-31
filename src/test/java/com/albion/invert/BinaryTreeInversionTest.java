package com.albion.invert;

import org.testng.annotations.Test;

import com.albion.common.search.bst.BinaryTreeInversion;
import com.albion.common.tree.BinaryTree;
import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.TreeNode;

public class BinaryTreeInversionTest {

	@Test
	public void testInversion() {
		Integer[] array = {15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9};
		BinaryTree bt = new BinaryTree();

		for(Integer x : array) {
			bt.insert(x);
		}

		TreeNode<Integer> root = bt.getRoot();
		BinaryTreePrinter.printNode(root);

		BinaryTreeInversion bti = new BinaryTreeInversion(root);
		bti.invert();

		BinaryTreePrinter.printNode(root);
	}
}
