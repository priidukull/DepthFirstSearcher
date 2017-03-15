package ee.priidukull;

import java.util.HashSet;
import java.util.Set;

class Node {
    private Set<Node> relationships;
    private boolean visited;
    private String value;

    public Set<Node> getRelationships() {
        return relationships;
    }

    public void setRelationships(Set<Node> relationships) {
        this.relationships = relationships;
    }

    boolean getVisited() {
        return visited;
    }

    void setVisited(boolean visited) {
        this.visited = visited;
    }

    String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    void addReleationship(Node node) {
        relationships.add(node);
    }

    Node getUnvisitedRelation() {
        for (Node n : relationships) {
            if (!n.getVisited()) {
                return n;
            }
        }
        return null;
    }

    Node(String value) {
        this.value = value;
        this.visited = false;
        this.relationships = new HashSet<Node>();
    }

    public String toString() {
        return value;
    }
}
