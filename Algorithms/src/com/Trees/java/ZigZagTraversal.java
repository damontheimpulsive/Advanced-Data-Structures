package com.Trees.java;

import java.util.Stack;

public class ZigZagTraversal {

	public static void main(String[] args) 
	{
		
		traversing(TreeNode.createBinaryTree());
		
	}

	private static void traversing(TreeNode rootNode) {
		
		
		
/*		Step1  Create an empty stack s and push root to it.
 * 
		Step2    while stack is not NULL Do following
		      Create a empty stack called tempStack.
		      Pop a node from stack and push it to tempStack depending on directionFlag
		      Change directionFlag to change the direction of traversal
		      set stack=tempStack
*/
	
		
		
		
		
		Stack<TreeNode>  stack = new Stack<TreeNode>();// Step1 is follow
		stack.push(rootNode);
		boolean directionFlag = false;
		
		while(!stack.isEmpty())
		{
			
			Stack<TreeNode>  tempStack = new Stack<TreeNode>(); // Created a temporary Stack
			     
			     while(!tempStack.isEmpty())
			     {
			   
		         TreeNode tempNode =  stack.pop();
		         
			    if(!directionFlag)
			    {
			    	if(tempNode.leftChild!=null)
			    		 tempStack.push(tempNode.leftChild);
			    	else if(tempNode.rightChild!=null)
			    	tempStack.push(tempNode.rightChild);
			    }
			
		         	directionFlag = !directionFlag;
			     }
			 	stack = tempStack;
		}
	
		
	
		
	}

}
