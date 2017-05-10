package com.albion.tree.symmetry;

import com.albion.core.BinaryTreePrinter;
import com.albion.core.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SymmetricTreeTest {
    public TreeNode makeTreeV1() {
        /**
         *
         *       1
                / \
               2  2
             / \ / \
            3  4 4  3
         */
        TreeNode t1 = new TreeNode(1);
        TreeNode t21 = new TreeNode(2);
        TreeNode t22 = new TreeNode(2);
        TreeNode t31 = new TreeNode(3);
        TreeNode t32 = new TreeNode(4);
        TreeNode t33 = new TreeNode(4);
        TreeNode t34 = new TreeNode(3);
        t1.left = t21;
        t1.right = t22;
        t21.left = t31;
        t21.right = t32;
        t22.left = t33;
        t22.right = t34;
        return t1;
    }

    @Test
    public void testIsSymmetric() throws Exception {
        TreeNode root = makeTreeV1();
        BinaryTreePrinter.printNode(root);
        boolean expected = true;
        SymmetricTree tree = new SymmetricTree();
        boolean actual = tree.isSymmetric(root);
        Assert.assertEquals(actual,expected);
    }
}