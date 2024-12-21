import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

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

    public String depthFirstSearch(Integer startVertexIndex) {
        markAllVertexesAsUnvisited();
        Stack<Vertex> stack = new Stack<Vertex>();
        stack.push(this.vertexes.get(startVertexIndex));

        String dfsString = "";
        while (!stack.isEmpty()) {
            Vertex poppedVertex = stack.pop();
            dfsString += !poppedVertex.isVisited ? poppedVertex.getName() + " " :  "";
            poppedVertex.isVisited = true;

            for (Vertex vertex : poppedVertex.connectedVertexes) {
                if (!vertex.isVisited) {
                    stack.push(vertex);
                }
            }
        }
        return dfsString;
    }

    public String breadthFirstSearch(Integer startVertexIndex) {
        markAllVertexesAsUnvisited();
        Vertex firstVertex = this.vertexes.get(startVertexIndex);
        Queue<Vertex> queue = new LinkedList<>();
        
        firstVertex.isVisited = true;
        queue.add(firstVertex);
        String bfsString = "";
        while (!queue.isEmpty()) {
            Vertex current = queue.poll();
            bfsString += current.getName() + " ";
            for (Vertex x : current.connectedVertexes) {
                if (!x.isVisited) {
                    x.isVisited = true;
                    queue.add(x);
                }
            }
        }
        return bfsString;
    }

    private void markAllVertexesAsUnvisited() {
        for (Vertex vertex : vertexes) {
            vertex.isVisited = false;
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

class Vertex {
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
    }

    public void disconnectFromVertex(Vertex vertex) {
        connectedVertexes.remove(vertex);
    }
}