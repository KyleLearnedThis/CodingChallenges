package com.albion.tree.allpaths;

import com.albion.common.tree.node.BinarySearchTreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllPaths {
	public List<String> binaryTreePaths(BinarySearchTreeNode<Integer> root) {
		ArrayList<String> finalResult = new ArrayList<>();

		if(root==null) {
			return finalResult;
		}
		ArrayList<String> curr = new ArrayList<>();
		ArrayList<ArrayList<String>> results = new ArrayList<>();

		dfs(root, results, curr);

		for(ArrayList<String> al : results){
			StringBuilder sb = new StringBuilder();
			sb.append(al.get(0));
			for(int i=1; i<al.size();i++){
				sb.append("->"+al.get(i));
			}
			String line = sb.toString();
			System.out.println("========= LINE: " + line);
			finalResult.add(line);
		}

		return finalResult;
	}

	public void dfs(BinarySearchTreeNode<Integer> root, ArrayList<ArrayList<String>> allPaths, ArrayList<String> path){
		path.add(String.valueOf(root.value));

		if(root.left == null && root.right == null){
			allPaths.add(path);
			return;
		}

		if(root.left != null){
			ArrayList<String> temp = new ArrayList<>(path);
			dfs(root.getLeft(), allPaths, temp);
		}

		if(root.right != null){
			ArrayList<String> temp = new ArrayList<>(path);
			dfs(root.getRight(), allPaths, temp);
		}
	}
}
