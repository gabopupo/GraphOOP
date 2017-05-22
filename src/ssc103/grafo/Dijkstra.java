package ssc103.grafo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class Dijkstra {	
	private static String getMin(HashMap<String, Integer> vertSet) {
		Iterator it = vertSet.entrySet().iterator();
		String minimum = null;
		int min_val = Integer.MAX_VALUE;
		
		while(it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			
			if ((int) pair.getValue() < min_val) {
				min_val = (int) pair.getValue();
				minimum = (String) pair.getKey();
			}
		}
		
		return minimum;
	}
	
	public static int getShortestPath(Graph g, String source, String destiny) {
		//PriorityQueue<String> Q = new PriorityQueue<String>();
		TreeSet<String> vertexes = g.getVertexes(); // to be implemented
		HashMap<String, Integer> vertSet = new HashMap<>();
		HashMap<String, Integer> dist = new HashMap<>(); // distâncias até a origem
		HashMap<String, String> pred = new HashMap<>(); // predecessores

		for (String v: vertexes) {
			dist.put(v, Integer.MAX_VALUE);
			pred.put(v, null);
			vertSet.put(v, Integer.MAX_VALUE); // add um vértice de g à fila de prioridades
		}
		
		if (dist.containsKey(source)) {
			vertSet.replace(source, 0); // atualizar a distância da origem
		}
		
		while (vertSet.size() != 0) {
			String min = Dijkstra.getMin(vertSet);
			vertSet.remove(min);
			
			ArrayList<Edge> adjacents = g.getAdjacents(min);
			for (Edge adj: adjacents) {
				System.out.println(adj.getFrom() + " adjacente a " + adj.getTo() + " com peso " + adj.getWeight());
				int alt = dist.get(min) + adj.getWeight(); // + distancia do vertice ao adjacente
				if (alt < dist.get(adj.getTo())) {// if alt < dist.get(adj);
					dist.replace(adj.getTo(), alt);
					pred.replace(adj.getTo(), min);
				}
			}
		}
		return dist.get(destiny);
	}
}