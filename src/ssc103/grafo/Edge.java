package ssc103.grafo;

public class Edge implements Comparable { // aresta direcionada
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

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Edge e = (Edge) o;
		return this.getTo().charAt(0) - e.getTo().charAt(0);
	}
}