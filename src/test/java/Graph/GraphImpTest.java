package Graph;

import Graphs.Graph;
import org.junit.Test;

public class GraphImpTest {
    @Test
    public void printsGraph() {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(3,0);

        graph.printGraph();


    }
}
