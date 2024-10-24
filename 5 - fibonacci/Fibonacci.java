public class Fibonacci {
    public static int getValueOf(int index) throws IllegalAccessException {
        if ((index == 1) || (index == 0)) 
            return index;
        if (index < 0) {
            throw new IllegalAccessException("index can't be negative!");
        }    
        return getValueOf(index - 1) + getValueOf(index - 2);
    }
}
