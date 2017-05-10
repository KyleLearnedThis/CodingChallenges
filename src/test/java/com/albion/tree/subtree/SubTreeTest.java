package com.albion.tree.subtree;


import com.albion.core.BinaryTreePrinter;
import com.albion.core.TreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubTreeTest {

    /**
     *
     *       3
            / \
           4  5
          / \
         1  2
     */
    public TreeNode makeTreeV1() {
        TreeNode a = new TreeNode(3);
        TreeNode b = new TreeNode(4);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(2);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        return a;
    }

    /**
     * 4
      / \
     1  2
     */
    public TreeNode makeTreeV2() {
        TreeNode b = new TreeNode(4);
        TreeNode d = new TreeNode(1);
        TreeNode e = new TreeNode(2);
        b.left = d;
        b.right = e;
        return b;
    }
    @Test
    public void testIsSubtree() throws Exception {
        boolean expected = true;
        TreeNode root = makeTreeV1();
        BinaryTreePrinter.printNode(root);
        TreeNode sub = makeTreeV2();
        BinaryTreePrinter.printNode(sub);

        SubTree subTree = new SubTree();
        boolean actual = subTree.isSubtree(root, sub);
        Assert.assertEquals(actual, expected);
    }

}