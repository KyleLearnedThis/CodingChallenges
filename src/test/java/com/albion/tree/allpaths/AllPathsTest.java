package com.albion.tree.allpaths;


import com.albion.common.tree.node.BinarySearchTreeNode;
import com.albion.common.tree.utils.BinaryTreePrinter;
import com.albion.tree.heightBST.HeightBalancedTree;
import org.testng.annotations.Test;

public class AllPathsTest {

  @Test
  public void testBinaryTreePaths() {
      int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
      HeightBalancedTree hbt = new HeightBalancedTree();
      BinarySearchTreeNode<Integer> root = hbt.sortedArrayToBST(nums);
      BinaryTreePrinter.printNode(root);
      AllPaths a = new AllPaths();
      a.binaryTreePaths(root);
  }
}
