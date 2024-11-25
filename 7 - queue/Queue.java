public class Queue {
    private int head = 0;
    private int tail = 0;
    private int size = 3;
    private Object[] queue = new Object[size];

    public Boolean isFull() {
        return head == (tail + 1) || ((head == 0) && (tail == size - 1));
    }

    public Boolean isEmpty() {
        return tail == head;
    }

    public void enqueue(Object object) {
        if (isFull())
            throw new RuntimeException("Queue is full");

        queue[tail] = object;
        tail = (tail + 1) % size;
    }

    public Object dequeue() {
        if (isEmpty())
            throw new RuntimeException("Queue is empty");

        Object dequeuedObject = queue[head];
        queue[head] = null;
        head = (head + 1) % size;
        return dequeuedObject;
    }
}
