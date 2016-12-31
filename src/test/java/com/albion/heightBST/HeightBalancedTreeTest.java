package com.albion.heightBST;

import org.testng.annotations.Test;

import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.TreeNode;

public class HeightBalancedTreeTest {
  @Test
  public void testTree() {
	  
	  int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
	  HeightBalancedTree hbt = new HeightBalancedTree();
	  TreeNode<Integer> root = hbt.sortedArrayToBST(nums);
	  BinaryTreePrinter btp = new BinaryTreePrinter();
	  BinaryTreePrinter.printNode(root);
  }
}
