import edu.princeton.cs.algs4.Graph;

public class Test {
    public static void main(String[] args) {
        Graph G = new Graph(13);
        G.addEdge(0, 1);
        G.addEdge(3, 2);
        G.addEdge(3, 5);
        G.addEdge(4, 3);
        G.addEdge(4, 2);
        G.addEdge(6, 9);
        G.addEdge(8, 7);
        G.addEdge(8, 9);
        G.addEdge(9, 11);
        G.addEdge(10, 12);
        G.addEdge(11, 12);
        G.addEdge(12, 9);

        System.out.println("Adjacent: " + RedWhite.count(G, new int[] { 3 }));                                        // should print 3
    }
}
