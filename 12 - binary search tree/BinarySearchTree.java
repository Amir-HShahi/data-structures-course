public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> rootNode;

    public void add(T data) {
        this.rootNode = addDataHandler(this.rootNode, data);
    }

    private Node<T> addDataHandler(Node<T> rootNode, T key) {
        if (rootNode == null)
            rootNode = new Node<T>(key);

        if (rootNode.data.compareTo(key) < 0) {
            rootNode.rightNode = addDataHandler(rootNode.rightNode, key);
        } else if (rootNode.data.compareTo(key) > 0) {
            rootNode.leftNode = addDataHandler(rootNode.leftNode, key);
        }

        return rootNode;
    }

    @Override
    public String toString() {
        return inorderToString(this.rootNode);
    }

    private String inorderToString(Node<T> root) {
        String inorderString = "";
        if (root != null) {
            String leftInorder = inorderToString(root.leftNode);
            inorderString += leftInorder + " ";
            inorderString += root.data + " ";
            String rightInorder = inorderToString(root.rightNode);
            inorderString += rightInorder + "";
        }
        return inorderString;
    }
}

class Node<T extends Comparable<T>> {
    Node<T> leftNode;
    Node<T> rightNode;
    T data;

    Node(T data) {
        this.data = data;
    }
}