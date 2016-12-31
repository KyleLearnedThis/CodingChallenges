package com.albion.pathsum;

import java.util.ArrayList;
import java.util.List;

import com.albion.common.tree.TreeNode;

public class BinaryTreePathSum {
	public List<ArrayList<Integer>> pathSum(TreeNode<Integer> root, int sum) {
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    if(root == null) 
	        return result;
	 
	    ArrayList<Integer> l = new ArrayList<Integer>();
	    l.add(root.value);
	    dfs(root, sum-root.value, result, l);
	    return result;
	}
	 
	public void dfs(TreeNode<Integer> t, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> l){
	    if(t.left==null && t.right==null && sum==0){
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        temp.addAll(l);
	        result.add(temp);
	    }
	 
	    //search path of left node
	    if(t.left != null){
	        l.add(t.left.value);
	        dfs(t.left, sum-t.left.value, result, l);
	        l.remove(l.size()-1);
	    }
	 
	    //search path of right node
	    if(t.right!=null){
	        l.add(t.right.value);
	        dfs(t.right, sum-t.right.value, result, l);
	        l.remove(l.size()-1);
	    }
	}
}
