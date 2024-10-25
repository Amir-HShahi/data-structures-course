public class Fibonacci {
    public static int getValueOf(int index) throws IllegalArgumentException {
        if (index < 0)
            throw new IllegalArgumentException("index can't be negative!");
        if (index <= 1)
            return index;
        return getValueOf(index - 1) + getValueOf(index - 2);
    }
}
