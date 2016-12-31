package com.albion.RPN;

import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.TreeNode;
import com.albion.heightBST.copy2.HeightBalancedTree;
import org.testng.annotations.Test;

/**
 * Created by dsch_iter on 12/30/16.
 */
public class RPNTest {
    @Test
    public void testTree() {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        HeightBalancedTree hbt = new HeightBalancedTree();
        TreeNode<Integer> root = hbt.sortedArrayToBST(nums);
        BinaryTreePrinter btp = new BinaryTreePrinter();
        btp.printNode(root);
    }
}