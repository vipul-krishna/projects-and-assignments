package edu.neu.info6225;

import java.util.Iterator;
import java.util.LinkedList;

public class BfsImplementation {
	
	public void bfsTraversal(int vertex, LinkedList<Integer> adjList[], int edgeCount) {
		
		boolean[] visited = new boolean[edgeCount];
		visited[vertex] = true;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		queue.add(vertex);
		
		while(queue.size()!=0) {
			vertex = queue.poll();
			System.out.print(vertex+" ");
			
			Iterator<Integer> it = adjList[vertex].listIterator();
			while(it.hasNext()) {
				int nextElement = it.next();
				if(!visited[nextElement]) {
					visited[nextElement] = true;
					queue.add(nextElement);
				}
			}
		}
		
	}

}
