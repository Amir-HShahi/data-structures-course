public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            System.out.println(stack);
        } catch (StackOverflowError e) {
            System.out.println(e.getMessage());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            stack.pop();
        }
    }
}
