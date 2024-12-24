import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> foo = new ArrayList<Integer>();
        int[] arr = {12, 45, 3, 89, 34, 67, 23, 9, 56, 78};
        for (int i : arr) {
            foo.add(i);
        }
        Sort.quick(foo);
        System.out.println(foo);
    }
}
