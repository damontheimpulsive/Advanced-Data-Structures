package com.Trees.java;

public class TreeNode {
	
	
	int data;
	TreeNode leftChild;
	TreeNode rightChild;
	
	public TreeNode(int data) {
		// TODO Auto-generated constructor stub
		
		this.data = data;
	}
	
	
		
		
		protected static  TreeNode createBinaryTree() {
			
			TreeNode rootNode  = new TreeNode(4);
			
			TreeNode node1  = new TreeNode(1);
			TreeNode node2  = new TreeNode(2);
			TreeNode node3  = new TreeNode(3);
			TreeNode node5  = new TreeNode(5);
			
			
			rootNode.leftChild  = node2;
			rootNode.rightChild  =node5;
			
			node2.leftChild =  node1;
			node2.rightChild = node3; 
			
			return rootNode;
					
		}
		
		
	
	

}
