package edu.neu.info6225;

import java.util.Iterator;
import java.util.LinkedList;

public class DfsImplementation{
	
	
	
	public void dfsTraversal(int vertex, LinkedList<Integer> adjList[], int edgeCount) {
		boolean[] visited = new boolean[edgeCount];
		dfsUtil(vertex, visited, adjList);
		
	}
	
	public void dfsUtil(int vertex, boolean visited[], LinkedList<Integer> adjList[]) {
		
		System.out.print(vertex+" ");
		visited[vertex] = true;
		
		Iterator<Integer> it = adjList[vertex].listIterator();
		while(it.hasNext()) {
			int adjVertex = it.next();
			if(!visited[adjVertex]) {
				dfsUtil(adjVertex, visited, adjList);
			}
		}
		
	}

}
