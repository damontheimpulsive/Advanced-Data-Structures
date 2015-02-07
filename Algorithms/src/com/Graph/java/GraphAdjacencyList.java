package com.Graph.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GraphAdjacencyList {

	
	HashMap<Integer, ArrayList<Integer>> hashMap;
	
	public GraphAdjacencyList(int noVertices) {
		
		// HashMap with multiple values with the same Key				
		 hashMap = new HashMap<Integer,ArrayList<Integer>>();
		 
		for(int i=1;i<=noVertices;i++)
		{
			hashMap.put(i, new ArrayList<Integer>());
		}
	}

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
	  int noVertices = 	scanner.nextInt();
	   int noEdges = scanner.nextInt();
	   
	   GraphAdjacencyList graphObject = new GraphAdjacencyList(noVertices);
	   
	 
	   int count=1;
	   
	   while(count <= noEdges)
	   {
		   
		   int sourceVertex  = scanner.nextInt();
		   int destinationVertex = scanner.nextInt();	
		   graphObject.setEdge(sourceVertex,destinationVertex);
		   count++;
		  
	   }
	
	   
	   for (int i = 1 ; i <= noVertices ; i++)
       {
		   
		   
           System.out.print(i+"->");
           ArrayList<Integer> edgeList = graphObject.getEdge(i);
           for (int j = 1 ; ; j++ )
           {
               if (j != edgeList.size())
               {
                   System.out.print(edgeList.get(j - 1 )+"->");
               }else
               {
                   System.out.print(edgeList.get(j - 1 ));
                   break;
               }
           }
           
           System.out.println();
       }

		
		
		

	}

	private void setEdge(int sourceVertex, int destinationVertex) {
		
		if(sourceVertex > hashMap.size() || destinationVertex > hashMap.size())
		{
			 System.out.println("Vertex entered is not present");
				return;	
		}
		
		ArrayList<Integer> arrayListSource  = hashMap.get(sourceVertex);
		arrayListSource.add(destinationVertex);
		
		ArrayList<Integer> arrayListDestination  = hashMap.get(destinationVertex);
		arrayListDestination.add(sourceVertex);
	
		
	}
	
	private ArrayList<Integer> getEdge(int sourceVertex)
	{
		if(sourceVertex > hashMap.size())
		{
			 System.out.println("Vertex entered is not present");
				return null;	
		 }
		
		return hashMap.get(sourceVertex);
		
	}
	

}
