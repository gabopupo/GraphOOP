package ssc103.grafo;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Esta classe representa um grafo valorado e direcionado, representado por um TreeSet (uma coleção
 * que consiste em uma árvore rubro-negra que implementa a interface SortedList, ordenando todos os
 * elementos que insere automaticamente).
 * 
 * @author Fábio Romanini
 * @author Gabriel Pupo
 */
public class Graph extends TreeSet<Edge> {
	private TreeSet<String> vertex;
	
	/**
	 * Inicializa um grafo.
	 */
	public Graph() {
		super();
		vertex = new TreeSet<String>();
	}
	/**
	 * Retorna todos os vértices do grafo.
	 * @return um TreeSet contendo os vértices
	 */
	public TreeSet<String> getVertexes() {
		return vertex;
	}
	/**
	 * Retorna a aresta que pertence ao grafo e obedece aos parâmetros fornecidos.
	 * @param from o vértice de origem da aresta
	 * @param to o vértice de destino da aresta
	 * @param weight o peso da aresta
	 * @return uma aresta, se encontrada. Caso contrário, retorna null.
	 */
	public Edge get(String from, String to, Integer weight) {
		for(Edge e : this) {
			if(e.getFrom().equals(from) && e.getTo().equals(to) && e.getWeight() == weight)
				return e;
		}
		
		return null;
	}
	/**
	 * Adiciona uma aresta ao grafo, e seus vértices a um set.
	 * @param from o vértice de origem da aresta
	 * @param to o vértice de destino da aresta
	 * @param weight o peso da aresta
	 */
	public void addEdge(String from, String to, Integer weight) {
		vertex.add(from);
		vertex.add(to);

		add(new Edge(from, to, weight));
	}
	/**
	 * Retorna uma lista de arestas adjacentes a um determinado vértice.
	 * @param v um vértice
	 * @return uma lista de arestas
	 */
	public ArrayList<Edge> getAdjacents(String v) {
		ArrayList<Edge> adj = new ArrayList<>();
		
		for(Edge e : this) {
			if (e.getFrom().equals(v))
				adj.add(e);
		}
		
		return adj;
	}
}
