package ssc103.grafo;

public class Edge { // aresta direcionada
	private Vertex from, to;
	private int weight;
	
	public Edge(Vertex from, Vertex to, int weight) {
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	
	public Edge(int name1, int name2, int weight) {
		from = new Vertex(name1);
		to = new Vertex(name2);
		this.weight = weight;
	}
	
	public Vertex[] getNodes() {
		Vertex[] nodes = new Vertex[2];
		nodes[0] = from;
		nodes[1] = to;
		return nodes;
	}
	
	public void updateWeight(int new_weight) {
		weight = new_weight;
	}
	
	public int getWeight() {
		return weight;
	}
}