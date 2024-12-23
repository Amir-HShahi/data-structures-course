import java.util.Collections;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node<T> rootNode;

    public void toAVLTree(List<T> list) {
        Collections.sort(list);
        this.rootNode = toAVLTreeHandler(list, 0, list.size() - 1);
    }

    private Node<T> toAVLTreeHandler(List<T> list, int start, int end) {
        Node<T> rootNode = null;
        if (start > end)
            return rootNode;

        if (start == end) {
            rootNode = new Node<T>(list.get(end));
            return rootNode;
        }

        int mid = (start + end) / 2;
        rootNode = new Node<T>(list.get(mid));
        rootNode.rightNode = toAVLTreeHandler(list, mid + 1, end);
        rootNode.leftNode = toAVLTreeHandler(list, start, mid - 1);

        return rootNode;
    }

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

    public Boolean contains(T data) {
        return containsHandler(this.rootNode, data);
    }

    private Boolean containsHandler(Node<T> rootNode, T key) {
        if (rootNode == null) {
            return false;
        }

        if (rootNode.data == key) {
            return true;
        }

        if (rootNode.data.compareTo(key) > 0) {
            return containsHandler(rootNode.leftNode, key);
        }

        return containsHandler(rootNode.rightNode, key);
    }

    public int getMaxDepth() {
        return getMaxDepthHandler(this.rootNode);
    }

    private int getMaxDepthHandler(Node<T> rootNode) {
        if (rootNode == null) {
            return 0;
        }
        if (rootNode.leftNode == null && rootNode.rightNode == null) {
            return 1;
        }

        return getMaxDepthHandler(rootNode.leftNode) >= getMaxDepthHandler(rootNode.rightNode)
                ? getMaxDepthHandler(rootNode.leftNode) + 1
                : getMaxDepthHandler(rootNode.rightNode) + 1;
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