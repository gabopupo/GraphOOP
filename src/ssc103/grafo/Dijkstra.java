package ssc103.grafo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Dijkstra {
	public static HashMap<String, Integer> getShortestPath(Graph g, String source) {
		PriorityQueue<Vertex> Q = new PriorityQueue<Vertex>();
		TreeSet<Vertex> vertexes = g.getVertexes(); // to be implemented
		HashMap<String, Integer> dist = new HashMap<>(); // distâncias até a origem
		HashMap<String, String> pred = new HashMap<>(); // predecessores
		
		for (Vertex v: vertexes) {
			dist.put(v.getName(), Integer.MAX_VALUE);
			pred.put(v.getName(), null);
			Q.add(v); // add um vértice de g à fila de prioridades
		}
		
		if (dist.containsKey(source)) 	dist.replace(source, 0); // atualizar a distância da origem
		
		while (Q.size() != 0) {
			Vertex min = Q.poll();
			// para cada vértice adjacente a min:
				int alt = dist.get(min.getName()); // + distancia do vertice ao adjacente
				// if alt < dist.get(adj);
					dist.replace("", alt);
					pred.replace("", min.getName());
		}
		
		return dist;
	}
}
