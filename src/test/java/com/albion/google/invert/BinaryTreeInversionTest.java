package com.albion.google.invert;

import com.albion.common.search.bst.BinaryTreeInversion;
import com.albion.common.tree.BinarySearchTree;
import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.node.BinarySearchTreeNode;
import org.testng.annotations.Test;

public class BinaryTreeInversionTest {

	@Test
	public void testInversion() {
		Integer[] array = {15, 6, 18, 3, 7, 17, 20, 2, 4, 13, 9};
		BinarySearchTree<Integer> bt = new BinarySearchTree<>();
		for(Integer x : array) {
			bt.insert(x);
		}

		BinarySearchTreeNode<Integer> root = bt.getRoot();
		BinaryTreePrinter.printNode(root);

		BinaryTreeInversion bti = new BinaryTreeInversion(root);
		bti.invert();

		BinaryTreePrinter.printNode(root);
	}
}
