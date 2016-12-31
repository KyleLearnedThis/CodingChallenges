package com.albion.tree.allpaths;

import org.testng.annotations.Test;

import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.TreeNode;
import com.albion.heightBST.HeightBalancedTree;

public class AllPathsTest {

  @Test
  public void testBinaryTreePaths() {
	  int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
	  HeightBalancedTree hbt = new HeightBalancedTree();
	  TreeNode<Integer> root = hbt.sortedArrayToBST(nums);
	  BinaryTreePrinter btp = new BinaryTreePrinter();
	  BinaryTreePrinter.printNode(root);
	  
	  AllPaths a = new AllPaths();
	  a.binaryTreePaths(root);
  }
}
