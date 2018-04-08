package edu.neu.info6225;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.prefs.BackingStoreException;

public class GraphGenerator {
	
	private int edgesCount;
	private LinkedList<Integer> adjList[];
	
	
	public GraphGenerator(int edgesCount) {
		this.edgesCount = edgesCount;
		adjList = new LinkedList[edgesCount];
		for(int i = 0; i<edgesCount; i = i+1) {
			adjList[i] = new LinkedList<>();
		}
		
		addEdge(5, 6);
		addEdge(4, 6);
		addEdge(3, 7);
	    addEdge(6, 7);
	    addEdge(5, 7);
	    addEdge(1, 4);
	    addEdge(2, 4);
	    addEdge(2, 3);
	    addEdge(4, 7);
	}
	
	////Setters and Getters///////
	
	public int getEdgesCount() {
		return edgesCount;
	}

	public void setEdgesCount(int edgesCount) {
		this.edgesCount = edgesCount;
	}

	public LinkedList<Integer>[] getAdjList() {
		return adjList;
	}

	public void setAdjList(LinkedList<Integer>[] adjList) {
		this.adjList = adjList;
	}
	
	public void addEdge(int v1, int v2) {
		adjList[v1].add(v2);
		adjList[v2].add(v1);
	}

//	public void dfsTraversal(int vertex) {
//		boolean[] visited = new boolean[edgesCount];
//		dfsUtil(vertex, visited);
//		
//	}
//	
//	public void dfsUtil(int vertex, boolean visited[]) {
//		
//		System.out.print(vertex+" ");
//		visited[vertex] = true;
//		
//		Iterator<Integer> it = adjList[vertex].listIterator();
//		while(it.hasNext()) {
//			int adjVertex = it.next();
//			if(!visited[adjVertex]) {
//				dfsUtil(adjVertex, visited);
//			}
//		}
//		
//	}
 

}
