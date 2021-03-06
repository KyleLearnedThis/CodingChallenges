package com.albion.tree.heightBST;

import com.albion.common.tree.node.BinarySearchTreeNode;
import com.albion.common.tree.utils.BinaryTreePrinter;
import org.testng.annotations.Test;

public class HeightBalancedTreeTest {
  @Test
  public void testTree() {
      int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
      HeightBalancedTree hbt = new HeightBalancedTree();
      BinarySearchTreeNode<Integer> root = hbt.sortedArrayToBST(nums);
      BinaryTreePrinter.printNode(root);
  }
}
