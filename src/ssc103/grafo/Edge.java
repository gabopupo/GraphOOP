package ssc103.grafo;

public class Edge { // aresta direcionada
	private String from, to;
	private int weight;
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
	
	public Edge(String name1, String name2, int weight) {
		from = name1;
		to = name2;
		this.weight = weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}