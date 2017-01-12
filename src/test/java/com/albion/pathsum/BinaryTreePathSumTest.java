package com.albion.pathsum;

import com.albion.common.tree.BinaryTreePrinter;
import com.albion.common.tree.TreeNode;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class BinaryTreePathSumTest {

	@DataProvider(name = "data")
	public Object[][] makeTree() {
		TreeNode<Integer> root = new TreeNode<>(5);
		TreeNode<Integer> t04a = new TreeNode<>(4);
		TreeNode<Integer> t08 = new TreeNode<>(8);
		TreeNode<Integer> t11 = new TreeNode<>(11);
		TreeNode<Integer> t13 = new TreeNode<>(13);
		TreeNode<Integer> t04b = new TreeNode<>(4);
		TreeNode<Integer> t07 = new TreeNode<>(7);
		TreeNode<Integer> t02 = new TreeNode<>(2);
		TreeNode<Integer> t05 = new TreeNode<>(5);
		TreeNode<Integer> t01 = new TreeNode<>(1);
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

        int[][] x = {{5,4,11,2}, {5,8,4,5}};
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i = 0; i < x.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j = 0; j < x[0].length; j++) {
                list.add(x[i][j]);
            }
            result.add(list);
        }

		return new Object[][] {
				{root,22, result}
		};
	}
	
	@Test(dataProvider = "data")
	public void testMatchingSum(TreeNode<Integer> root, int sum, ArrayList<ArrayList> expected) {

		BinaryTreePrinter.printNode(root);
		BinaryTreePathSum btps = new BinaryTreePathSum();
		ArrayList<ArrayList<Integer>> actual = btps.pathSum(root, sum);

        Assert.assertEquals(expected.size(), actual.size());

        for(ArrayList<Integer> list : actual) {
			System.out.println("=======");
			for(Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.println("");
			System.out.println("=======");
		}

        for (int i = 0; i < expected.size(); i++) {
            ArrayList<Integer> x = expected.get(i);
            ArrayList<Integer> y = actual.get(i);
            boolean result = x.containsAll(y) && y.containsAll(x);
            Assert.assertTrue(result);
        }
    }
}
