package ssc103.grafo;

import java.io.IOException;

public class ShortestPath {

	public static void main(String[] args) throws IOException {

		int dist[];
		int vertexes, edges; // número de vértices e de arestas
		int weight; // saída, destino e peso de cada aresta
		int source;
		String from, to;
		
		vertexes = EntradaTeclado.leInt();
		edges = EntradaTeclado.leInt();
		
		for (int i = 0; i < edges; i++) {
			from = EntradaTeclado.leString();
			to = EntradaTeclado.leString();
			weight = EntradaTeclado.leInt();
			
			g.addEdge(from, to, weight);
			// inserir "e" no grafo
		}
		
		System.out.print("Insira o vértice de partida: ");
		source = EntradaTeclado.leInt();
		
		dist = Dijkstra.getShortestPath(new Graph(), source);
		
		System.out.println("Distâncias até a origem:");
		for (int i = 0; i < vertexes; i++) {
			System.out.println(i + "\t->\t" + dist[i]);
		}
	}

}
