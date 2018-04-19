package edu.neu.info6205;

import java.util.Arrays;

public class KruskalAlgorithm {
	
    class Edge implements Comparable<Edge>
    {
        int src, dest, weight;
 
        public int compareTo(Edge compareEdge)
        {
            return this.weight-compareEdge.weight;
        }
    };
    
    public void generateGraph() {
    	edge[0].src = 0;
        edge[0].dest = 1;
        edge[0].weight = 5;

        edge[1].src = 0;
        edge[1].dest = 2;
        edge[1].weight = 3;

        edge[2].src = 1;
        edge[2].dest = 2;
        edge[2].weight = 4;

        edge[3].src = 1;
        edge[3].dest = 3;
        edge[3].weight = 6;

        edge[4].src = 2;
        edge[4].dest = 3;
        edge[4].weight = 5;

        edge[5].src = 1;
        edge[5].dest = 4;
        edge[5].weight = 2;
 
        edge[6].src = 3;
        edge[6].dest = 4;
        edge[6].weight = 7;
 
    
        edge[7].src = 3;
        edge[7].dest = 5;
        edge[7].weight = 9;
 
        edge[8].src = 2;
        edge[8].dest = 5;
        edge[8].weight = 11;
  
        edge[9].src = 4;
        edge[9].dest = 5;
        edge[9].weight = 12;

        edge[10].src = 4;
        edge[10].dest = 6;
        edge[10].weight = 8;

        edge[11].src = 5;
        edge[11].dest = 6;
        edge[11].weight = 7;
    }
 
    class subset
    {
        int parent, rank;
    };
 
    int V, E;    
    Edge edge[]; 
    KruskalAlgorithm(int v, int e)
    {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i=0; i<e; ++i)
            edge[i] = new Edge();
    }
 
    int find(subset subsets[], int i)
    {
        
        if (subsets[i].parent != i)
            subsets[i].parent = find(subsets, subsets[i].parent);
 
        return subsets[i].parent;
    }
 
  
    void Union(subset subsets[], int x, int y)
    {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);
 
        if (subsets[xroot].rank < subsets[yroot].rank)
            subsets[xroot].parent = yroot;
        else if (subsets[xroot].rank > subsets[yroot].rank)
            subsets[yroot].parent = xroot;

        else
        {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    public void showKruskalMST()
    {
        Edge result[] = new Edge[V];  
        int e = 0;
        int i = 0;
        for (i=0; i<V; ++i)
            result[i] = new Edge();

        Arrays.sort(edge);

        subset subsets[] = new subset[V];
        for(i=0; i<V; ++i)
            subsets[i]=new subset();

        for (int v = 0; v < V; ++v)
        {
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }
 
        i = 0;  
        while (e < V - 1)
        {
            
            Edge next_edge = new Edge();
            next_edge = edge[i++];
 
            int x = find(subsets, next_edge.src);
            int y = find(subsets, next_edge.dest);
 
            if (x != y)
            {
                result[e++] = next_edge;
                Union(subsets, x, y);
            }
            
        }
 
        System.out.println("MINIMUM SPANNING TREE using KRUSKAL'S ALGORITHM");
        System.out.println("0=a; 1=b; 2=c; 3=d; 4=e; 5=f; 6=g");
        for (i = 0; i < e; ++i)
            System.out.println("Edge "+result[i].src+"-" + 
                   result[i].dest+" --> " + result[i].weight);
    }
}
