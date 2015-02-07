package com.Trees.java;


import java.util.Stack;



public class InorderTraversal {

	

	public static void main(String[] args) {
		
		
	    System.out.println(" User Binary Tree = "+ " "  + TreeNode.createBinaryTree().data);		
		traversing(TreeNode.createBinaryTree());
		

	}

	private static void traversing(TreeNode rootNode) {
		
		if(rootNode==null)
			return;
		
		/*
	Step1  Create an empty Stack (stack) and Initialize currentNode as root
    Step2  Push the currentNode to stack and set currentNode = currentNode.left 
            until currentNode is NULL
    Step3   If currentNode is NULL and stack is not empty then 
           •Pop the top node from stack and print it
           •set currentNode = currentNode.right 
           •go to step 2
    Step4   If stack is empty and currentNode is also null then we are done with it 
    
		 */
		
		Stack<TreeNode>  stack = new Stack<TreeNode>();
		TreeNode currentNode  = rootNode;
		
		while(! stack.isEmpty() || currentNode !=null)
		{
			if(currentNode!=null)
			{
				stack.push(currentNode);
				currentNode = currentNode.leftChild;
			}
			else
			{
				System.out.printf("%d",stack.pop().data);
				currentNode = stack.pop().rightChild;
				
				
			}
				
			
		}
  		
		
		
		
	}

	/*private static TreeNode createBinaryTree() {
		
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
				
	}*/

}
