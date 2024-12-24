import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> foo = new ArrayList<Integer>();
        // foo.add(5);
        foo.add(1);
        foo.add(3);
        foo.add(4);
        foo.add(2);
        Sort.partition(foo, 0, 3);
        System.out.println("END:" + foo);
    }
}
