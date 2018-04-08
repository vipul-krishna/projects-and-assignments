package edu.neu.info6205;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AdjListUndirectedGraph {
	
	private Bag<Integer>[] adjList;
	private int edgeCount;
	Bag<Integer> bag;
	private int verticesCount;
	
	public AdjListUndirectedGraph(int edgeCount, int verticesCount) {
		this.verticesCount = verticesCount;
		this.edgeCount = edgeCount;
		adjList = (Bag<Integer>[])new Bag[edgeCount];
		for(int i = 0; i < edgeCount; i++) {
			adjList[i] = new Bag<Integer>();
		}
		bag = new Bag<Integer>();
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

	public Bag<Integer>[] getAdjList() {
		return adjList;
	}

	public void setAdjList(Bag<Integer>[] adjList) {
		this.adjList = adjList;
	}

	public int getEdgeCount() {
		return edgeCount;
	}

	public void setEdgeCount(int edgeCount) {
		this.edgeCount = edgeCount;
	}
	
	
	public int getVerticesCount() {
		return verticesCount;
	}

	public void setVerticesCount(int verticesCount) {
		this.verticesCount = verticesCount;
	}
	Set<Integer> verticesSet = new HashSet<Integer>();
	public void addEdge(int v1, int v2) {
		adjList[v1].getBag().add(v2);
		adjList[v2].getBag().add(v1);
		verticesSet.add(v1);
		verticesSet.add(v2);
	}
	
	
	
	
	public void printVertices() {
		System.out.println("UNDIRECTED GRAPH: ");
		System.out.println("The Vertices of the Graph are: ");
		Iterator<Integer> it  = verticesSet.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.println("-------------------------");
		
	}
	public void printAdjacencyList() {
		System.out.println("AdjacencyList elements in case of Undirected Graph for above vertices in Order:");
		Iterator<Integer> it  = verticesSet.iterator();
		while(it.hasNext()) {
			//System.out.println("Bag Size = "+adjList[it.next()].getBag().size());
			for(Integer m : adjList[it.next()].getBag()) {
				System.out.print(m+ " ");
			}
			System.out.println();
		}
		System.out.println("***********************************************************************************");
		System.out.println();
	}

}
