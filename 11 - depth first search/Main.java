public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 0);
        g.addEdge(0, 2);
        g.addEdge(3, 1);
        g.addEdge(2, 4);
        g.addEdge(1, 4);
        // System.out.println(g.depthFirstSearch(0));
        System.out.println(g.breadthFirstSearch(0));
    }
}
