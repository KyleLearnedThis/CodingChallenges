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
		BinarySearchTreeNode<Integer> temp = p.getLeft();
		p.left = p.right;
		p.right = temp;

		if(p.left!=null){
			helper(p.getLeft());
		}
		if(p.right!=null){
			helper(p.getRight());
		}
	}
	
	public BinarySearchTreeNode<Integer> invert(){
		invertTree(this.root);
		return this.root;
	}
}
