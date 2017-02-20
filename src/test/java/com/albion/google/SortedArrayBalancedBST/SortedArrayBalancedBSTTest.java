package com.albion.google.SortedArrayBalancedBST;

import com.albion.core.BinaryTreePrinter;
import com.albion.core.TreeNode;
import org.testng.annotations.Test;

public class SortedArrayBalancedBSTTest {
    @Test
    public void testSortedArrayToBST() throws Exception {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        SortedArrayBalancedBST s = new SortedArrayBalancedBST();
        TreeNode root = s.sortedArrayToBST(nums);
        BinaryTreePrinter.printNode(root);
    }
}
