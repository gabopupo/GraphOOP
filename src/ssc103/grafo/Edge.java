package ssc103.grafo;

/**
 * Esta classe representa uma aresta de um grafo valorado e direcionado. Implementa a interface Comparable a fim
 * de comparar as arestas colocadas num grafo e garantir que nenhuma aresta duplicada seja nela inserida.
 * @author Fábio Romanini
 * @author Gabriel Pupo
 */

public class Edge implements Comparable { // aresta direcionada
	private String from, to;
	private int weight;
	/**
	 * Retorna o vértice de origem da aresta, do qual ela diverge.
	 * @return um vértice
	 */
	public String getFrom() {
		return from;
	}
	/**
	 * Define o vértice de origem da aresta.
	 * @param from um vértice
	 */
	public void setFrom(String from) {
		this.from = from;
	}
	/**
	 * Retorna o vértice de destino da aresta, ao qual ela converge.
	 * @return um vértice
	 */
	public String getTo() {
		return to;
	}
	/**
	 * Define o vértice de destino da aresta.
	 * @param to um vértice
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * Constrói uma aresta valorada e direcionada.
	 * @param name1 nome do vértice de origem
	 * @param name2 nome do vértice de destino
	 * @param weight peso da aresta
	 */
	public Edge(String name1, String name2, int weight) {
		setFrom(name1);
		setTo(name2);
		setWeight(weight);
	}
	/**
	 * Define o peso da aresta.
	 * @param weight um inteiro
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * Retorna o peso da aresta.
	 * @return um inteiro
	 */
	public int getWeight() {
		return weight;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Edge e = (Edge) o;
		
		if((getTo() + getFrom()).equals(e.getTo() + e.getFrom()))
			return 0;
		else
			return 1;
	}
}