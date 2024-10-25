public class Main {
    public static void main(String[] args) {
        try {
            int sequenceValue = Fibonacci.getValueOf(-1);
            System.out.println(sequenceValue);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
