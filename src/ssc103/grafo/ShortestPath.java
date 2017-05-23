package ssc103.grafo;

import java.io.IOException;

/**
 * Esta classe recebe da entrada as arestas de um grafo direcionado e valorado e procura o menor caminho entre
 * dois vértices específicos, por meio do algoritmo de Dijkstra.
 * @author Fábio Romanini
 * @author Gabriel Pupo
 */
public class ShortestPath {
	public static void main(String[] args) throws IOException {
		int edges, weight; // número de vértices e de arestas
		String source, destiny, from, to;

		System.out.print("Entre com o número de arestas do grafo: ");
		edges = EntradaTeclado.leInt();

		Graph g = new Graph();
		
		System.out.print("\n\n");
		for (int i = 0; i < edges; i++) {
			System.out.print("Vértice de origem: ");
			from = EntradaTeclado.leString();
			System.out.print("Vértice de destino: ");
			to = EntradaTeclado.leString();
			System.out.print("Peso da aresta: ");
			weight = EntradaTeclado.leInt();
			
			g.addEdge(from, to, weight);
			System.out.println("\n");
		}
		
		System.out.print("Insira a origem do caminho: ");
		source = EntradaTeclado.leString();
		
		System.out.println("Insira o destino do caminho: ");
		destiny = EntradaTeclado.leString();
		
		int dist = Dijkstra.getShortestPath(g, source, destiny);
		System.out.println("A distância de " + source + " a " + destiny + " é " + dist);
	}
}