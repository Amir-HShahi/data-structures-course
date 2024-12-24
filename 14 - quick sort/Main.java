import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Character> foo = new ArrayList<Character>();
        char[] arr = "Burgerman".toCharArray();
        for (char i : arr) {
            foo.add(i);
        }
        Sort.quick(foo);
        System.out.println(foo);
    }
}
