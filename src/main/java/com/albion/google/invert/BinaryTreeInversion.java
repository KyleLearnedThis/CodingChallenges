package com.albion.google.invert;

import com.albion.common.tree.node.BinarySearchTreeNode;

public class BinaryTreeInversion {
	
	public BinarySearchTreeNode<Integer> root;
	
	public BinaryTreeInversion(BinarySearchTreeNode<Integer> root) {
		this.root = root;
	}
	
	public BinarySearchTreeNode<Integer> invertTree(BinarySearchTreeNode<Integer> root) {
		if(root!=null){
			helper(root);
		}
		return root;
	}

	public void helper(BinarySearchTreeNode<Integer> p){
		BinarySearchTreeNode<Integer> left = p.getLeft();
		BinarySearchTreeNode<Integer> right = p.getRight();
		BinarySearchTreeNode<Integer> temp = left;
		left = right;
		right = temp;

		if(left!=null){
			helper(left);
		}
		if(right!=null){
			helper(right);
		}
	}
	
	public BinarySearchTreeNode<Integer> invert(){
		invertTree(this.root);
		return this.root;
	}
}
