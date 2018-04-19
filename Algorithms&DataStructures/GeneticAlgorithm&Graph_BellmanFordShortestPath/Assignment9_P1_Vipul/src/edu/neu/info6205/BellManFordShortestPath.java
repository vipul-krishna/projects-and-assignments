package edu.neu.info6205;

public class BellManFordShortestPath {
	class Edge {
		int src, dest, weight;
		Edge() {
			src = dest = weight = 0;
		}
	};

	int V, E;
	Edge edge[];
	BellManFordShortestPath(int v, int e)
	{
		V = v;
		E = e;
		edge = new Edge[e];
		for (int i=0; i<e; ++i)
			edge[i] = new Edge();
	}

	public void constructGraph(){

		edge[0].src = 0;
		edge[0].dest = 1;
		edge[0].weight = 5;


		edge[1].src = 0;
		edge[1].dest = 2;
		edge[1].weight = -2;

		edge[2].src = 1;
		edge[2].dest = 3;
		edge[2].weight = 1;


		edge[3].src = 2;
		edge[3].dest = 1;
		edge[3].weight = 2;


		edge[4].src =2;
		edge[4].dest =3;
		edge[4].weight =4;

		edge[5].src = 2;
		edge[5].dest = 4;
		edge[5].weight = 5;


		edge[6].src = 3;
		edge[6].dest = 4;
		edge[6].weight =-1;


		edge[7].src = 3;
		edge[7].dest = 5;
		edge[7].weight = 3;


		edge[7].src = 4;
		edge[7].dest = 5;
		edge[7].weight = 1;

	}
	
	
	public void calculateShortestPathByBFMethod(BellManFordShortestPath graph,int src){
		int V = graph.V, E = graph.E;
		int dist[] = new int[V];

		for (int i=0; i<V; ++i)
			dist[i] = Integer.MAX_VALUE;
		dist[src] = 0;

		for (int i=1; i<V; ++i)
		{
			for (int j=0; j<E; ++j)
			{
				int u = graph.edge[j].src;
				int v = graph.edge[j].dest;
				int weight = graph.edge[j].weight;
				if (dist[u]!=Integer.MAX_VALUE &&
						dist[u]+weight<dist[v])
					dist[v]=dist[u]+weight;
			}
		}


		for (int j=0; j<E; ++j)
		{
			int u = graph.edge[j].src;

			int v = graph.edge[j].dest;
			int weight = graph.edge[j].weight;
			if (dist[u] != Integer.MAX_VALUE &&
					dist[u]+weight < dist[v])
				System.out.println("Graph contains negative weight cycle");
		}
		printShortestPath(dist, V);
	}

	public void printShortestPath(int dist[], int V){
		System.out.println("Vertex    Distance from Source 's'");
		
			System.out.println(" s "+"\t\t"+dist[0]);
			System.out.println(" A "+"\t\t"+dist[0]);
			System.out.println(" B "+"\t\t"+dist[2]);
			System.out.println(" C "+"\t\t"+dist[3]);
			System.out.println(" D "+"\t\t"+dist[4]);
			System.out.println(" t "+"\t\t"+dist[5]);
	}
		

}
