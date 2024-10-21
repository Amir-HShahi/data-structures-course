import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 10; i > -1; i--) {
            integers.add(i);
        }
        // sort a list of integers with insertion algorithm
        Sort.insertion(integers);
        System.out.println(integers.toString());

        LinkedList<String> strings = new LinkedList<>();
        for (int i = 90; i > 64; i--) {
            strings.add(Character.toString((char) i));
        }
        // sort a list of strings with insertion algorithm
        Sort.insertion(strings);
        System.out.println(strings.toString());
    }

}