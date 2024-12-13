public class Main {
    public static void main(String[] args) {
        double mid = 0;
        for (int i = 0; i < 2000; i++) {
            RandomGraph graph = new RandomGraph(6, 0.5);
            graph.makeRandomGraph();
            mid += graph.getEdgeCount();
        }
        System.out.println(mid / 2000);
    }
}
