package com.albion.tree.PostOrderIterative;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.albion.core.TreeNode;

public class PostOrderTraversalTest {

	@DataProvider(name = "data01")
	public Object[][] data01() {
		TreeNode a1 = new TreeNode(1);
		TreeNode a2 = new TreeNode(2);
		a1.right = a2;

		TreeNode b1 = new TreeNode(1);

		Object[][] ret = new Object[][] { { a1 }, {b1} };
		return ret;
	}

	@Test(dataProvider = "data01")
	public void postorderTraversal(TreeNode root) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		PostOrderIterative s = new PostOrderIterative();
		result = s.postOrderTraversal(root);
		print(result);
	}

	//@Test(dataProvider = "data01")
	public void postorderTraversal2(TreeNode root) {

		ArrayList<Integer> result = new ArrayList<Integer>();
		PostOrderIterative s = new PostOrderIterative();
		s.postOrderTraversalV2(root, result);
		print(result);
	}

	public void print(ArrayList<Integer> result) {
		for (Integer i : result) {
			System.out.print(i + "=");
		}
		System.out.println("");
	}
}
