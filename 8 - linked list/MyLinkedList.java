public class MyLinkedList<T> {
    private int size = 0;
    private Node<T> firstNode;
    private Node<T> lastNode;

    public MyLinkedList() {
        firstNode = new Node<T>(null);
        lastNode = firstNode;
    }

    public int size() {
        return size;
    }

    public void add(T object) {
        if (size == 0) {
            firstNode.setData(object);
        } else {
            Node<T> newNode = new Node<T>(object);
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException(index);

        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getData();
    }

    public void delete(T object) {
        Node<T> previousNode = null;
        Node<T> currentNode = firstNode;
        if (firstNode.getData() == object) {
            firstNode = firstNode.getNext();
            size--;
            return;
        }

        while ((currentNode != null) && (currentNode.getData() != object)) {
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }

        if (currentNode == null) {
            return;
        }

        previousNode.setNext(currentNode.getNext());
        if (currentNode == lastNode) {
            lastNode = previousNode;
        }
        size--;

    }

}

class Node<T> {
    private T data;
    private Node<T> next;

    Node(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
}