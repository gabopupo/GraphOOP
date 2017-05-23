package ssc103.grafo;

import java.io.IOException;
import java.util.TreeSet;

public class ShortestPath {
	public static void main(String[] args) throws IOException {
		int edges, weight; // número de vértices e de arestas
		String source, destiny, from, to;

//		edges = EntradaTeclado.leInt();

		Graph g = new Graph();
		
//		for (int i = 0; i < edges; i++) {
//			System.out.println("from:");
//			from = EntradaTeclado.leString();
//			System.out.println("to:");
//			to = EntradaTeclado.leString();
//			System.out.println("peso:");
//			weight = EntradaTeclado.leInt();
//			
//			g.addEdge(from, to, weight);
//		}
		
		g.addEdge("1", "2", 2);
		g.addEdge("1", "3", 6);
		g.addEdge("1", "4", 5);
		g.addEdge("2", "3", 3);
		g.addEdge("3", "5", 1);
		g.addEdge("4", "3", 4);
		g.addEdge("4", "2", 2);
		g.addEdge("4", "5", 3);
		
		System.out.print("Insira o vértice de partida: ");
		source = EntradaTeclado.leString();
		
		System.out.println("Insira o vértice de destino: ");
		destiny = EntradaTeclado.leString();
		
		int dist = Dijkstra.getShortestPath(g, source, destiny);
		System.out.println("Distância de " + source + " a " + destiny + ": " + dist);
	}
}