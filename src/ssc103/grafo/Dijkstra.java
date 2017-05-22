package ssc103.grafo;

import java.util.PriorityQueue;

public class Dijkstra {
	public static void getShortestPath(Graph g, Vertex source) {
		PriorityQueue<Vertex> Q = new PriorityQueue<Vertex>();
		
		int n_v = g.getVertexNumber();
		int dist[] = new int[n_v];
		int pred[] = new int[n_v];
		
		for (int i = 0; i < n_v; i++) {
			dist[i] = Integer.MAX_VALUE;
			pred[i] = -1;
			Q.add(new Vertex(i)); // add um vértice de g
		}
		
		dist[source.getName()] = 0;
		while (Q.size() != 0) {
			Vertex min = Q.poll();
			
		}
		
	}
}
