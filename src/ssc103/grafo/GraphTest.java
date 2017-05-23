package ssc103.grafo;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTest {

	@Test
	public static void test() {
		Graph g = new Graph();
		
		g.addEdge("Sao Paulo", "Rio de Janeiro", 300);
		g.addEdge("Rio de Janeiro", "Sao Paulo", 300);

		g.addEdge("Curitiba", "Sao Paulo", 700);
		g.addEdge("Sao Paulo", "Curitiba", 700);

		g.addEdge("Sergipe", "Rio de Janeiro", 1200);
		g.addEdge("Rio de Janeiro", "Sergipe", 1200);
		
		System.out.println("Vertices presentes: " + g.getVertexes());
		
		System.out.println("Vertices ligadas a Rio de Janeiro: " + g.getAdjacents("Rio de Janeiro"));
		
		g.get("Curitiba", "Sao Paulo", 200);
		g.get("Curitiba", "Sao Jose", 200);
		g.get("Jaboticabal", "Sao Paulo", 200);
		System.out.println(g.get("Rio de Janeiro", "Sao Paulo", 300).getFrom());
	}

}
