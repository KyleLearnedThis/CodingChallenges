package com.albion.tree.allpaths;

import com.albion.common.tree.node.BinarySearchTreeNode;

import java.util.ArrayList;
import java.util.List;

public class AllPaths {
	public List<String> binaryTreePaths(BinarySearchTreeNode<Integer> root) {
	    ArrayList<String> finalResult = new ArrayList<String>();
	 
	    if(root==null)
	        return finalResult;
	 
	    ArrayList<String> curr = new ArrayList<String>();
	    ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
	 
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
	 
	public void dfs(BinarySearchTreeNode<Integer> root, ArrayList<ArrayList<String>> list, ArrayList<String> curr){
	    curr.add(String.valueOf(root.value));
	 
	    if(root.left==null && root.right==null){
	        list.add(curr);
	        return;
	    }
	 
	    if(root.left!=null){
	        ArrayList<String> temp = new ArrayList<String>(curr);
	        dfs(root.getLeft(), list, temp);
	    }
	 
	    if(root.right!=null){
	        ArrayList<String> temp = new ArrayList<String>(curr);
	        dfs(root.getRight(), list, temp);
	    } 
	}
}
