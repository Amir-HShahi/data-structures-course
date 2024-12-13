import java.util.Random;

public class RandomGraph {
    private int size;
    private double probability;
    private int[][] graph;
    private Random random = new Random();

    public RandomGraph(int size, double probability) {
        this.size = size;
        this.probability = probability;
        graph = new int[size][size];
    }

    public void makeRandomGraph() {
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (getRandomDouble() <= probability) {
                    setEdge(i, j, 1);
                }
            }
        }
    }

    public int getEdgeCount() {
        int edgeCount = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (graph[i][j] == 1) {
                    edgeCount++;
                }
            }
        }
        return edgeCount;
    }

    private void setEdge(int i, int j, int value) {
        graph[i][j] = value;
        graph[j][i] = value;
    }

    private double getRandomDouble() {
        return random.nextDouble();
    }

    @Override
    public String toString() {
        String graphString = "";
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                graphString += graph[i][j] + ", ";
            }
            graphString += "\n";
        }

        return graphString;
    }

}