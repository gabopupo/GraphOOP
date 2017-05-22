package ssc103.grafo;

import java.util.ArrayList;
import java.util.TreeSet;


public class Graph extends TreeSet<Edge> {
	private TreeSet<String> vertex;
	
	public Graph() {
		super();
	}
	
	public TreeSet<String> getVertexes() {
		return vertex;
	}
	
	public Edge get(String from, String to, Integer weight) {
		for(Edge e : this) {
			if(e.getFrom().equals(from) && e.getFrom().equals(to))
				return e;
		}
		
		return null;
	}
	
	public void addEdge(String from, String to, Integer weight) {
		Edge e = get(from, to, weight);
		if(e != null)
			e.setWeight(weight);
		
		else {
			
			if(!vertex.contains(from)) vertex.add(from);
			if(!vertex.contains(to)) vertex.add(to);

			add(new Edge(from, to, weight));
		}	
	}
	
	public ArrayList<Edge> getAdjacents(String v) {
		ArrayList<Edge> adj = new ArrayList<>();
		
		for(Edge e : this)
			if(e.getFrom().equals(v))
				adj.add(e);
		
		return adj;
	}
}
