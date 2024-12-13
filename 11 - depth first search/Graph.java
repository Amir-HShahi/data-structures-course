import java.util.LinkedList;
import java.util.List;

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
            vertexes.add(new Vertex(i + ""));
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
    private String name;
    private List<Vertex> connectedVertexes = new LinkedList<Vertex>();

    public Vertex(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void connectToVertex(Vertex vertex) {
        connectedVertexes.add(vertex);
    }

    public void disconnectFromVertex(Vertex vertex) {
        connectedVertexes.remove(vertex);
    }

    @Override
    public String toString() {
        String vertexString = "";
        for (Vertex vertex : connectedVertexes) {
            vertexString += this.name + " ---> " + vertex.getName() + "\n";
        }
        return vertexString;
    }
}