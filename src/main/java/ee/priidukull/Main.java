package ee.priidukull;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Node> graph = Initiation.generateGraph();
        GraphSearch gs = new GraphSearch(graph);
        boolean found = gs.depthFirstSearch("G");
        System.out.println(found);
    }
}
