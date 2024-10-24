public class Main {
    public static void main(String[] args) {
        try {
            int sequenceValue = Fibonacci.getValueOf(8);
            System.out.println(sequenceValue);
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
