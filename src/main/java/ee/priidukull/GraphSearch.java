package ee.priidukull;

import java.util.ArrayList;
import java.util.List;

class GraphSearch {
    private List<Node> graph;

    GraphSearch(List<Node> graph) {
        this.graph = graph;
    }

    boolean depthFirstSearch(String s) {
        List<Node> stack = new ArrayList<Node>();
        Node currentNode = graph.get(0);
        while (true) {
            if (currentNode.getValue().equals(s)) {
                return true;
            }
            currentNode.setVisited(true);
            Node nextNode = currentNode.getUnvisitedRelation();
            if (nextNode == null) {
                if (stack.size() == 0) {
                    return false;
                }
                currentNode = stack.get(stack.size() - 1);
                stack.remove(currentNode);
            } else {
                if (!stack.contains(currentNode)) {
                    stack.add(currentNode);
                }
                currentNode = nextNode;
            }
        }
    }
}
