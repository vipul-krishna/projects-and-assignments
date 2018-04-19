package edu.neu.info6205;

public class PrimsAlgorithm {
	
	private static final int V = 7;
	
	public PrimsAlgorithm() {
		
	}
	
	public int[][] genearteGraph(){
		int graphMST[][] = new int[][] {{0, 5, 3, 0, 0, 0, 0},
            {5, 0, 4, 6, 2, 0, 0},
            {3, 4, 0, 5, 0, 11, 0},
            {0, 6, 5, 0, 7, 9, 0},
            {0, 2, 0, 7, 0, 12, 8},
            {0, 0, 11, 9, 12, 0, 7},
            {0, 0, 0, 0, 8, 7, 0},
            
          };
          
          return graphMST;
	}

    int minKey(int key[], Boolean mstSet[]) {

        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++) {
            if (mstSet[v] == false && key[v] < min) {
                min = key[v];
                min_index = v;
            }
        }

        return min_index;
    }

    void printMST(int parent[], int n, int graph[][]) {
    	System.out.println("MINIMUM SPANNING TREE using PRIM's ALGORITHM");
        System.out.println("0=a; 1=b; 2=c; 3=d; 4=e; 5=f; 6=g");
        for (int i = 1; i < V; i++) {
            System.out.println("Edge "+parent[i] + "-" + i + " --> "
                    + graph[i][parent[i]]);
        }
    }

    void primMST(int graph[][]) {

        int parent[] = new int[V];

        int key[] = new int[V];

        Boolean mstSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            key[i] = Integer.MAX_VALUE;
            mstSet[i] = false;
        }

        key[0] = 0;
        parent[0] = -1;

        for (int count = 0; count < V - 1; count++) {

            int u = minKey(key, mstSet);

            mstSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && mstSet[v] == false
                        && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        printMST(parent, V, graph);
    }

}
