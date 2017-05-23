package ssc103.grafo;

import org.junit.*;


public class DijkstraTest {
	static Graph g;
	
	@BeforeClass
	public static Graph criaGrafo() {
		g = new Graph();

		g.addEdge("1", "2", 2);
		g.addEdge("1", "3", 6);
		g.addEdge("1", "4", 5);
		g.addEdge("2", "3", 3);
		g.addEdge("3", "5", 1);
		g.addEdge("4", "3", 4);
		g.addEdge("4", "2", 2);
		g.addEdge("4", "5", 3);

		return g;
	}
	@Test
	public static void test(Graph g) {
		String source = "1";
		String destiny = "5";
		
		Integer dist = Dijkstra.getShortestPath(g, source, destiny);
//		if(dist == 6) System.out.println("Deu bom!");
	}

}
