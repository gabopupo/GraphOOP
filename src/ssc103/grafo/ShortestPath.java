package ssc103.grafo;

import java.io.IOException;

public class ShortestPath {

	public static void main(String[] args) throws IOException {
		int vertices, edges; // número de vértices e de arestas
		int from, to, weight; // saída, destino e peso de cada aresta
		int source;
		
		vertices = EntradaTeclado.leInt();
		edges = EntradaTeclado.leInt();
		
		for (int i = 0; i < edges; i++) {
			from = EntradaTeclado.leInt();
			to = EntradaTeclado.leInt();
			weight = EntradaTeclado.leInt();
			
			Edge e = new Edge(from, to, weight);
			// inserir "e" no grafo
		}
		
		System.out.print("Insira o vértice de partida: ");
		source = EntradaTeclado.leInt();
		
		Dijkstra.getShortestPath(g, source);

	}

}
