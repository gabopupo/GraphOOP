package ssc103.grafo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ShortestPathTest {

	@Test
	public void testMain() throws IOException {
		ShortestPath.main(null);
		Graph g = DijkstraTest.criaGrafo();
		DijkstraTest.test(g);
		
		GraphTest.test();
	}

}

/*
 * Inserir para o teste:
 *  3
 *  1
 *  2
 *  3
 *  2
 *  4
 *  5
 *  4
 *  7
 *  3
 *  1
 *  7
*/
