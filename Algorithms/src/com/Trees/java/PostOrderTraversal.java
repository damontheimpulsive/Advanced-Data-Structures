package com.Trees.java;

import java.util.Stack;

public class PostOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		traversing(TreeNode.createBinaryTree());

	}

	private static void traversing(TreeNode rootNode) {
		
		if(rootNode==null)
			return;
		
		/*
		  Step1 Create an empty stack s and set currentNode =root.
		  
          Step2 while currentNode is not NULL Do following
            •  Push currentNode 's right child and then currentNode to stack.
            •  Set currentNode =currentNode.left
            
         Step3  Pop an node from stack and set it as root and set it to currentNode 
            •If the popped node has a right child and the right child is 
            at top of stack, then remove the right child from stack, 
            push the current node back and set currentNode as currentNode 's right child.
            •Else print currentNode 's data and set currentNode as NULL.
             
         Step4 Repeat steps 2 and 3 while stack is not empty.

	 	  
		  
		 */
		
		Stack<TreeNode>  stack = new Stack<TreeNode>(); //  Step1 is here
		TreeNode currentNode  = rootNode;
		while(currentNode!=null)
		{
			
			if(currentNode.rightChild !=null)// Step is following here 
			{
				stack.push(currentNode.rightChild);
				stack.push(currentNode);
				currentNode = currentNode.leftChild;
				
				continue;
			}
			
		}
		
		
		if(stack.isEmpty())
			return;
		
		currentNode  = stack.pop();  // Step3 
		if(currentNode.rightChild!= null &&  !stack.isEmpty() 
				&& currentNode.rightChild == stack.peek())
		{
			
			stack.pop();
			stack.push(currentNode);
			currentNode = currentNode.rightChild;
			
			
			
		}
		
		// Step4 is following here.
		else {
                   System.out.println(currentNode.data);
                   currentNode=null;
                   
		}
		
		
	}

/*	private static TreeNode createBinaryTree() {
		
		TreeNode rootNode = new TreeNode(4);
		
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node5 = new TreeNode(5);
		
		
		rootNode.leftChild =  node2;
		rootNode.rightChild = node5;
		 
		node2.leftChild = node1;
		node2.rightChild = node3;
		
		
		
		return rootNode;

		
	}*/

}
