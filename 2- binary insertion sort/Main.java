import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> foo = new LinkedList<Integer>();
        for (int i = 2; i > 0; i--) {
            foo.add(i);
        }
        Sort.insertion(foo);
        for (int string : foo) {
            System.out.println(string);
        }
    }
}