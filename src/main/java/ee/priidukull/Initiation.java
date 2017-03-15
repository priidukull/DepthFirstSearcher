package ee.priidukull;

import java.util.Arrays;
import java.util.List;

public class Initiation {
    static List<Node> generateGraph() {
        Node a = new Node("A");
        Node b = new Node("B");
        Node c = new Node("C");
        Node d = new Node("D");
        Node e = new Node("E");
        Node f = new Node("F");
        Node g = new Node("G");
        Node h = new Node("H");
        createRelationship(a, b);
        createRelationship(a, c);
        createRelationship(b, d);
        createRelationship(b, e);
        createRelationship(b, f);
        createRelationship(c, g);
        createRelationship(g, h);
        return Arrays.asList(a, b, c, d, e, f, g, h);
    }

    private static void createRelationship(Node parent, Node child) {
        parent.addReleationship(child);
        child.addReleationship(parent);
    };
}
