package ssc103.grafo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 * Esta classe implementa o algoritmo de Dijkstra para encontrar o menor
 * caminho entre dois vértices em um grafo direcionado e valorado.
 * @author Fábio Romanini
 * @author Gabriel Pupo
 */

public class Dijkstra {	
	/**
	 * Retorna o vértice mais próximo a um outro vértice adjacente.
	 * @param vertSet o set de vértices adjacentes a um vértice em comum
	 * @return um vértice
	 */
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
	/**
	 * Executa o algoritmo de Dijkstra.
	 * @param g um grafo direcionado e valorado.
	 * @param source o vértice de origem
	 * @param destiny o vértice de destino
	 * @return a menor distância entre o vértice de origem e o de destino
	 */
	public static int getShortestPath(Graph g, String source, String destiny) {
		TreeSet<String> vertexes = g.getVertexes(); // to be implemented
		HashMap<String, Integer> vertSet = new HashMap<>();
		HashMap<String, Integer> dist = new HashMap<>(); // distâncias até a origem
		HashMap<String, String> pred = new HashMap<>(); // predecessores

		for (String v: vertexes) {
			dist.put(v, Integer.MAX_VALUE);
			pred.put(v, null);
			vertSet.put(v, Integer.MAX_VALUE); // add um vértice de g ao set de vértices
		}
		
		if (dist.containsKey(source)) {
			dist.replace(source, 0);
			vertSet.replace(source, 0); // atualizar a distância da origem
		}
		
		while (vertSet.size() != 0) {
			String min = Dijkstra.getMin(vertSet); // pega o vértice de menor distância
			vertSet.remove(min); // remove-o do set de vértices do grafo
			ArrayList<Edge> adjacents = g.getAdjacents(min); // pega os seus adjacentes
			
			for (Edge adj: adjacents) {
				int alt = dist.get(min) + adj.getWeight();
				if (alt < dist.get(adj.getTo())) {
					dist.replace(adj.getTo(), alt);
					vertSet.replace(adj.getTo(), alt);
					pred.replace(adj.getTo(), min);
				}
			}
		}
		
		return dist.get(destiny);
	}
}