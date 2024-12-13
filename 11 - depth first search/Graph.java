import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
    private int size;
    private List<Vertex> vertexes;

    public Graph(int size) {
        this.size = size;
        vertexes = new LinkedList<Vertex>();
        initializeVertexes();
    }

    private void initializeVertexes() {
        for (int i = 0; i < this.size; i++) {
            vertexes.add(new Vertex(i));
        }
    }

    public void addEdge(int firstVertex, int secondVertex) {
        vertexes.get(firstVertex).connectToVertex(vertexes.get(secondVertex));
        vertexes.get(secondVertex).connectToVertex(vertexes.get(firstVertex));
    }

    public void removeEdge(int firstVertex, int secondVertex) {
        if (firstVertex == secondVertex) 
            return;
        
        vertexes.get(firstVertex).disconnectFromVertex(vertexes.get(secondVertex));
        vertexes.get(secondVertex).disconnectFromVertex(vertexes.get(firstVertex));
    }

    public boolean Search(String name) {
        depthFirstSearch(vertexes.get(0));
        breadthFirstSearch(vertexes.get(0));
        return true;
    }

    public void depthFirstSearch(Vertex firstVertex) {
        System.out.print(firstVertex.getName() + ", ");
        firstVertex.isVisited = true;

        for (Vertex vertex : firstVertex.connectedVertexes) {
            if (!vertex.isVisited) {
                depthFirstSearch(vertex);
            }
        }
    }

    public void breadthFirstSearch(Vertex firstVertex) {
        Queue<Vertex> queue = new LinkedList<>();
        
        firstVertex.isVisited = true;
        queue.add(firstVertex);
        
        while (!queue.isEmpty()) {
            int current = queue.poll().getName();
            System.out.print(current + " ");
            for (Vertex x : vertexes.get(current).connectedVertexes) {
                if (!x.isVisited) {
                    x.isVisited = true;
                    queue.add(x);
                }
            }
        }
    }

    @Override
    public String toString() {
        String graphString = "";
        for (Vertex vertex : vertexes) {
            graphString += vertex.toString();
            graphString += "---------- \n";
        }
        return graphString;
    }
}

class Vertex implements Comparable<Vertex>{
    boolean isVisited = false;
    private int name;
    public List<Vertex> connectedVertexes = new LinkedList<Vertex>();

    public Vertex(int name) {
        this.name = name;
    }

    public int getName() {
        return this.name;
    }

    public void connectToVertex(Vertex vertex) {
        connectedVertexes.add(vertex);
        Collections.sort(connectedVertexes);
    }

    public void disconnectFromVertex(Vertex vertex) {
        connectedVertexes.remove(vertex);
    }

    @Override
    public int compareTo(Vertex o) {
        int gg = name - o.getName();
        return gg;
    }
}