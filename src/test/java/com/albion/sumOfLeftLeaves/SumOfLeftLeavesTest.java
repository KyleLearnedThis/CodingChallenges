package com.albion.sumOfLeftLeaves;

import com.albion.core.BinaryTreePrinter;
import com.albion.core.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumOfLeftLeavesTest {

    public TreeNode makeTree() {
        TreeNode root = new TreeNode(5);
        TreeNode t04a = new TreeNode(4);
        TreeNode t08 = new TreeNode(8);
        TreeNode t11 = new TreeNode(11);
        TreeNode t13 = new TreeNode(13);
        TreeNode t04b = new TreeNode(4);
        TreeNode t07 = new TreeNode(7);
        TreeNode t02 = new TreeNode(2);
        TreeNode t05 = new TreeNode(5);
        TreeNode t01 = new TreeNode(1);
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
    public void testSumOfLeftLeaves() throws Exception {
        TreeNode root = makeTree();
        BinaryTreePrinter.printNode(root);
        SumOfLeftLeaves s = new SumOfLeftLeaves();
        int actual = s.sumOfLeftLeaves(root);
        Assert.assertEquals(actual, 25);

        actual = s.sumOfLeftLeavesV2(root);
        Assert.assertEquals(actual, 25);

        actual = s.sumOfLeftLeavesV3(root);
        Assert.assertEquals(actual, 25);
    }
}