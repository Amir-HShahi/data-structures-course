import java.util.EmptyStackException;

public class Stack {
    private int capacity = 3;
    private Object[] stack = new Object[capacity];
    private int top = 0;

    public Boolean isEmpty() {
        return top == 0;
    }

    public Boolean isFull() {
        return top == capacity;
    }

    public void push(Object object) {
        if (isFull())
            throw new StackOverflowError("Stack is full");

        stack[top++] = object;
    }

    public Object pop() {
        if (isEmpty())
            throw new EmptyStackException();

        Object poppedObject = stack[--top];
        stack[top] = null;
        return poppedObject;
    }
}
