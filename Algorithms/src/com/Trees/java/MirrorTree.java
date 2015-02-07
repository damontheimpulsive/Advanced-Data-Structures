package com.Trees.java;

import java.util.Stack;



public class MirrorTree {

	public static void main(String[] args) {

		
		mirrorMethod(TreeNode.createBinaryTree());
		
		
		

	}

	private static void mirrorMethod(TreeNode rootNode) {
		
		if(rootNode==null  ||  (rootNode.leftChild ==null && rootNode.rightChild == null))
			return;
		
		Stack<TreeNode>  stack = new Stack<TreeNode>();
		
		stack.push(rootNode);
		while(!stack.isEmpty())
		{

		    swap(rootNode.leftChild,rootNode.rightChild);
		    
		    
		     if(rootNode.leftChild !=null)
		    	 stack.push(rootNode.leftChild);
		     
		     if(rootNode.rightChild!=null)
		    	 stack.push(rootNode.rightChild);
		    	  
		}
		
  		
			    
			    
			    
		
		
		
		
	}

	private static void swap(TreeNode leftChild, TreeNode rightChild) {
		
		
		TreeNode tempNode;
		
		tempNode = leftChild;
		leftChild = rightChild;
		rightChild = tempNode;
		
	}

}
