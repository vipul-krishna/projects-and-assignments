package edu.neu.info6205;

public class DijkstraShortestPath {
	
	private static final int verticesCount=9;
	
	private int[][] graph;
	
	public DijkstraShortestPath() {
		graph = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},{4, 0, 8, 0, 0, 0, 0, 11, 0},{0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}};
	}
	
    public void getShortestPath(int src){
        int dist[] = new int[verticesCount]; 
        Boolean shortestPathTreeSet[] = new Boolean[verticesCount];

        for (int i = 0; i < verticesCount; i++){
            dist[i] = Integer.MAX_VALUE;
            shortestPathTreeSet[i] = false;
        }
        dist[src] = 0;
        for (int count = 0; count < verticesCount-1; count++){
           
            int u = calculateMinDistance(dist, shortestPathTreeSet);
            shortestPathTreeSet[u] = true;
            for (int v = 0; v < verticesCount; v++)
                if (!shortestPathTreeSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
        printShortestPath(dist, verticesCount, src);
    }
    
    public int calculateMinDistance(int dist[], Boolean shortestPathTreeSet[]){
        int min = Integer.MAX_VALUE, min_index=-1;
 
        for (int v = 0; v < verticesCount; v++)
            if (shortestPathTreeSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }
 
        return min_index;
    }
    
    public void printShortestPath(int dist[], int n, int src){
        System.out.println("Shortest Distance of the below vertices from Source: "+src);
        for (int i = 0; i < verticesCount; i++)
            System.out.println(i+" = "+dist[i]);
    }

}
