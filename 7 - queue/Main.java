public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        try {
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            queue.dequeue();
            queue.dequeue();
            // queue.dequeue();
            queue.enqueue(1);
            queue.enqueue(2);
            queue.enqueue(3);
        }
        
    }
}