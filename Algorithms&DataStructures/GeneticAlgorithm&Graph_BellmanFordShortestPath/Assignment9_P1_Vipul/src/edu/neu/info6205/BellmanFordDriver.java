package edu.neu.info6205;

public class BellmanFordDriver {
	
	public static void main(String[] args){
        int V = 6;  // Number of vertices in graph
        int E = 9;  // Number of edges in graph
 
//        Graph graph = new Graph(V, E);
//        graph.constructGraph();
//        
//        graph.BellmanFordShortestPath(graph, 0);
        
        BellManFordShortestPath path = new BellManFordShortestPath(V, E);
        path.constructGraph();
        path.calculateShortestPathByBFMethod(path, 0);
    }

}
