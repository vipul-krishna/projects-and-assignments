package edu.neu.info6225;

public class TraversalDriver {
	
	public static void main(String arg[]) {
		GraphGenerator graph  = new GraphGenerator(9);

	    
	    System.out.println("Depth first Traversal of Graph starting at Vertex 1");
	    DfsImplementation dfs = new DfsImplementation();
	    dfs.dfsTraversal(1, graph.getAdjList(), graph.getEdgesCount());
	    
	    System.out.println();
	    System.out.println("Breadth first Traversal of Graph starting at Vertex 1");
	    BfsImplementation bfs = new BfsImplementation();
	    bfs.bfsTraversal(1, graph.getAdjList(), graph.getEdgesCount());
		
		
	}

}
