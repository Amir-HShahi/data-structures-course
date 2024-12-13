public class Main {
    public static void main(String[] args) {
        Graph foo = new Graph(6);
        foo.addEdge(0, 1);
        foo.addEdge(0, 2);
        foo.addEdge(1, 3);
        foo.addEdge(1, 5);
        // foo.addEdge(4, 5);
        // foo.addEdge(3, 5);
        // foo.addEdge(4, 3);
        foo.addEdge(4, 5);
        // System.out.println(foo);
        foo.Search(null);
    }
}
