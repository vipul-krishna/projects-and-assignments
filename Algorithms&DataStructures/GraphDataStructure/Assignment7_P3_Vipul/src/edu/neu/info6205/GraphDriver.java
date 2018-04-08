package edu.neu.info6205;


public class GraphDriver {

	public static void main(String[] args) {
		
		AdjListUndirectedGraph undirectedGraph  = new AdjListUndirectedGraph(9, 7);//passing edgeCount and verticesCount
		undirectedGraph.printVertices();
		undirectedGraph.printAdjacencyList();
		
		AdjListDirectedGraph directedGraph = new AdjListDirectedGraph(9, 7);//passing edgeCount and verticesCount
		directedGraph.printVertices();
		directedGraph.printAdjacencyList();
	    
	    

	}

}
