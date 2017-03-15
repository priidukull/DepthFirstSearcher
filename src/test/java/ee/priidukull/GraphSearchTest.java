package ee.priidukull;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphSearchTest {
    @Test
    public void depthFirstSearchTest() throws Exception {
        assertEquals(false, new GraphSearch(Initiation.generateGraph()).depthFirstSearch("Z"));
        assertEquals(true, new GraphSearch(Initiation.generateGraph()).depthFirstSearch("A"));
        assertEquals(true, new GraphSearch(Initiation.generateGraph()).depthFirstSearch("B"));
        assertEquals(true, new GraphSearch(Initiation.generateGraph()).depthFirstSearch("C"));
        assertEquals(true, new GraphSearch(Initiation.generateGraph()).depthFirstSearch("D"));
        assertEquals(true, new GraphSearch(Initiation.generateGraph()).depthFirstSearch("E"));
        assertEquals(true, new GraphSearch(Initiation.generateGraph()).depthFirstSearch("F"));
        assertEquals(true, new GraphSearch(Initiation.generateGraph()).depthFirstSearch("G"));
        assertEquals(true, new GraphSearch(Initiation.generateGraph()).depthFirstSearch("H"));
    }
}
